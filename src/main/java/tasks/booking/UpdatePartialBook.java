package tasks.booking;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Patch;
import tasks.auth.GetTokenAuth;
import utils.GenerateBodyRequestPartialUpdate;

public class UpdatePartialBook implements Task {
    private String path;
    private String id;
    private String name;
    private String lastName;

    public UpdatePartialBook(String path, String id, String name, String lastName) {
        this.path = path;
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GetTokenAuth.withoutCredentials());
        String tokenNumber = SerenityRest.lastResponse().jsonPath().getString("token");
        String boyRequest = GenerateBodyRequestPartialUpdate.WhitData(name, lastName);

        actor.attemptsTo(Patch.to(path + "/" + id).with(request ->
                request.headers("Content-Type", "application/json",
                                "Cookie", "token=" + tokenNumber)
                        .body(boyRequest)));

    }

    public static UpdatePartialBook names(String path, String id, String name, String lastName) {
        return new UpdatePartialBook(path, id, name, lastName);
    }


}
