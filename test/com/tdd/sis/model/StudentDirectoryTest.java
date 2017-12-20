package com.tdd.sis.model;

import java.io.IOException;
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
public class StudentDirectoryTest {

    private StudentDirectory dir;

    public StudentDirectoryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dir = new StudentDirectory();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class StudentDirectory.
     */
    @Test
    public void testAdd() {

    }
@Test
    public void testStoreAndRetrieve() throws IOException {
        final int numberOfStudents = 10;
        for (int i = 0; i < numberOfStudents; i++) {
            addStudent(dir, i);
        }
        for (int i = 0; i < numberOfStudents; i++) {
            verifyStudentLookup(dir, i);
        }
    }

    void addStudent(StudentDirectory directory, int i)
            throws IOException {
        String id = "" + i;
        Student student = new Student(id);
        student.setId(id);
//        student.addCredits(i);
        directory.add(student);
    }

    void verifyStudentLookup(StudentDirectory directory, int i)
            throws IOException {
        String id = "" + i;
        Student student = dir.findById(id);
        assertEquals(id, student.getLastName());
        assertEquals(id, student.getId());
//        assertEquals(i, student.getCredits());
    }
}
