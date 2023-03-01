package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MessageUnsuccesAuth implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().getString("reason").toString();
    }

    public static MessageUnsuccesAuth get() {
        return new MessageUnsuccesAuth();
    }
}
