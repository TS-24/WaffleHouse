package org.example;
import java.util.ArrayList;

public abstract class Filter {

    private ArrayList<Course> courses;

    public Filter(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public abstract ArrayList<Course> apply();
}
