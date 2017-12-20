package com.tdd.sis.model;

import com.tdd.utils.DateUtil;
import java.util.Date;
import java.util.List;
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
public class CourseSessionTest {

    private static final int CREDITS = 3;
    private CourseSession session;
    private Date startDate;
    private Report report;

    public CourseSessionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
//        session = new CourseSession("ENGL", "101");
//        int year = 103;
//        int month = 0;
//        int date = 6;
////        startDate = new Date(year, month, date);
        startDate = DateUtil.createDate(2003, 1, 6);
//        session = new CourseSession(new Course("ENGL", "101"), startDate);
//        report = new Report(session);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDepartment method, of class CourseSession.
     */
    @Test
    public void testGetDepartment() {
//        CourseSession session = new CourseSession("ENGL", "101");
//        assertEquals("ENGL", session.getDepartment());
//        assertEquals("101", session.getNumber());
//
//        Student student1 = new Student("Teyyub Aliyev");
//        session.enroll(student1);
//
//        Student student2 = new Student("Teymur Aliyev");
//        session.enroll(student2);
//
//        assertEquals(2, session.getNumberOfStudents());

    }

    /**
     * Test of getNumber method, of class CourseSession.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        CourseSession instance = null;
        String expResult = "";
        String result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testEnrollStudents() {

        Student student1 = new Student("Teyyub Aliyev");

        session.setCredit(CREDITS);
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(1, session.size());
        assertEquals(student1, session.get(0));
        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(2, session.size());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
        Student student3 = new Student("Teymur Aliyev");
        session.enroll(student3);
        assertEquals(CREDITS, student1.getCredit());
        System.out.println(report.getReport());
    }

    @Test
    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());

    }

    @Test
    public void testCount() {
//        CourseSession.count = 0;      
//        System.out.println(CourseSession.count);
        startDate = new DateUtil().createDate(2003, 1, 6);
//        session = new CourseSession("ENGL", "101", startDate);
        System.out.println(session.getCount());
    }

    /**
     * Test of enroll method, of class CourseSession.
     */
    @Test
    public void testEnroll() {
        System.out.println("enroll");
        Student student = null;
        CourseSession instance = null;
        instance.enroll(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfStudents method, of class CourseSession.
     */
    @Test
    public void testGetNumberOfStudents() {
        System.out.println("getNumberOfStudents");
        CourseSession instance = null;
        int expResult = 0;
        int result = instance.getNumberOfStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class CourseSession.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        CourseSession instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class CourseSession.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        CourseSession instance = null;
        Student expResult = null;
        Student result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class CourseSession.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        CourseSession instance = null;
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class CourseSession.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        CourseSession instance = null;
        List<Student> expResult = null;
        List<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class CourseSession.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        CourseSession instance = null;
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCount method, of class CourseSession.
     */
    @Test
    public void testSetCount() {
        System.out.println("setCount");
        int count = 0;
        CourseSession instance = null;
        instance.setCount(count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCredit method, of class CourseSession.
     */
    @Test
    public void testGetCredit() {
        System.out.println("getCredit");
        CourseSession instance = null;
        int expResult = 0;
        int result = instance.getCredit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCredit method, of class CourseSession.
     */
    @Test
    public void testSetCredit() {
        System.out.println("setCredit");
        int credit = 0;
        CourseSession instance = null;
        instance.setCredit(credit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testReportMessage() {
        Report instance = new Report(session);
        assertEquals(Report.A_MESSAGE, instance.getMessage(Student.Grade.A));
        assertEquals(Report.B_MESSAGE, instance.getMessage(Student.Grade.B));
        assertEquals(Report.C_MESSAGE, instance.getMessage(Student.Grade.C));
        assertEquals(Report.D_MESSAGE, instance.getMessage(Student.Grade.D));
        assertEquals(Report.F_MESSAGE, instance.getMessage(Student.Grade.F));
    }

    @Test
    public void testEndDate() {
        Date startDate1 = DateUtil.createDate(2003, 6, 9);
        CourseSession session1
                = SummerCourseSession.create("ENGL", "200", startDate1);
        Date eightWeeksOut = DateUtil.createDate(2003, 8, 1);
        assertEquals(eightWeeksOut, session1.getStartDate());
    }

//    protected CourseSession createCourseSession(Course course, Date startdate) {
//         return CourseSession.createCourseSession(course,startdate);
//    }

}
