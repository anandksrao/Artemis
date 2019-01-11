/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:07:46 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.IllegalComponentStateException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JComponent;
import javax.swing.JToolTip;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuDragMouseEvent;
import org.apache.xmlgraphics.java2d.DefaultGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class AbstractGraphPanel_ESTest extends AbstractGraphPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      abstractGraphPanel0.setStartAndEnd((-388), 0);
      assertFalse(abstractGraphPanel0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      abstractGraphPanel0.nBins = 893;
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        abstractGraphPanel0.drawMax(graphics2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      AbstractGraphPanel.PopupListener abstractGraphPanel_PopupListener0 = abstractGraphPanel0.new PopupListener();
      MouseEvent mouseEvent0 = new MouseEvent(abstractGraphPanel0, 1, 1, 1, 1, 1, 1, false);
      // Undeclared exception!
      try { 
        abstractGraphPanel_PopupListener0.mouseReleased(mouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel$PopupListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      // Undeclared exception!
      try { 
        abstractGraphPanel0.initPopupMenu((JComponent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        abstractGraphPanel0.drawMax(graphics2D0, 2228.08F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      AbstractGraphPanel.PopupListener abstractGraphPanel_PopupListener0 = abstractGraphPanel0.new PopupListener();
      MouseEvent mouseEvent0 = new MouseEvent(abstractGraphPanel0, 828, 828, 369, 569, 369, 828, false);
      // Undeclared exception!
      try { 
        abstractGraphPanel_PopupListener0.mouseClicked(mouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.AbstractGraphPanel$PopupListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      AbstractGraphPanel.PopupListener abstractGraphPanel_PopupListener0 = abstractGraphPanel0.new PopupListener();
      MouseEvent mouseEvent0 = mock(MouseEvent.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(mouseEvent0).getClickCount();
      abstractGraphPanel_PopupListener0.mouseClicked(mouseEvent0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      float float0 = abstractGraphPanel0.getValue((-747), false);
      assertEquals((-747.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      float float0 = abstractGraphPanel0.getValue(0, true);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      float float0 = abstractGraphPanel0.getValue(2984, true);
      assertEquals(8.00102F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      AbstractGraphPanel.PopupListener abstractGraphPanel_PopupListener0 = abstractGraphPanel0.new PopupListener();
      MenuElement[] menuElementArray0 = new MenuElement[3];
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent(abstractGraphPanel0, 849, 2L, 32, (-741), 0, 8848, true, menuElementArray0, menuSelectionManager0);
      // Undeclared exception!
      try { 
        abstractGraphPanel_PopupListener0.mouseReleased(menuDragMouseEvent0);
        fail("Expecting exception: IllegalComponentStateException");
      
      } catch(IllegalComponentStateException e) {
         //
         // component must be showing on the screen to determine its location
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      AbstractGraphPanel.PopupListener abstractGraphPanel_PopupListener0 = abstractGraphPanel0.new PopupListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(abstractGraphPanel0, (-65), 4L, 55, 424, 13, 1, false, 13, 13, (-969));
      abstractGraphPanel_PopupListener0.mousePressed(mouseWheelEvent0);
      assertEquals(0, mouseWheelEvent0.getXOnScreen());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      JToolTip jToolTip0 = abstractGraphPanel0.createToolTip();
      abstractGraphPanel0.initPopupMenu(jToolTip0);
      assertFalse(jToolTip0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      abstractGraphPanel0.setStartAndEnd((-969), (-969));
      DefaultGraphics2D defaultGraphics2D0 = new DefaultGraphics2D(true);
      // Undeclared exception!
      try { 
        abstractGraphPanel0.drawMax(defaultGraphics2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xmlgraphics.java2d.AbstractGraphics2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AbstractGraphPanel abstractGraphPanel0 = new AbstractGraphPanel();
      abstractGraphPanel0.setPixPerBase(1388.39F);
      assertTrue(abstractGraphPanel0.getFocusTraversalKeysEnabled());
  }
}