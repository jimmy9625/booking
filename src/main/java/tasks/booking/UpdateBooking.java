package tasks.booking;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;
import tasks.auth.GetTokenAuth;
import utils.GeneretaBodyInfoBooking;

import java.util.List;
import java.util.Map;

public class UpdateBooking implements Task {

    private String id;
    private String path;
    private List<Map<String, String>> info;

    public UpdateBooking(String id, String path, List<Map<String, String>> info) {
        this.id = id;
        this.path = path;
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GetTokenAuth.withoutCredentials());
        String tokenNumber = SerenityRest.lastResponse().jsonPath().getString("token");
        String boyRequest = GeneretaBodyInfoBooking.whit(info);
        actor.remember("body", boyRequest);

        actor.attemptsTo(Put.to(path + "/" + id).with(request ->
                request.headers("Content-Type", "application/json",
                                "Cookie", "token=" + tokenNumber)
                        .body(boyRequest)));


    }

    public static UpdateBooking whit(String id, String path, List<Map<String, String>> info) {
        return new UpdateBooking(id, path, info);
    }
}
