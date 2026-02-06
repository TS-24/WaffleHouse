package org.example;

import java.util.ArrayList;

public class DepartmentFilter extends Filter {

    private String department;

    public DepartmentFilter(ArrayList<Course> courses, String department) {
        super(courses);
        this.department = department;
    }

    public ArrayList<Course> apply() {
        return null;
    }
}
