package edu.gcc.wafflehouse;

import io.javalin.Javalin;

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

        Javalin app = Javalin.create(
                // TODO: add the location of FRONTEND files to the config: (config -> { config.staticFiles.add("public"); })
        ).start(7000);

        /* COURSE REQUESTS */
        app.get("/course", ctx -> ctx.json(search.getCourses()));

        // Get schedule
        app.get("/schedule", ctx -> ctx.json(schedule));

        });

    }

}
