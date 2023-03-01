package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.GenerateBodyRequestPartialUpdate;

public class UpdatePartialBooking implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        String name = SerenityRest.lastResponse().jsonPath().getString("firstname");
        String lastName = SerenityRest.lastResponse().jsonPath().getString("lastname");

        return GenerateBodyRequestPartialUpdate.WhitData(name, lastName);

    }

    public static UpdatePartialBooking getnames() {
        return new UpdatePartialBooking();
    }
}
