package org.example;
import java.util.ArrayList;

public abstract class Filter {

    public enum FilterName {
        Professor, Department, Timeslot, Credits;
    }

    private FilterName filtername;

    public Filter(FilterName filterName) {
        this.filtername = filterName;
    }
    // public abstract ArrayList<Course> apply( , ArrayList<Course> courses);
}
