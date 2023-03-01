package tasks.booking;


import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import tasks.auth.GetTokenAuth;

public class DeleBooking implements Task {

    private String path;
    private String id;


    public DeleBooking(String path, String id) {
        this.path = path;
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GetTokenAuth.withoutCredentials());
        String tokenNumber = SerenityRest.lastResponse().jsonPath().getString("token");

        actor.attemptsTo(Delete.from(path + "/" + id).with(request -> request.
                headers("Content-Type", "application/json",
                        "Cookie", "token=" + tokenNumber)));

    }

    public static DeleBooking whit(String path, String id) {
        return new DeleBooking(path, id);
    }
}
