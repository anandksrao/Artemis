/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:13:12 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ItemListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.KeyChoice;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.KeyVector;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class KeyChoice_ESTest extends KeyChoice_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("Parsing errorhandler options for \"");
      blastEntryInformation0.addKey(key0);
      Key key1 = Key.CDS;
      blastEntryInformation0.addKey(key1);
      KeyChoice keyChoice0 = new KeyChoice(blastEntryInformation0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      Key key0 = new Key("");
      KeyChoice keyChoice0 = new KeyChoice(simpleEntryInformation0, key0);
      keyChoice0.setKey(key0);
      keyChoice0.setKey(key0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      Key key0 = new Key("");
      KeyChoice keyChoice0 = new KeyChoice(simpleEntryInformation0, key0);
      keyChoice0.setKey(key0);
      keyChoice0.getSelectedItem();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EntryInformation entryInformation0 = mock(EntryInformation.class, new ViolatedAssumptionAnswer());
      doReturn((KeyVector) null).when(entryInformation0).getSortedValidKeys();
      Key key0 = mock(Key.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(key0).toString();
      KeyChoice keyChoice0 = null;
      try {
        keyChoice0 = new KeyChoice(entryInformation0, key0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KeyChoice keyChoice0 = null;
      try {
        keyChoice0 = new KeyChoice((EntryInformation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.KeyChoice", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      KeyChoice keyChoice0 = new KeyChoice(blastEntryInformation0, key0);
      keyChoice0.getSelectedItem();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      KeyChoice keyChoice0 = new KeyChoice(blastEntryInformation0, key0);
      keyChoice0.addItemListener((ItemListener) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      KeyChoice keyChoice0 = new KeyChoice(blastEntryInformation0, key0);
      keyChoice0.removeItemListener((ItemListener) null);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = Key.CDS;
      KeyChoice keyChoice0 = new KeyChoice(blastEntryInformation0, key0);
      keyChoice0.setEnabled(false);
  }
}
