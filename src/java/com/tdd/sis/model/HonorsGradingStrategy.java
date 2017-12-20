package com.tdd.sis.model;

/**
 *
 * @author teyyub  Mar 29, 2016 12:05:35 AM
 */
public class HonorsGradingStrategy extends BasicGradingStrategy 
        /*implements GradingStrategy*/{

    @Override
    public int getGradePointsFor(Student.Grade grade) {
       int point = basicGradePointsFor(grade);
       if(point>0) point+=1;
       return point;
    }
 
  
}
