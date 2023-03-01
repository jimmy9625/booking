package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class BooksIdContatins implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        List<String> strings = SerenityRest.lastResponse().jsonPath().getList("bookingid");

        if (!strings.isEmpty())
            return true;
        else
            return false;
    }

    public static BooksIdContatins inBody() {
        return new BooksIdContatins();
    }
}
