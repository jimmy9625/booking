package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Token implements Question<Boolean> {

    private String atribute;

    public Token(String atribute) {
        this.atribute = atribute;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String body = SerenityRest.lastResponse().jsonPath().getString(atribute);
        return body.isEmpty();

    }

    public static Token getBody(String atribute) {
        return new Token(atribute);
    }
}
