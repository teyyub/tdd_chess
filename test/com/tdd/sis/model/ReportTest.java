package com.tdd.sis.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teyyub
 */
public class ReportTest {
    
    public ReportTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getRosterReport method, of class Report.
     */
    @Test
    public void testGetRosterReport() {
        System.out.println("getRosterReport");
        Report instance = null;
        String expResult = "";
        String result = instance.getReport();
        assertEquals(expResult, result);
  
    }

}