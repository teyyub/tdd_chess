package com.tdd.sis.model;

import com.tdd.sis.intf.GradingStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author teyyub Mar 23, 2016 11:33:50 PM
 */
public class Student {

    static final String FIRTS_STUDENT = "Teyyub";
    static final String SECOND_STUDENT = "Teymur";
    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    static final String IN_STATE = "CO";
    private String studentName;
    private boolean fullTime;
    private int credit;
    private List<Grade> grades = new ArrayList();
    
    private String id;
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    private String name;
    private List charges = new ArrayList();

    public enum Grade {
        A(4),
        B(3),
        C(2),
        D(1),
        F(0);
        private int points;

        Grade(int points) {
            this.points = points;
        }

        int getPoints() {
            return points;
        }
    };
    private GradingStrategy gradingStrategy = new RegularGradingStrategy();

    public Student() {
    }

    public Student(String fullName) {
        this.name = fullName;
        List<String> nameParts = split(fullName);
        setName(nameParts);
    }

    public GradingStrategy getGradingStrategy() {
        return gradingStrategy;
    }

    public void setGradingStrategy(GradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double getGpa() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (Grade grade : grades) {
            total += gradePointsFor(grade);
        }
        return total / grades.size();
    }

    public int gradePointsFor(Grade grade) {
        return gradingStrategy.getGradePointsFor(grade);
    }

//    public Student(String studentName) {
//        this.studentName = studentName;
//        setCredit(0);
//    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isFullTime() {
        return credit >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit += credit;
    }

    public void addCredit(int credit) {
        this.credit += credit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(List<String> nameParts) {
        this.lastName = removeLast(nameParts);
        String name = removeLast(nameParts);
        if (nameParts.isEmpty()) {
            this.firstName = name;
        } else {
            this.middleName = name;
            this.firstName = removeLast(nameParts);
        }
//        switch (nameParts.size()) {
//            case 1:
//                this.lastName = nameParts.get(0);
//                break;
//            case 2:
//                this.firstName = nameParts.get(0);
//                this.lastName = nameParts.get(1);
//                break;
//            case 3:
//                this.firstName = nameParts.get(0);
//                this.middleName = nameParts.get(1);
//                this.lastName = nameParts.get(2);
//                break;
//            default:
//                break;
//        }
    }

    private List<String> split(String names) {
        List<String> results = new ArrayList<String>();
        StringBuffer word = new StringBuffer();

        for (int index = 0; index < names.length(); index++) {
            char ch = name.charAt(index);
            if (!Character.isWhitespace(ch)) {
                word.append(ch);
            } else if (word.length() > 0) {
                results.add(word.toString());
                word = new StringBuffer();
            }
        }
        if (word.length() > 0) {
            results.add(word.toString());
        }

        //        int index = 0;
        //        while (index < names.length()) {
        //            char ch = names.charAt(index);
        //            if (ch != ' ') // prefer Character.isSpace. Defined yet?
        //            {
        //                word.append(ch);
        //            } else if (word.length() > 0) {
        //                results.add(word.toString());
        //                word = new StringBuffer();
        //            }
        //            index++;
        //        }
        //        if (word.length() > 0) {
        //            results.add(word.toString());
        //        }
        return results;

    }

    private String removeLast(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        return list.remove(list.size() - 1);
    }

    public void addCharge(int charge) {
        charges.add(new Integer(charge));
//        charges.add(charges);
    }

    public int totalCharges() {
        int total = 0;
        Iterator it = charges.iterator();
        while (it.hasNext()) {
            Integer charge = (Integer) it.next();
//            total += charge;
            total += charge.intValue();
        }
        return total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
