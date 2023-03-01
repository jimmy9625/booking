package com.co.stepsdefinition.auth;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.MessageUnsuccesAuth;
import questions.Token;
import tasks.auth.GetTokenAuth;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetToken {


    @When("^the user sends a POST request to (.*) with their (.*) and (.*)$")
    public void theUserDoesPeticionGETTo(String path, String userName, String password) {

        theActorInTheSpotlight().attemptsTo(GetTokenAuth.peticionTo(path, userName, password));

    }


    @Then("^the  response body contains (.*)$")
    public void theReponseMessageContainsToken(String atribute) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Token.getBody(atribute), Matchers.equalTo(false)));

    }

    @Then("^the response message should be (.*)$")
    public void theResponseMessageEqualsBadCredentials(String message) {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageUnsuccesAuth.get(),
                Matchers.equalTo(message)));

    }
}
