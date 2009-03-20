/* TransferAnnotationTool.java
 *
 * created: 2009
 *
 * This file is part of Artemis
 *
 * Copyright (C) 2009  Genome Research Limited
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package uk.ac.sanger.artemis.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.FeaturePredicate;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.chado.ChadoTransactionManager;
import uk.ac.sanger.artemis.components.genebuilder.GeneEdit;
import uk.ac.sanger.artemis.components.genebuilder.GeneUtils;
import uk.ac.sanger.artemis.io.DatabaseDocumentEntry;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.InvalidRelationException;
import uk.ac.sanger.artemis.io.PartialSequence;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.StringVector;

class TransferAnnotationTool extends JFrame
{
  private static final long serialVersionUID = 1L;
  private static String[] NON_TRANSFERABLE_QUALIFIERS =
  {
    "ID",
    "feature_id",
    "Derives_from",
    "feature_relationship_rank",
    "Parent",
    "isObsolete",
    "timelastmodified",
    "cytoplasm_location",
    "membrane_structure",
    "non_cytoplasm_location",
    "orthologous_to",
    "paralogous_to",
    "PlasmoAP_score",
    "polypeptide_domain",
    "fasta_file",
    "blastp_file",
    "blastn_file",
    "systematic_id",
    "transmembrane",
    "previous_systematic_id"
  };
  
  private static org.apache.log4j.Logger logger4j = 
    org.apache.log4j.Logger.getLogger(TransferAnnotationTool.class);
  
  private Color STEEL_BLUE = new Color(25, 25, 112);
  
  /**
   * Tool for transferring annotation from one feature to other feature(s)
   * @param feature
   * @param entryGroup
   * @param geneNames
   */
  public TransferAnnotationTool(final Feature feature, 
  		                        final EntryGroup entryGroup,
  		                        final List geneNames)
  {
    super("Transfer Annotation Tool :: "
        + feature.getIDString());

    FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
    JPanel panel = new JPanel(flow);
    JPanel pane = new JPanel(new GridBagLayout());
    JScrollPane jsp = new JScrollPane(panel);
    panel.setBackground(Color.white);
    pane.setBackground(Color.white);
    panel.add(pane);
    
    JPanel framePanel = (JPanel)getContentPane();
    framePanel.add(jsp, BorderLayout.CENTER);
    framePanel.setPreferredSize(new Dimension(600,600));
    
    final Vector geneNameCheckBoxes = new Vector();
    final Hashtable qualifierCheckBoxes = new Hashtable();

    addMainPanel(feature, pane, qualifierCheckBoxes, 
                 geneNameCheckBoxes, geneNames);
    addBottomButtons(qualifierCheckBoxes, geneNameCheckBoxes, 
                     framePanel, feature, entryGroup);
    
    pack();
    setVisible(true);
  }
  
  /**
   * Construct the panel for setting up the gene list and the
   * list of qualifiers to transfer.
   * @param feature
   * @param pane
   * @param qualifierCheckBoxes
   * @param geneNameCheckBoxes
   * @param geneNames
   */
  private void addMainPanel(final Feature feature, 
                            final JPanel pane, 
                            final Hashtable qualifierCheckBoxes, 
                            final Vector geneNameCheckBoxes,
                            final List geneNames)
  {
    GridBagConstraints c = new GridBagConstraints();
    int nrows = 0;

    c.anchor = GridBagConstraints.NORTHWEST;
    c.gridx = 2;
    c.gridy = 0;
    c.ipadx = 0;
    
    JLabel geneLabel = new JLabel(feature.getIDString() + " Qualifiers");
    geneLabel.setFont(geneLabel.getFont().deriveFont(Font.BOLD));
    pane.add(geneLabel, c);

    c.gridx = 0;
    JLabel label = new JLabel("Gene List");
    label.setFont(label.getFont().deriveFont(Font.BOLD));
    pane.add(label, c);

    c.gridy = ++nrows;
    c.gridy = ++nrows;
    c.anchor = GridBagConstraints.WEST;
  
    final QualifierVector qualifiers = feature.getQualifiers();
    for(int i = 0; i < qualifiers.size(); i++)
    {
      Qualifier qualifier = ((Qualifier) qualifiers.get(i));

      if(isNonTransferable(qualifier.getName()))
          continue;

      final JCheckBox qualifierNameCheckBox = new JCheckBox(qualifier.getName(), false);
      c.gridx = 1;
      Box qualifierValueBox = Box.createVerticalBox();
      
      JButton detailsShowHide = new JButton("+");
      final Vector qualifierValuesCheckBox = setExpanderButton(detailsShowHide,
          qualifier, qualifierValueBox, qualifierNameCheckBox, pane);
      
      qualifierNameCheckBox.addItemListener(new ItemListener()
      {
        public void itemStateChanged(ItemEvent e)
        {
          for(int i=0; i<qualifierValuesCheckBox.size(); i++)
          {
            JCheckBox cb = (JCheckBox) qualifierValuesCheckBox.get(i);
            cb.setSelected(qualifierNameCheckBox.isSelected());
          }
        }        
      });
      pane.add(detailsShowHide, c);
      c.gridx = 2;

      pane.add(qualifierNameCheckBox, c);
      qualifierCheckBoxes.put(qualifierNameCheckBox, qualifierValuesCheckBox);
      c.gridy = ++nrows;
      pane.add(qualifierValueBox, c);
      c.gridy = ++nrows;
    }

    c.gridx = 0;
    c.gridy = 2;
    c.gridheight = nrows;
    c.fill = GridBagConstraints.BOTH;

    final Box geneNameBox = Box.createVerticalBox();
    pane.add(geneNameBox, c);
    

    if(geneNames != null)
    {
      for(int i = 0; i < geneNames.size(); i++)
      {
        JCheckBox cb = new JCheckBox((String) geneNames.get(i),true);
        geneNameBox.add(cb);
        geneNameCheckBoxes.add(cb);
      }
    }

    c.gridy = 1;
    c.gridheight = 1;
    c.fill = GridBagConstraints.NONE;
    c.gridx = 2;
    final JButton toggle = new JButton("Toggle");
    toggle.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        Enumeration enumQualifiers = qualifierCheckBoxes.keys();
        while(enumQualifiers.hasMoreElements())
        {
          JCheckBox cb = (JCheckBox) enumQualifiers.nextElement();
          cb.setSelected(!cb.isSelected());
        }
      }
    });
    pane.add(toggle, c);
      
    Box xBox = Box.createHorizontalBox();
    final JButton toggleGeneList = new JButton("Toggle");
    toggleGeneList.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        for(int i = 0; i < geneNameCheckBoxes.size(); i++)
        {
          JCheckBox cb = (JCheckBox) geneNameCheckBoxes.get(i);
          cb.setSelected(!cb.isSelected());
        }
      }
    });
    xBox.add(toggleGeneList); 
    
    final JButton addGenes = new JButton("Add");
    addGenes.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        JTextArea geneNameTextArea = new JTextArea();
        geneNameTextArea.setEditable(true);
        JScrollPane jsp = new JScrollPane(geneNameTextArea);
        
        int res = JOptionPane.showConfirmDialog(TransferAnnotationTool.this,
                 jsp, "Paste Features to Add", 
                 JOptionPane.OK_CANCEL_OPTION);
        if(res == JOptionPane.CANCEL_OPTION)
          return;
        
        String geneNames[] = geneNameTextArea.getText().split("\\s");
        for(int i=0;i<geneNames.length; i++)
        {
          if(geneNames[i] == null || geneNames[i].equals(""))
            continue;
           JCheckBox cb = new JCheckBox(geneNames[i],true);
           geneNameBox.add(cb);
           geneNameCheckBoxes.add(cb);
        }
        pane.revalidate();
      }
    });
    xBox.add(addGenes); 
    c.gridx = 0;
    pane.add(xBox, c);  
  }


  /**
   * Add panel for the transfer and close button.
   * @param qualifierCheckBoxes
   * @param geneNameCheckBoxes
   * @param framePanel
   * @param feature
   * @param entryGroup
   */
  private void addBottomButtons(final Hashtable qualifierCheckBoxes,
                                final Vector geneNameCheckBoxes,
                                final JPanel framePanel,
                                final Feature feature, 
                                final EntryGroup entryGroup)
  {
    final JCheckBox sameKeyCheckBox = new JCheckBox("Add to feature of same key", true);
    
    final JCheckBox overwriteCheckBox = new JCheckBox("Overwrite", false);
    overwriteCheckBox.setToolTipText("overwrite rather than append values");
    
    Box buttonBox = Box.createHorizontalBox();
    final JButton transfer = new JButton(">>TRANSFER");
    transfer.setToolTipText("transfer annotation");
    transfer.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        transferAnnotation(qualifierCheckBoxes, geneNameCheckBoxes, feature, 
                entryGroup, sameKeyCheckBox.isSelected(),
                overwriteCheckBox.isSelected());
      }
    });
    Box yBox = Box.createVerticalBox();
    yBox.add(transfer);
    yBox.add(sameKeyCheckBox);
    yBox.add(overwriteCheckBox);
    buttonBox.add(yBox);
    
    final JButton close = new JButton("CLOSE");
    close.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        dispose();
      }
    });
    yBox = Box.createVerticalBox();
    yBox.add(close);
    yBox.add(Box.createVerticalGlue());
    buttonBox.add(yBox);
    buttonBox.add(Box.createHorizontalGlue());
    framePanel.add(buttonBox, BorderLayout.SOUTH);
  }
  
  /**
   * Set up the expander button to display qualifier values.
   * @param butt - expander button
   * @param qualifier - the qualifer that is being displayed
   * @param qualifierValueBox - Box containing the values
   * @param qualifierNameCheckBox - JCheckBox for the given qualifier
   * @param pane
   * @return
   */
  private Vector setExpanderButton(final JButton butt,
                                   final Qualifier qualifier, 
                                   final Box qualifierValueBox,
                                   final JCheckBox qualifierNameCheckBox, 
                                   final JPanel pane)
  {
    butt.setMargin(new Insets(0, 0, 0, 0));
    butt.setHorizontalAlignment(SwingConstants.RIGHT);
    butt.setHorizontalTextPosition(SwingConstants.RIGHT);
    butt.setBorderPainted(false);
    butt.setFont(butt.getFont().deriveFont(Font.BOLD));
    butt.setForeground(STEEL_BLUE);
    
    butt.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        if (butt.getText().equals("+"))
          butt.setText("-");
        else
          butt.setText("+");

        qualifierValueBox.setVisible(butt.getText().equals("-"));
        pane.revalidate();
      }
    });

    // set-up qualifier values list
    qualifierValueBox.setVisible(false);
    Vector qualifierValuesCheckBox = new Vector();
    StringVector values = qualifier.getValues();
    for (int i = 0; i < values.size(); i++)
    {
      JCheckBox cb = new JCheckBox((String) values.get(i),
          qualifierNameCheckBox.isSelected());
      cb.setFont(cb.getFont().deriveFont(Font.ITALIC));
      qualifierValueBox.add(cb);
      qualifierValuesCheckBox.add(cb);
    }
    return qualifierValuesCheckBox;
  }
  
  /**
   * Returns true if this qualifier is non-transferable
   * @param qualifierName
   * @return
   */
  private boolean isNonTransferable(String qualifierName)
  {
    for(int i=0; i<NON_TRANSFERABLE_QUALIFIERS.length; i++)
    {
      if(NON_TRANSFERABLE_QUALIFIERS[i].equals(qualifierName))
        return true;
    }
    return false;
  }
  
  /**
   * Transfer selected qualifiers to the list of features defined
   * by the selected names.
   * @param qualifierCheckBoxes - list of qualifier check boxes
   * @param geneNameTextArea - text with a list of feature names to transfer to
   * @param feature - feature to copy from 
   * @param entryGroup
   * @param sameKey
   * @param overwrite
   */
  private void transferAnnotation(final Hashtable qualifierCheckBoxes, 
  		                          final Vector geneNameCheckBoxes,
  		                          final Feature orginatingFeature,
  		                          final EntryGroup entryGroup,
  		                          final boolean sameKey,
  		                          final boolean overwrite)
  {
  	setCursor(new Cursor(Cursor.WAIT_CURSOR));
    // transfer selected annotation to genes
    final QualifierVector qualifiers = orginatingFeature.getQualifiers();
    final QualifierVector qualifiersToTransfer = new QualifierVector();
    
    Enumeration enumQualifiers = qualifierCheckBoxes.keys();
    while(enumQualifiers.hasMoreElements())
    {
      JCheckBox cb = (JCheckBox) enumQualifiers.nextElement();
      if (cb.isSelected())
      {
        Vector qualifierValuesCheckBox = (Vector)qualifierCheckBoxes.get(cb);
        StringVector values = qualifiers.getQualifierByName(cb.getText()).getValues();
        StringVector valuesToTransfer = new StringVector(values);
        
        logger4j.debug("TRANSFER "+cb.getText());
        for(int i=0; i<qualifierValuesCheckBox.size(); i++)
        {
          JCheckBox valuesCb = (JCheckBox) qualifierValuesCheckBox.get(i);
          if(!valuesCb.isSelected())
          {
            valuesToTransfer.remove(valuesCb.getText());
            logger4j.debug("NOT TRANSFERING "+valuesCb.getText());
          }
        }
        
        if(valuesToTransfer.size() < 1)
          continue;
        qualifiersToTransfer.addElement(new Qualifier(cb.getText(), valuesToTransfer));
      }
    }

    int count = 0;
  	for(int i =0; i<geneNameCheckBoxes.size(); i++)
  	{
  	  if( ((JCheckBox)geneNameCheckBoxes.get(i)).isSelected() )
  	    count++;
  	}
  	
  	if(count < 1)
  	{
  	  setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
  	  JOptionPane.showMessageDialog(this, 
        "No genes selected.", 
        "Warning", JOptionPane.WARNING_MESSAGE);
  	  return;
  	}
  	
  	String geneNames[] = new String[count];
  	count = 0;
  	for(int i =0; i<geneNameCheckBoxes.size(); i++)
    {
  	  JCheckBox cb = (JCheckBox)geneNameCheckBoxes.get(i);
      if( cb.isSelected() )
      {
        geneNames[count] = cb.getText();
        logger4j.debug("TRANSFER ANNOTATION TO "+geneNames[count]);
        count++;
      }
    }
  	//geneNameTextArea.getText().split("\\s");

  	final String key = orginatingFeature.getKey().getKeyString();
  	final FeatureVector features = entryGroup.getAllFeatures();

  	// transfer selected annotation
  	entryGroup.getActionController().startAction();
  	geneNames = transfer(features, qualifiersToTransfer, key, 
  			             sameKey, overwrite, 
  			             GeneUtils.isDatabaseEntry(entryGroup), geneNames);
  	entryGroup.getActionController().endAction();
  	
  	//
  	// Commit changes to genes not in Artemis but in the database
  	//
    DatabaseDocumentEntry db_entry = 
    	(DatabaseDocumentEntry) orginatingFeature.getEntry().getEMBLEntry();
    DatabaseDocument doc = (DatabaseDocument) db_entry.getDocument();
    Vector genesNotFound = null;
    
  	for (int i = 0; i < geneNames.length; i++)
    {
      DatabaseDocumentEntry newDbEntry = GeneEdit.makeGeneEntry(null,
          geneNames[i], doc, null);

      if (newDbEntry == null)
      {
        if (genesNotFound == null)
          genesNotFound = new Vector();
        genesNotFound.add(geneNames[i]);
        continue;
      }

      char[] c = new char[1];
      PartialSequence ps = new PartialSequence(c, 100, 0, null, null);
      newDbEntry.setPartialSequence(ps);
      Entry entry = null;
      try
      {
        entry = new Entry(newDbEntry);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }

      SimpleEntryGroup entry_group = new SimpleEntryGroup();
      entry_group.addElement(entry);

      ChadoTransactionManager ctm = new ChadoTransactionManager();
      entry_group.addFeatureChangeListener(ctm);
      entry_group.addEntryChangeListener(ctm);
      ctm.setEntryGroup(entry_group);

      transfer(entry.getAllFeatures(), qualifiersToTransfer, key, sameKey,
          overwrite, true, geneNames);
      ChadoTransactionManager.commit((DatabaseDocument) newDbEntry
          .getDocument(), false, ctm);

      entry_group.removeFeatureChangeListener(ctm);
      entry_group.removeEntryChangeListener(ctm);
      // if(newDbEntry != null)
      // GeneEdit.showGeneEditor(null, geneNames[i], newDbEntry);
    }
  	
  	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
  	
  	if(genesNotFound != null)
  		JOptionPane.showMessageDialog(this, 
  				"Gene(s) Not Found:\n"+genesNotFound.toString(), 
  				"Gene(s) Not Found", JOptionPane.WARNING_MESSAGE);
  }
  
  /**
   * 
   * @param features
   * @param qualifiersToTransfer
   * @param key
   * @param sameKey
   * @param isDatabaseEntry
   * @param geneNames
   * @return
   */
  private String[] transfer(final FeatureVector features,
                            final QualifierVector qualifiersToTransfer, 
                            final String key,
                            final boolean sameKey,
                            final boolean overwrite,
                            final boolean isDatabaseEntry, 
                            String[] geneNames)
  {
    final TransferFeaturePredicate predicate = new TransferFeaturePredicate(
        key, sameKey, isDatabaseEntry, geneNames);

    for (int i = 0; i < features.size(); i++)
    {
      Feature thisFeature = features.elementAt(i);
      if (predicate.testPredicate(thisFeature))
      {
        for (int j = 0; j < qualifiersToTransfer.size(); j++)
        {
          Qualifier newQualifier = (Qualifier) qualifiersToTransfer.elementAt(j);
          
          try
          {
            if(overwrite)
              thisFeature.setQualifier(newQualifier);
            else
            {
              final StringVector oldValues;
              if (thisFeature.getQualifierByName(newQualifier.getName()) == null)
                oldValues = null;
              else
                oldValues = thisFeature.getQualifierByName(
                    newQualifier.getName()).getValues();

              final Qualifier newQualifierTmp = getQualifierWithoutDuplicateValues(
                  newQualifier, oldValues);
              if (newQualifierTmp == null)
                continue;
              thisFeature.addQualifierValues(newQualifierTmp);
            }
          }
          catch (Exception e1)
          {
            e1.printStackTrace();
          }
        }
        geneNames = removeArrayElement(geneNames, predicate.getGeneName());
      }
    }
    return geneNames;
  }
  
  /**
   * Return a qualifier copy of the qualifier provided that does not contain
   * any of the values in the StringVector.
   * @param newQualifier
   * @param oldValues
   * @return
   * @throws InvalidRelationException
   */
  private Qualifier getQualifierWithoutDuplicateValues( 
      final Qualifier qualifier,
      final StringVector values) throws InvalidRelationException
  {
    final Qualifier newQualifier;
    if (values == null || values.size() < 1)
      newQualifier = qualifier;
    else
    {
      StringVector newValues =  qualifier.getValues();
      StringVector valuesToAdd = new StringVector();
      for (int k = 0; k < newValues.size(); k++)
      {
        if(!values.contains(newValues.get(k)))
          valuesToAdd.add(newValues.get(k));
      }

      if(valuesToAdd.size() == 0)
        return null;
      newQualifier = new Qualifier(qualifier.getName(), valuesToAdd);
    }
    return newQualifier;
  }
  
  /**
   * Remove a string from an array of strings. If the string appears multiple 
   * times in the array this method will delete all occurrences.
   * @param strArr
   * @param str
   * @return
   */
  private String[] removeArrayElement(final String strArr[], final String str)
  {
  	String[] newarray = new String[strArr.length - 1];
  	int count = 0;
  	for(int i=0;i<strArr.length; i++)
  	{
  		if(strArr[i].equals(str))
  			continue;
  		
  	  // not found str return original array
  		if(count>=newarray.length) 
  			return strArr;
  		newarray[count] = strArr[i];
  		count++;
  	}
  	
  	if(count < newarray.length)
  	{
  		String[] tmparray = new String[count];
  		System.arraycopy(newarray, 0, tmparray, 0, count);
  		newarray = tmparray;
  	}
  	
    return newarray;
  }
   
  /**
   * Test if the feature is nominated to have annotation transferred
   * to it.
   */
  class TransferFeaturePredicate implements FeaturePredicate
  {
  	private String geneName;
  	private String key;
  	private boolean sameKey;
  	private boolean isDatabaseEntry;
  	private String[] geneNames;
  	
  	public TransferFeaturePredicate(final String key, 
  			                            final boolean sameKey,
  			                            final boolean isDatabaseEntry,
  			                            final String[] geneNames)
  	{
  		this.key             = key;
  		this.sameKey         = sameKey;
  		this.isDatabaseEntry = isDatabaseEntry;
  		this.geneNames       = geneNames;
  	}
  	
		public boolean testPredicate(Feature targetFeature)
		{
			String targetKey = targetFeature.getKey().getKeyString();
			if(!sameKey || !targetKey.equals(key))
				return false;
			
     	String chadoGeneName = null;
     	if(isDatabaseEntry)
     	{	
     		GFFStreamFeature gffFeature = ((GFFStreamFeature)targetFeature.getEmblFeature());
     		if(gffFeature.getChadoGene() != null)
     		  chadoGeneName = gffFeature.getChadoGene().getGeneUniqueName();
     	}
      	
			String thisFeatureSystematicName = targetFeature.getSystematicName();
			
			for(int i=0;i<geneNames.length;i++)
			{
				if( geneNames[i].equals(thisFeatureSystematicName) ||
						(chadoGeneName != null && geneNames[i].equals(chadoGeneName)) )
				{
					geneName = geneNames[i];
					return true;
				}
			}
			return false;
		}
		
		public String getGeneName()
		{
			return geneName;
		}
  }
 
}
