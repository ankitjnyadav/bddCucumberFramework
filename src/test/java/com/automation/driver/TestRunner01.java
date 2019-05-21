package com.automation.driver;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/main/resources/com/automation/feature"
        },
        glue = { "classpath:com/automation" },
        tags = { "@Demo" }
        )
public class TestRunner01 {

}
