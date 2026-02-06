package org.example;

import java.util.ArrayList;

public class TimeFilter extends Filter {

    private int[] begin = new int[2];
    private int[] end = new int[2];

    public TimeFilter(ArrayList<Course> courses, int[] begin, int[] end) {
        super(courses);
        this.begin = begin;
        this.end = end;
    }

    public ArrayList<Course> apply() {
        return null;
    }
}
