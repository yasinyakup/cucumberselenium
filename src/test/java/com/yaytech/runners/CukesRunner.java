package com.yaytech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.concurrent.CompletableFuture;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-report"
        },
        features = "src/test/resources/features",
        glue = "/com/yaytech/step_definitions",
        dryRun = false,
        tags = "@plogin"

)
public class CukesRunner {

//please check the scenario outline and scenario

//        another test commit in test branch


}
