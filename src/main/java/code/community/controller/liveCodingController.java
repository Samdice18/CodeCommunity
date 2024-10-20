package code.community.controller;

import io.javalin.http.Handler;

public class liveCodingController {

    public static final Handler view = context -> {
      context.render("live_coding.html");
    };
}
