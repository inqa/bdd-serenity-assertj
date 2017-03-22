package io.inqa;

/**
 * Created by Andrew on 18/02/2017.
 */

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

    @RunWith(CucumberWithSerenity.class)

    @CucumberOptions(  monochrome = true,
            tags = "@inprogress",
            features = "src/test/resources/",
            format = { "pretty","html: cucumber-html-reports",
                    "json: cucumber-html-reports/cucumber.json" },
            dryRun = false,
            glue = "io.inqa.steps" )
    public class TestRunner {
    }

