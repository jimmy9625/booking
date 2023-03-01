package tasks.booking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import utils.GeneretaBodyInfoBooking;

import java.util.List;
import java.util.Map;

public class CreateBooking implements Task {

    private String path;
    private List<Map<String, String>> info;

    public CreateBooking(String path, List<Map<String, String>> info) {
        this.path = path;
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String boyRequest = GeneretaBodyInfoBooking.whit(info);
        actor.attemptsTo(Post.to(path).with(
                request -> request.header("Content-Type", "application/json")
                        .body(boyRequest))
        );

        actor.remember("body", boyRequest);

    }

    public static CreateBooking whitPathAndInfo(String path, List<Map<String, String>> info) {
        return new CreateBooking(path, info);

    }
}
