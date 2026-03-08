package edu.gcc.wafflehouse;

import io.javalin.Javalin;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Entrance to the app and nothing else.
 * @author Ina Tang
 */
public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            // Serve static files from src/main/resources/public
            config.staticFiles.add("public");

            // Enable CORS (allow requests from React dev server)
            config.bundledPlugins.enableCors(cors -> {
                cors.addRule(it -> {
                    it.allowHost("http://localhost:5173");
                });
            });
        }).start(7000);

        Driver.registerRoutes(app);
    }
}

// WaffleHouse is the best :D