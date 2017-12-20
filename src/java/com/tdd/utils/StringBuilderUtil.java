package com.tdd.utils;

/**
 *
 * @author teyyub Mar 28, 2016 11:39:07 AM
 */
public class StringBuilderUtil {

   static StringBuilder builder = new StringBuilder();
    static final String NEWLINE = System.getProperty("line.separator");
    static final String DOT = ".";

    public static String createNewLine() {

        builder.append(NEWLINE);
        return builder.toString();
    }

    public static String createDot() {      
        builder.append(DOT);
        return builder.toString();
    }

    public static String appendNewLine(String s) {
        builder.append(s);
        return builder.toString();
    }

}
