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
public class KingTest {

    private King instance;

    public KingTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new King();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPieceColor method, of class King.
     */
    @Test
    public void testCreateKing() {
        King blackKing = King.createKing("BLACK");
        assertEquals("BLACK", blackKing.getColor());
        assertEquals("K", blackKing.getRepresentation());

        King whiteKing = King.createKing("WHITE");
        assertEquals("WHITE", whiteKing.getColor());
        assertEquals("k", whiteKing.getRepresentation());
    }
}
