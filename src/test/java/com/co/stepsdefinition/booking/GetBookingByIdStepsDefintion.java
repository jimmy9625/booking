package com.co.stepsdefinition.booking;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.ResponseGetBookingById;
import tasks.booking.GetBooking;
import utils.GeneretaBodyInfoBooking;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetBookingByIdStepsDefintion {

    @When("^the user sends a GET request to (.*) with the (.*) of the booking$")
    public void theUserDoesPeticionGETToWhitId(String path, String id) {
        theActorInTheSpotlight().attemptsTo(GetBooking.byId(path, id));
    }

    @When("^the user sends a GET request to (.*) with an invalid (.*)$")
    public void theUserDoesPeticionGETToWhitIdInvalid(String path, String id) {
        theActorInTheSpotlight().attemptsTo(GetBooking.byId(path, id));
    }


    @Then("^Confirm the  information is correct in response body$")
    public void confirmTheInformationIsCorrectInResponseBody(List<Map<String, String>> info) {
        String bodyExpected = GeneretaBodyInfoBooking.whit(info);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResponseGetBookingById.body(), Matchers.equalTo(bodyExpected)));

    }
}
