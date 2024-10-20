package code.community.controller;

import io.javalin.http.Handler;

public class profileController {

    public static final Handler view = context -> {
      context.render("profile.html");
    };
}
