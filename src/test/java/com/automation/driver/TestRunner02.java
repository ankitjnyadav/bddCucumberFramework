package com.automation.driver;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/main/resources/com/automation/feature"
        },
        dryRun = true,
        strict = false,
        monochrome = false,
        plugin = {
                "html:build/reports/crud-htmlreport",
                "json:build/reports/crud-report.json"
        },
        glue = { "classpath:com/automation" },
        tags = { "@Demo" }
        )
public class TestRunner02 {

}
