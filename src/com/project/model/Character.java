package com.project.model;

/**
 *
 * @author teyyub 5:05:42 PM
 */
public class Character {
    public static final String NEWLINE = "\n";
    public static final String TAB= "\t";
    public static final String SPACE = " ";
    public Character() {
        
    }

    public boolean isWhitespace(String whiteSpace) {
        if (NEWLINE==whiteSpace) return true;
        if(TAB == whiteSpace) return true;
        if(SPACE==whiteSpace) return true;
        return false;
    }
}
