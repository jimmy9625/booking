package com.co.stepsdefinition.booking;

import io.cucumber.java.en.When;
import tasks.booking.DeleBooking;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteBookingStepsDefinition {

    @When("^the user sends a DELETE request to (.*) with booking ID (.*)$")
    public void theUserSendsADELETERequestToBookingWithBookingID(String path, String id) {
        theActorInTheSpotlight().attemptsTo(DeleBooking.whit(path, id));

    }

    @When("^the user sends a DELETE request to (.*) with an invalid booking ID (.*)$")
    public void theUserSendsADELETERequestToBookingWithAnInvalidBookingID(String path, String id) {
        theActorInTheSpotlight().attemptsTo(DeleBooking.whit(path, id));
    }
}
