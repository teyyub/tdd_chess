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
public class StudentTest {

    Student instance;
    static final double GRADE_TOLERANCE = 0.1;

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Student("Teyyub");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentName method, of class Student.
     */
    @Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        instance.setStudentName(Student.FIRTS_STUDENT);
        String expResult = Student.FIRTS_STUDENT;
        String result = instance.getStudentName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStudentName method, of class Student.
     */
    @Test
    public void testSetStudentName() {
        System.out.println("setStudentName");
        String studentName = "";
        instance.setStudentName(studentName);

    }

    /**
     * Test of isFullTime method, of class Student.
     */
    @Test
    public void testIsFullTime() {
        System.out.println("isFullTime");

        boolean expResult = true;
        boolean result = instance.isFullTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCredit method, of class Student.
     */
    @Test
    public void testGetCredit() {
        System.out.println("getCredit");
        int expResult = 0;
        int result = instance.getCredit();
        assertEquals(expResult, result);
        assertFalse(instance.isFullTime());
        instance.addCredit(3);
        assertEquals(3, instance.getCredit());
        instance.addCredit(4);
        assertEquals(7, instance.getCredit());
        instance.addCredit(5);
        assertTrue(instance.isFullTime());
    }

    /**
     * Test of setCredit method, of class Student.
     */
    @Test
    public void testSetCredit() {
        System.out.println("setCredit");
        int credit = 0;

        instance.setCredit(credit);

    }

    /**
     * Test of addCredit method, of class Student.
     */
    @Test
    public void testAddCredit() {
        System.out.println("addCredit");
        int credit = 0;
        Student instance = new Student();
        instance.addCredit(credit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGrade method, of class Student.
     */
    @Test
    public void testAddGrade() {
        System.out.println("addGrade");
        String grade = "A";
//        instance.addGrade(grade);
        assertEquals(4, instance.getGpa(), 1.2);
    }

    /**
     * Test of getGpa method, of class Student.
     */
    @Test
    public void testGetGpa() {
        instance.addGrade(Student.Grade.A);
        assertGpa(instance, 4.0);
        instance.addGrade(Student.Grade.B);
        assertGpa(instance, 3.5);
        instance.addGrade(Student.Grade.C);
        assertGpa(instance, 3.0);
        instance.addGrade(Student.Grade.D);
        assertGpa(instance, 2.5);
        instance.addGrade(Student.Grade.F);
        assertGpa(instance, 2.0);
    }

    private void assertGpa(Student studet, double expectedGpa) {
        assertEquals(expectedGpa, studet.getGpa(), GRADE_TOLERANCE);
    }

    @Test
    public void testNameParts() {
        Student s = new Student("Teyyub Aliyev");
        assertEquals("Teyyub", s.getFirstName());
        assertEquals("Aliyev", s.getLastName());
    }

    @Test
    public void testCharges() {
        Student student = new Student("a");
        student.addCharge(500);
        student.addCharge(200);
        student.addCharge(399);
        assertEquals(1099, student.totalCharges());
    }
}
