package com.co.runners.booking;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/booking/create_booking.feature",
        glue = "com.co.stepsdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CreateBooking {
}
