package questions;

import com.google.gson.Gson;
import model.InfoBooking;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ReponseBodyCreateBooking implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        InfoBooking infoBooking = SerenityRest.lastResponse().jsonPath().getObject("booking", InfoBooking.class);
        Gson gson = new Gson();
        return gson.toJson(infoBooking);
    }

    public static ReponseBodyCreateBooking booking() {
        return new ReponseBodyCreateBooking();
    }
}
