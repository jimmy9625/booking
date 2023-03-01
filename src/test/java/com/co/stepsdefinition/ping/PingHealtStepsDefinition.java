package com.co.stepsdefinition.ping;

import io.cucumber.java.en.When;
import tasks.ping.Ping;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PingHealtStepsDefinition {

    @When("^the user sends a GET request to (.*)$")
    public void theUserSendsAGETRequestToPing(String path) {
        theActorInTheSpotlight().attemptsTo(Ping.api(path));
    }
}
