package com.co.runners.ping;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ping/health_check.feature",
        glue = "com.co.stepsdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Ping {
}
