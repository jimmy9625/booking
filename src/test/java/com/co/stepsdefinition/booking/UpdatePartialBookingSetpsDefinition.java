package com.co.stepsdefinition.booking;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.UpdatePartialBooking;
import tasks.booking.UpdatePartialBook;
import utils.GenerateBodyRequestPartialUpdate;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UpdatePartialBookingSetpsDefinition {
    @When("^the user sends a PATCH request to (.*) with the booking (.*) and changes the (.*) and (.*) fields$")
    public void theUserSendsAPATCHRequestToBookingWithTheBookingAndChangesTheJuanitoAndPerezFields(String path, String id, String name, String lastname) {
        theActorInTheSpotlight().attemptsTo(UpdatePartialBook.names(path, id, name, lastname));
    }

    @Then("^the user should see the updated (.*) and (.*) fields in the booking$")
    public void theUserShouldSeeTheUpdatedJuanitoAndPerezFieldsInTheBooking(String name, String lastname) {
        String namesExped = GenerateBodyRequestPartialUpdate.WhitData(name, lastname);

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(UpdatePartialBooking.getnames(), Matchers.equalTo(namesExped)));

    }
}
