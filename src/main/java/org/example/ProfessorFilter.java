package org.example;

import java.util.ArrayList;

public class ProfessorFilter extends Filter {

    private String name;

    public ProfessorFilter(ArrayList<Course> courses, String name) {
        super(courses);
        this.name = name;
    }
    public ArrayList<Course> apply() {
        return null;
    }
}
