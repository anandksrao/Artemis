/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:08:52 GMT 2018
 */

package uk.ac.sanger.artemis.components.database;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.database.DatabaseEntrySource;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.UI;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class DatabaseEntrySource_ESTest extends DatabaseEntrySource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      databaseEntrySource0.setReadOnly(true);
      databaseEntrySource0.isReadOnly();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      // Undeclared exception!
      try { 
        databaseEntrySource0.setLocation(false);  
      
      } catch(Exception e) {
    	  	fail("Caught Exception");
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      // Undeclared exception!
      try { 
        databaseEntrySource0.setLocation(false);
      
      } catch(Exception e) {
    	  	fail("Caught Exception");
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      // Undeclared exception!
      try { 
        databaseEntrySource0.setLocation(false);
        
      } catch(Exception e) {
    	  	fail("Caught Exception");
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      JPasswordField jPasswordField0 = new JPasswordField("", 8817);
      DatabaseDocument databaseDocument0 = new DatabaseDocument("", jPasswordField0, "", "OSpwn=3{", false);
      // Undeclared exception!
      try { 
        databaseEntrySource0.makeFromGff(databaseDocument0, "CDS", "; score cut-off=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      // Undeclared exception!
      try { 
        databaseEntrySource0.setLocation(false);
      
      } catch(Exception e) {
    	  	fail("Caught Exception");
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      UI.UIMode uI_UIMode0 = UI.UIMode.SCRIPT;
      UI.mode = uI_UIMode0;
      databaseEntrySource0.setLocation(true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      // Undeclared exception!
      try { 
        databaseEntrySource0.setLocation(true);
        
      
      } catch(Exception e) {
    	  	fail("Caught Exception");
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      databaseEntrySource0.setLocation(false);
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      databaseEntrySource0.getEntry("CC_", "genedb_products", inputStreamProgressListener0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      UI.UIMode uI_UIMode0 = UI.UIMode.SWING;
      UI.mode = uI_UIMode0;
      UI.UIMode uI_UIMode1 = UI.UIMode.CONSOLE;
      UI.mode = uI_UIMode1;
      // Undeclared exception!
      try { 
        databaseEntrySource0.setLocation(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseLocationParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      databaseEntrySource0.getEntry((Bases) null, true);
      assertFalse(databaseEntrySource0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      String string0 = databaseEntrySource0.getSourceName();
      assertFalse(databaseEntrySource0.isReadOnly());
      assertEquals("Database", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        databaseEntrySource0.getEntry("ix=54_", "", inputStreamProgressListener0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - created a null Document
         //
         verifyException("uk.ac.sanger.artemis.util.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      databaseEntrySource0.getEntry(false);
      assertFalse(databaseEntrySource0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      // Undeclared exception!
      try { 
        databaseEntrySource0.getDatabaseDocument();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - created a null Document
         //
         verifyException("uk.ac.sanger.artemis.util.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      boolean boolean0 = databaseEntrySource0.isFullEntrySource();
      assertTrue(boolean0);
      assertFalse(databaseEntrySource0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      databaseEntrySource0.setSplitGFF(true);
      assertFalse(databaseEntrySource0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      databaseEntrySource0.getLocation();
      assertFalse(databaseEntrySource0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        databaseEntrySource0.getEntry((String) null, (String) null, inputStreamProgressListener0, (Range) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - created a null Document
         //
         verifyException("uk.ac.sanger.artemis.util.Document", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      databaseEntrySource0.getPfield();
      assertFalse(databaseEntrySource0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DatabaseEntrySource databaseEntrySource0 = new DatabaseEntrySource();
      boolean boolean0 = databaseEntrySource0.isReadOnly();
      assertFalse(boolean0);
  }
}
