package com.co.stepsdefinition.booking;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.BooksIdContatins;
import tasks.booking.GetBooking;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetBookingIdsStepsDefinitions {

    @When("the user sends a GET request to {string}")
    public void theUserDoesPeticionGETTo(String path) {
        theActorInTheSpotlight().attemptsTo(GetBooking.idsWhitpath(path));
    }

    @Then("the user should receive a list of booking IDs in the response body")
    public void theUserObtainsBookingIds() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(BooksIdContatins.inBody(), Matchers.equalTo(true)));
    }
}
