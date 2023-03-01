package com.co.runners.auth;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/auth/get_token.feature",
        glue = "com.co.stepsdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class GetTokenRunner {
}
