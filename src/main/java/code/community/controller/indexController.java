package code.community.controller;

import io.javalin.http.Handler;

public class indexController {

    public static final Handler view = context -> {
      context.render("index.html");
    };
}
