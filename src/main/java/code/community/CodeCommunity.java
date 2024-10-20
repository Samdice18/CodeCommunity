package code.community;

import io.javalin.Javalin;
import io.javalin.apibuilder.EndpointGroup;

public class CodeCommunity {
    private final Javalin appServer;

    public static void main(String[] args) {
        CodeCommunity codeCommunity = new CodeCommunity();
        codeCommunity.start(1234);
    }

    public CodeCommunity() {
        appServer = Javalin.create();
        Routes.configure(this);
    }

    public void routes(EndpointGroup group) {
        appServer.routes(group);
    }

    public void start (int port) {
        this.appServer.start(port);
    }

    public void stop () {
        this.appServer.stop();
    }

    public int port () {
        return appServer.port();
    }
}