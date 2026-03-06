package edu.gcc.wafflehouse;

import java.util.ArrayList;

public class CourseNameFilter extends Filter<String> {
    @Override
    public ArrayList<Course> apply(ArrayList<Course> courses, String origNameSubstr) {
        ArrayList<Course> matchingCourses = new ArrayList<>();
        String nameSubstr = origNameSubstr.toLowerCase();  // case-agnostic

        for (Course course : courses) {
            if (course.getName().toLowerCase().contains(nameSubstr)) {
                matchingCourses.add(course);
            }
        }

        return matchingCourses;
    }
}
