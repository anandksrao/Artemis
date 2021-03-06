/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 20:00:57 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics;
import java.io.StringReader;
import javax.swing.DebugGraphics;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.EmblStreamSequence;
import uk.ac.sanger.artemis.io.FastaStreamSequence;
import uk.ac.sanger.artemis.io.GenbankStreamSequence;
import uk.ac.sanger.artemis.io.PartialSequence;
import uk.ac.sanger.artemis.io.Sequence;
import uk.ac.sanger.artemis.plot.NcAlgorithm;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.sequence.Strand;
import uk.ac.sanger.artemis.util.LinePushBackReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NcAlgorithm_ESTest extends NcAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("org.biojava.bio.PropertyConstraint");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      Integer integer0 = ncAlgorithm0.getDefaultStepSize(10);
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertTrue(ncAlgorithm0.scalingFlag());
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Sequence ");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence(linePushBackReader0);
      Bases bases0 = new Bases(emblStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      float[] floatArray0 = new float[2];
      // Undeclared exception!
      ncAlgorithm0.getValues(5, 36683, floatArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Bases bases0 = new Bases((Sequence) null);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      float[] floatArray0 = new float[6];
      // Undeclared exception!
      try { 
        ncAlgorithm0.getValues((-1141), 2759, floatArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.sequence.Bases", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[6];
      Short short0 = new Short((short) (-1211));
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      PartialSequence partialSequence0 = new PartialSequence(charArray0, 531, 531, short0, integer0);
      Bases bases0 = new Bases(partialSequence0);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      float[] floatArray0 = new float[8];
      // Undeclared exception!
      try { 
        ncAlgorithm0.getValues((-2763), 0, floatArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.PartialSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NcAlgorithm ncAlgorithm0 = null;
      try {
        ncAlgorithm0 = new NcAlgorithm((Strand) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.NcAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(" is not a valid/known database key (check the sequence ontology)!");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      Integer integer0 = ncAlgorithm0.getDefaultStepSize(2210);
      assertNotNull(integer0);
      assertTrue(ncAlgorithm0.scalingFlag());
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertEquals(24, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[6];
      Short short0 = new Short((short) (-1211));
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      PartialSequence partialSequence0 = new PartialSequence(charArray0, 531, 531, short0, integer0);
      Bases bases0 = new Bases(partialSequence0);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      Integer integer1 = ncAlgorithm0.getDefaultStepSize(2);
      assertEquals("Reverse Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertNull(integer1);
      assertTrue(ncAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[6];
      Short short0 = new Short((short) (-1211));
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      PartialSequence partialSequence0 = new PartialSequence(charArray0, 531, 531, short0, integer0);
      Bases bases0 = new Bases(partialSequence0);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      Integer integer1 = ncAlgorithm0.getDefaultMinWindowSize();
      assertEquals("Reverse Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertTrue(ncAlgorithm0.scalingFlag());
      assertEquals(24, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("e qHFGZ~zlTDSB");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      Integer integer0 = ncAlgorithm0.getDefaultMaxWindowSize();
      assertEquals("Reverse Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertNotNull(integer0);
      assertEquals(5000, (int)integer0);
      assertTrue(ncAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[6];
      Short short0 = new Short((short) (-1211));
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      PartialSequence partialSequence0 = new PartialSequence(charArray0, 531, 531, short0, integer0);
      Bases bases0 = new Bases(partialSequence0);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      Integer integer1 = ncAlgorithm0.getDefaultWindowSize();
      assertTrue(ncAlgorithm0.scalingFlag());
      assertEquals("Reverse Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertEquals(500, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("~");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      genbankStreamSequence0.setFromChar(bases0.letter_index);
      float[] floatArray0 = new float[4];
      ncAlgorithm0.getValues(1, 502, floatArray0);
      assertTrue(ncAlgorithm0.scalingFlag());
      assertArrayEquals(new float[] {2.0F, 3.0F, 5.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(" is not a valid/known database key (check the sequence ontology)!");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      float[] floatArray0 = new float[9];
      ncAlgorithm0.getValues(5, 471, floatArray0);
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertTrue(ncAlgorithm0.scalingFlag());
      assertArrayEquals(new float[] {3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("~");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      genbankStreamSequence0.setFromChar(bases0.letter_index);
      bases0.reverseComplement();
      float[] floatArray0 = new float[3];
      ncAlgorithm0.getValues(1, 468, floatArray0);
      assertTrue(ncAlgorithm0.scalingFlag());
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertArrayEquals(new float[] {2.0F, 2.0F, 3.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(" is not a valid/known ataae key (check the sequence ontlogy)");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      bases0.reverseComplement();
      float[] floatArray0 = new float[12];
      ncAlgorithm0.getValues(5, 458, floatArray0);
      assertTrue(ncAlgorithm0.scalingFlag());
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence(" is not a valid/known ataae key (check the sequence ontlogy)");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      float[] floatArray0 = new float[12];
      // Undeclared exception!
      try { 
        ncAlgorithm0.getValues(5, 458, floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("uk.ac.sanger.artemis.plot.NcAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("?", "?");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      float[] floatArray0 = new float[8];
      // Undeclared exception!
      try { 
        ncAlgorithm0.getValues(2, 1, floatArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - unexpected exception: org.evosuite.runtime.mock.java.lang.MockThrowable: start: 1 > end: 0
         //
         verifyException("uk.ac.sanger.artemis.plot.NcAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("org.biojava.bio.PropertyConstraint");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      Float float0 = ncAlgorithm0.getMaximumInternal();
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertEquals(1.0E7F, (float)float0, 0.01F);
      assertTrue(ncAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FastaStreamSequence fastaStreamSequence0 = new FastaStreamSequence("?", "?");
      Bases bases0 = new Bases(fastaStreamSequence0);
      Strand strand0 = bases0.getReverseStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      Color[] colorArray0 = new Color[1];
      ncAlgorithm0.drawLegend((Graphics) debugGraphics0, 0, 5, colorArray0);
      assertEquals("Reverse Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertTrue(ncAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("org.biojava.bio.PropertyConstraint");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      ncAlgorithm0.getAverage();
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertTrue(ncAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Sequence ");
      LinePushBackReader linePushBackReader0 = new LinePushBackReader(stringReader0);
      EmblStreamSequence emblStreamSequence0 = new EmblStreamSequence(linePushBackReader0);
      Bases bases0 = new Bases(emblStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      int int0 = ncAlgorithm0.getValueCount();
      assertEquals(3, int0);
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertTrue(ncAlgorithm0.scalingFlag());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GenbankStreamSequence genbankStreamSequence0 = new GenbankStreamSequence("~");
      Bases bases0 = new Bases(genbankStreamSequence0);
      Strand strand0 = bases0.getForwardStrand();
      NcAlgorithm ncAlgorithm0 = new NcAlgorithm(strand0);
      Float float0 = ncAlgorithm0.getMinimumInternal();
      assertEquals("Effective Codon Number(Nc)", ncAlgorithm0.getAlgorithmName());
      assertEquals(0.0F, (float)float0, 0.01F);
      assertTrue(ncAlgorithm0.scalingFlag());
  }
}
