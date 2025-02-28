package com.alkosto.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@regresion",
        glue = "com.alkosto.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AgregarProductoRunner {
}
