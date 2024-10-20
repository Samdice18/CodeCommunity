package code.community.controller;

import io.javalin.http.Handler;

public class challengesController {

    public static final Handler view = context -> {
      context.render("challenges.html");
    };
}
