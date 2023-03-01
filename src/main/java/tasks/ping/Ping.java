package tasks.ping;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class Ping implements Task {

    private String path;

    public Ping(String path) {
        this.path = path;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(path));
    }

    public static Ping api(String path) {
        return new Ping(path);
    }
}
