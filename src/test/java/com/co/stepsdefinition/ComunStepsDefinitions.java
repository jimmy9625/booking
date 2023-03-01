package com.co.stepsdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;
import questions.CodeStatus;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComunStepsDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a (.*) makes an API request$")
    public void theUscerConsumeApi(String user) {
        theActorCalled(user).whoCan(CallAnApi.at("https://restful-booker.herokuapp.com"));
    }

    @Then("^the response code should be (.*)$")
    public void theCodeResponseIsEqualsTo(Integer code) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CodeStatus.request(),
                Matchers.equalTo(code)));
    }
}
