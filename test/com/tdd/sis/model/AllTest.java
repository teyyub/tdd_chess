/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdd.sis.model;

import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author teyyub
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.tdd.sis.model.CourseSessionTest.class})
public class AllTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public TestSuite allTests() {
        junit.framework.TestSuite suite
                = new junit.framework.TestSuite();
//        suite.addTestSuite(StudentTest.class);
//        suite.addTestSuite(CourseSessionTest.class);
        return suite;
    }
}
