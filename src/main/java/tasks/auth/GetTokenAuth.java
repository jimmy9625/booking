package tasks.auth;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import utils.GenerateBodyAuth;

public class GetTokenAuth implements Task {

    private String userName;
    private String password;
    private String path;



    GetTokenAuth() {
        this.userName = "admin";
        this.password = "password123";
        this.path="/auth";

    }

    GetTokenAuth(String path,String userName, String password) {
        this.path= path;
        this.password = password;
        this.userName = userName;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        String authBody = GenerateBodyAuth.WhitData(userName, password);
        actor.attemptsTo(
                Post.to(path)
                        .with(request -> request.header("Content-Type", "application/json")
                                .body(authBody)
                        )
        );

    }


    public static GetTokenAuth peticionTo(String path, String userName, String password) {
        return new GetTokenAuth(path,userName, password);
    }

    public static GetTokenAuth withoutCredentials() {
        return new GetTokenAuth();
    }


}
