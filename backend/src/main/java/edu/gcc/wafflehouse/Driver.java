package edu.gcc.wafflehouse;

import io.javalin.Javalin;
import java.util.ArrayList;

/**
 * Controller / Router
 * @author Tim (last edited: Ina Tang)
 */
public class Driver {

    public static void registerRoutes(Javalin app) {

        // Create objects for search, student, and schedule
        Search search = new Search();
        Student student = new Student();
        Schedule schedule = student.getSchedule();

        // Search database
        app.get("/search", ctx -> {
            // Get query
            String query = ctx.queryParam("q");

            // Handle cases where the query parameter is missing or empty
            if (query == null || query.isEmpty()) {
                ctx.status(400); // Bad Request
                ctx.result("Missing 'query' parameter");
            }

            // Search
            ArrayList<Course> results = search.search(query);
            ctx.json(results);  // return results in JSON
        });

        // Get cached search results, filtered according to the latest filter inputs
        app.get("/filter", ctx -> {
            // Hardcoding all the filter names and parsing their queryParams one by one
            // NOTE: this is actually easier than using a List of filters
            //       b/c we need 1-1 correspondence btw data and the specific filter
            String courseName = ctx.queryParam("name");
            String professor = ctx.queryParam("prof");
            String department = ctx.queryParam("dept");
            String timeslot = ctx.queryParam("time");
            String credits = ctx.queryParam("credits");

            // Set all inputs for the filters
            search.nameFilter.setInput(courseName);
            search.profFilter.setInput(professor);
            // TODO: finish the rest (some also need to be implemented)
            // TODO: (sprint 2) make it more secure by switching to private variables?

            // Get filtered result
            ArrayList<Course> results = search.getFilteredResults();
            ctx.json(results);
        });

        app.get("/courses", ctx -> ctx.json(search.getCourses()));

        // Get schedule
        app.get("/schedule", ctx -> ctx.json(schedule));

        // Add course to schedule
        app.post("/course", ctx -> {
            Course course = ctx.bodyAsClass(Course.class);
            schedule.addCourse(course);
        });

        // TODO: Delete course from schedule

    }

}
