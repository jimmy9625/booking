package com.co.stepsdefinition.booking;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.ResponseGetBookingById;
import tasks.booking.UpdateBooking;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UpdateBookingStepsDefinition {

    @When("^the user sends a PUT request to (.*) with the (.*) of the booking to be updated and the updated booking information$")
    public void theUserUpdateBookingIdWhitThisInformationToBooking(String path, String id, List<Map<String, String>> info) {
        theActorInTheSpotlight().attemptsTo(UpdateBooking.whit(id, path, info));

    }

    @Then("the user should see the updated booking information in the response body")
    public void theUserViewInToBodyRespondTheInfoChange() {
        String info = theActorInTheSpotlight().recall("body");
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResponseGetBookingById.body(), Matchers.equalTo(info)));

    }
}
