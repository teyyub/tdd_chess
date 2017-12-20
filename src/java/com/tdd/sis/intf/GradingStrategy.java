package com.tdd.sis.intf;

import com.tdd.sis.model.Student;

/**
 *
 * @author teyyub Mar 29, 2016 12:02:27 AM
 */
public interface GradingStrategy {
    public int getGradePointsFor(Student.Grade grade);
}
