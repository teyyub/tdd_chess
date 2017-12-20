package com.tdd.sis.model;

/**
 *
 * @author teyyub Apr 24, 2016 1:00:38 PM
 */
public class Scorer {

    public int score(String input) {
        return Integer.parseInt(input);
    }

    public boolean isValid(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
