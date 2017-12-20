package com.tdd.sis.model;

/**
 *
 * @author teyyub Mar 29, 2016 12:23:28 AM
 */
public class RegularGradingStrategy extends BasicGradingStrategy {

    @Override
    public int getGradePointsFor(Student.Grade grade) {

//        if (grade == Student.Grade.A) return 4;
//        if (grade == Student.Grade.B) return 3;
//        if (grade == Student.Grade.C) return 2;
//        if (grade == Student.Grade.D) return 1;
//        return 0;
//          switch(grade){
//            case A:return 4;
//            case B:return 3;
//            case C:return 2;
//            case D:return 1;
//            default:return 0;
//          }  
        return basicGradePointsFor(grade);
    }

}
