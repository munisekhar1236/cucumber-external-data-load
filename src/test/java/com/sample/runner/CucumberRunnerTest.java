package com.sample.runner;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import com.sample.helper.BeforeSuite;
import com.sample.helper.FeatureOverright;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" },
                features = {"src/test/resources/features" },
                glue = {"com/sample/stepdefs" },
                monochrome = true, snippets = SnippetType.CAMELCASE)

@RunWith(CustomCucumberRunner.class)
public class CucumberRunnerTest {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        FeatureOverright.overrideFeatureFiles(System.getProperty("user.dir")+"/src/test/resources/features");
    }
}