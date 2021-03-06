/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 18:36:33 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.FileSelectionDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FileSelectionDialog_ESTest extends FileSelectionDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = FileSelectionDialog.isListOfFiles("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSelectionDialog fileSelectionDialog0 = null;
      try {
        fileSelectionDialog0 = new FileSelectionDialog((Frame) null, true, ".2o#\"L#$dWM,d;:", "");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileSelectionDialog.isListOfFiles((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileSelectionDialog.getListOfFiles((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[9];
      FileSelectionDialog fileSelectionDialog0 = null;
      try {
        fileSelectionDialog0 = new FileSelectionDialog(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Z>;");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      List<String> list0 = FileSelectionDialog.getListOfFiles("Z>;");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("2a*@<cK");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Pattern is missing");
      List<String> list0 = FileSelectionDialog.getListOfFiles("2a*@<cK");
      assertTrue(list0.contains("Pattern is missing"));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<String> list0 = FileSelectionDialog.getListOfFiles("http02ElLe/,;t\fjhl8");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<String> list0 = FileSelectionDialog.getListOfFiles("2a*@<cK");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Pattern is missing");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Pattern is missing");
      boolean boolean0 = FileSelectionDialog.isListOfFiles("Pattern is missing");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("2a*@<cK");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Pattern is missing");
      boolean boolean0 = FileSelectionDialog.isListOfFiles("2a*@<cK");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("htsjdk.variant.variantcontext.VariantContext");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "httphttpK-p%Q7Tz<y]");
      boolean boolean0 = FileSelectionDialog.isListOfFiles("htsjdk.variant.variantcontext.VariantContext");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = FileSelectionDialog.isListOfFiles("ftp,,W-rz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = FileSelectionDialog.isListOfFiles("htsjdk.variant.variantcontext.VariantContext");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = FileSelectionDialog.isListOfFiles("httpK-p%Q7Tz<y]");
      assertFalse(boolean0);
  }
}
