package com.co.stepsdefinition.auth;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.ReponseBodyCreateBooking;
import tasks.booking.CreateBooking;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateBookingStepsDefinition {

    @When("^the user sends a POST request to (.*) with the following information:$")
    public void theUserCreateBookWhitThisInformationToBooking(String path, List<Map<String, String>> info) {
        theActorInTheSpotlight().attemptsTo(CreateBooking.whitPathAndInfo(path, info));

    }

    @Then("the user should receive a response body containing the booking information")
    public void theUserViewTheInfoLikeBodyRespond() {
        String info = theActorInTheSpotlight().recall("body");
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ReponseBodyCreateBooking.booking(), Matchers.equalTo(info)));
    }
}
