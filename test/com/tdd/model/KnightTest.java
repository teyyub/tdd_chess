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
public class KnightTest {
    private Piece instance;
    public KnightTest() {
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
     * Test of createKnight method, of class Knight.
     */
    @Test
    public void testCreateKnight() {
       Knight whiteKnight = Knight.createKnight("WHITE");
        assertEquals("WHITE", whiteKnight.getColor());
        assertEquals("n", whiteKnight.getRepresentation());
    }

}