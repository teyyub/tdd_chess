package com.tdd.sis.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author teyyub Mar 25, 2016 5:50:26 PM
 */
abstract public class CourseSession implements Comparable<CourseSession>{

    private String department;
    private String number;
    private List<Student> students = new ArrayList();
    Date startDate;
    int count = 0;
    private int credit;
    private String state;
    
//    public static CourseSession create(String department, String number, Date startDate) {
//        return new CourseSession(department, number, startDate);
//    }

    CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
    }

  protected CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

  abstract protected CourseSession createCourseSession(Course course , Date startdate);
  
    void enroll(Student student) {
        student.setCredit(credit);
        students.add(student);
      
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    int getNumberOfStudents() {
        return students.size();
    }

    public int size() {
        return students.size();
    }

    public Student get(int index) {
        return students.get(index);
    }

    protected Date getStartDate() {
        return startDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public int compareTo(CourseSession o) {
        int compare = this.getDepartment().compareTo(o.getDepartment());
        if(compare!=0)
            return compare;
        return this.getNumber().compareTo(o.getNumber());
    }

  
}
