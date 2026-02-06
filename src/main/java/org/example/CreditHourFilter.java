package org.example;

import java.util.ArrayList;

public class CreditHourFilter extends Filter {

    private int credits;

    public CreditHourFilter(ArrayList<Course> courses, int credits) {
        super(courses);
        this.credits = credits;
    }

    public ArrayList<Course> apply() {
        return null;
    }
}
