package com.tdd.model;

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
public class QueenTest {

    private Queen instance;

    public QueenTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Queen();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getColor method, of class Queen.
     */
    @Test
    public void createQueen() {
        Queen whiteQueen = Queen.createQueen("WHITE");
        assertEquals("WHITE", whiteQueen.getColor());
        assertEquals("q", whiteQueen.getRepresentation());
        
        Queen blackQueen = Queen.createQueen("BLACK");
        assertEquals("BLACK", blackQueen.getColor());
        assertEquals("Q", blackQueen.getRepresentation());
        
        assertEquals(9, whiteQueen.getValue());
        assertEquals(9, blackQueen.getValue());
    }

}
