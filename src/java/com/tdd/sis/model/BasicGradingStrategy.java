package com.tdd.sis.model;

import com.tdd.sis.intf.GradingStrategy;

/**
 *
 * @author teyyub  Apr 12, 2016 12:32:23 PM
 */
abstract public class BasicGradingStrategy implements GradingStrategy{
@Override
abstract public int getGradePointsFor(Student.Grade grade);    
 int basicGradePointsFor(Student.Grade grade){
//      if(grade==Student.Grade.A) return 4;
//      if(grade==Student.Grade.B) return 3;
//      if(grade==Student.Grade.C) return 2;
//      if(grade==Student.Grade.D) return 1;
//      return 0;
    return grade.getPoints();
  }
}
