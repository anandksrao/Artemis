/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:17:31 GMT 2018
 */

package org.gmod.schema.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.gmod.schema.analysis.Analysis;
import org.gmod.schema.analysis.AnalysisFeature;
import org.gmod.schema.sequence.Feature;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class AnalysisFeature_ESTest extends AnalysisFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = analysisFeature0.getSignificance();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature((Analysis) null, (Feature) null);
      Double double0 = new Double(0.0);
      analysisFeature0.setSignificance(double0);
      Double double1 = analysisFeature0.getSignificance();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = new Double((-1482.97));
      analysisFeature0.setSignificance(double0);
      Double double1 = analysisFeature0.getSignificance();
      assertEquals((-1482.97), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = analysisFeature0.getRawScore();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = new Double(0.0);
      analysisFeature0.setRawScore(double0);
      Double double1 = analysisFeature0.getRawScore();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = new Double((-1482.97));
      analysisFeature0.setRawScore(double0);
      Double double1 = analysisFeature0.getRawScore();
      assertEquals((-1482.97), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double((-977.597730740521));
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0, double0, double0, double0, double0);
      Double double1 = analysisFeature0.getNormScore();
      assertEquals((-977.597730740521), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = new Double(0.0);
      analysisFeature0.setNormScore(double0);
      Double double1 = analysisFeature0.getNormScore();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = new Double(345.8443);
      analysisFeature0.setNormScore(double0);
      Double double1 = analysisFeature0.getNormScore();
      assertEquals(345.8443, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = new Double(193.12910742975154);
      analysisFeature0.setNormScore(double0);
      Double double1 = analysisFeature0.getNormScore();
      assertEquals(193.12910742975154, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = analysisFeature0.getIdentity();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = new Double(0.0);
      analysisFeature0.setIdentity(double0);
      Double double1 = analysisFeature0.getIdentity();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Double double0 = new Double((-1482.97));
      analysisFeature0.setIdentity(double0);
      Double double1 = analysisFeature0.getIdentity();
      assertEquals((-1482.97), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      analysisFeature0.setAnalysisFeatureId((-1984));
      int int0 = analysisFeature0.getAnalysisFeatureId();
      assertEquals((-1984), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Analysis analysis0 = analysisFeature0.getAnalysis();
      assertNull(analysis0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1418.8216876324993);
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0, double0, double0, double0, double0);
      Double double1 = analysisFeature0.getSignificance();
      assertEquals(1418.8216876324993, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1418.8216876324993);
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0, double0, double0, double0, double0);
      Double double1 = analysisFeature0.getRawScore();
      assertEquals(1418.8216876324993, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1418.8216876324993);
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0, double0, double0, double0, double0);
      analysisFeature0.setFeature(feature0);
      assertEquals(0, analysisFeature0.getAnalysisFeatureId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1418.8216876324993);
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0, double0, double0, double0, double0);
      analysisFeature0.setAnalysisFeatureId(26);
      int int0 = analysisFeature0.getAnalysisFeatureId();
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1418.8216876324993);
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0, double0, double0, double0, double0);
      Double double1 = analysisFeature0.getIdentity();
      assertEquals(1418.8216876324993, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1418.8216876324993);
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0, double0, double0, double0, double0);
      int int0 = analysisFeature0.getAnalysisFeatureId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0);
      Double double0 = analysisFeature0.getNormScore();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AnalysisFeature analysisFeature0 = new AnalysisFeature();
      Feature feature0 = analysisFeature0.getFeature();
      assertNull(feature0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Analysis analysis0 = mock(Analysis.class, new ViolatedAssumptionAnswer());
      doReturn(">ew}>W").when(analysis0).toString();
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(1418.8216876324993);
      AnalysisFeature analysisFeature0 = new AnalysisFeature(analysis0, feature0, double0, double0, double0, double0);
      Analysis analysis1 = analysisFeature0.getAnalysis();
      analysisFeature0.setAnalysis(analysis1);
      assertSame(analysis1, analysis0);
  }
}
