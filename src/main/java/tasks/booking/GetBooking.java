package tasks.booking;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetBooking implements Task {


    private String path;

    public GetBooking(String path) {
        this.path = path;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource(path));

    }

    public static GetBooking idsWhitpath(String path) {
        return new GetBooking(path);
    }

    public static GetBooking byId(String path, String id) {
        return new GetBooking(path + "/" + id);
    }
}
