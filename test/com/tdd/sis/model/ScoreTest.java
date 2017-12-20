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
public class ScoreTest {

    public ScoreTest() {
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
     * Test of score method, of class Score.
     */
    @Test
    public void testScore() {
        Scorer scorer = new Scorer();
        if(scorer.isValid("a")){
          scorer.score("a");
        }
        if(scorer.isValid("1")){
          scorer.score("1a");
        }
        
//        try {
//            scorer.score("abd");
//            fail("expected NumberFormatException on bad input");
//        } catch(NumberFormatException e){
//            System.out.println(e+ " "+e.getMessage());
//        }
        
    }

}
