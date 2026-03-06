package edu.gcc.wafflehouse;

import java.util.ArrayList;

/**
 * @author Ina Tang
 */
public class CreditHourFilter extends Filter<Course> {

    @Override
    public ArrayList<Course> apply(ArrayList<Course> courses, String creditHoursStr) {
        ArrayList<Course> matchingCourses = new ArrayList<>();
        int creditHours = Integer.parseInt(creditHoursStr);

        for (Course course : courses) {
            if (course.getCreditHours() == creditHours) {
                matchingCourses.add(course);
            }
        }
        return matchingCourses;
    }

}
