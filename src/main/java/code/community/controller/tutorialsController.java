package code.community.controller;

import io.javalin.http.Handler;

public class tutorialsController {

    public static final Handler view = context -> {
      context.render("tutorials.html");
    };
}
