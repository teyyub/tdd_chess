package com.tdd.sis.model;

/**
 *
 * @author teyyub Apr 24, 2016 2:08:55 PM
 */
public class Course {

    private String department;
    private String number;
    
    public Course(String department, String number){
        this.department = department;
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    
}
