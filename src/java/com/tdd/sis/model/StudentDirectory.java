package com.tdd.sis.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author teyyub Apr 24, 2016 1:55:30 PM
 */
public class StudentDirectory {

    private Map<String, Student> students = new HashMap<String, Student>();

    public void add(Student student) {
        students.put(student.getId(), student);
    }

    public Student findById(String id) {
        return students.get(id);
    }
}
