package com.gl.automation.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome = true, strict = false,
        features = "src/test/java/features/",
        glue = { "com.gl.automation.stepdefinations" },
        tags = { "@Regression" }, plugin = { "html:target/cucumber",
                "json:target/cucumber.json", "junit:target/cucumber.xml" })

public class RunnerCukes {

}