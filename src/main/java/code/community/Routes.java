package code.community;

import code.community.controller.indexController;
import code.community.controller.liveCodingController;
import code.community.controller.challengesController;
import code.community.controller.tutorialsController;
import code.community.controller.profileController;

import static io.javalin.apibuilder.ApiBuilder.get;

public class Routes {
    public static final String INDEX_PAGE = "/";
    public static final String LIVE_CODING_PAGE = "/livecoding";
    public static final String PROFILE_PAGE = "/profile";
    public static final String TUTORIALS_PAGE = "/tutorials";
    public static final String CHALLENGES_PAGE = "/challenges";


    public static void configure(CodeCommunity codeCommunity) {
        codeCommunity.routes(() ->{
            get(INDEX_PAGE,             indexController.view );
            get(LIVE_CODING_PAGE,       liveCodingController.view );
            get(PROFILE_PAGE,           profileController.view );
            get(TUTORIALS_PAGE,         tutorialsController.view );
            get(CHALLENGES_PAGE,        challengesController.view );
        });
    }
}
