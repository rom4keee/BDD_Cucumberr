package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith (Cucumber.class)

@CucumberOptions(
        plugin = {"pretty", "html:src/target/cucumber-reports"},
        monochrome = true,
        tags = "@full_test",
        glue = "cucumber.steps",
        features = "src/test/resources/con.cucumber/junit/features"
)

public class CucumberTestRunner {

}


