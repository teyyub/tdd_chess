package com.tdd.sis.model;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author teyyub Mar 25, 2016 8:33:22 PM
 */
public class Report {

    static final String NEWLINE = System.getProperty("line.separator");
    private final static String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "-" + NEWLINE;
    private final static String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";
    static final String A_MESSAGE = "Excellent";
    static final String B_MESSAGE = "Very good";
    static final String C_MESSAGE = "Hmmm...";
    static final String D_MESSAGE = "You're not trying";
    static final String F_MESSAGE = "Loser";
    private Map<Student.Grade, String> messages = null;

    private CourseSession session;

    public Report(CourseSession session) {
        this.session = session;
    }

    public String getReport() {
        StringBuilder buffer = new StringBuilder();
        writeHeader(buffer);
        writeBody(buffer);
        writeFooter(buffer);
        return buffer.toString();
    }

    public void writeHeader(StringBuilder buffer) {
        buffer.append(ROSTER_REPORT_HEADER);
    }

    public void writeBody(StringBuilder buffer) {
        for (Student student : session.getStudents()) {
            buffer.append(student.getStudentName());
            buffer.append(NEWLINE);
        }
    }

    public void writeFooter(StringBuilder buffer) {
        buffer.append(ROSTER_REPORT_FOOTER).append(session.size()).append(NEWLINE);
    }

    public String getMessage(Student.Grade grade) {
        return getMessages().get(grade);
    }

    private Map<Student.Grade, String> getMessages() {
        if (messages == null) {
            loadMessages();
        }
        return messages;
    }

    private void loadMessages() {
        messages = new EnumMap<Student.Grade, String>(Student.Grade.class);
        messages.put(Student.Grade.A, A_MESSAGE);
        messages.put(Student.Grade.B, B_MESSAGE);
        messages.put(Student.Grade.C, C_MESSAGE);
        messages.put(Student.Grade.D, D_MESSAGE);
        messages.put(Student.Grade.F, F_MESSAGE);
    }

}
