package com.sample.runner;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import com.sample.core.AfterSuite;
import com.sample.core.BeforeSuite;
import com.sample.core.CustomCucumberRunner;
import com.sample.core.helper.ExternalDataLoad;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@CucumberOptions(plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" },
                features = {"src/test/resources/features" },
                glue = {"com/sample/stepdefs" },
                monochrome = true, snippets = SnippetType.CAMELCASE)

@RunWith(CustomCucumberRunner.class)
public class CucumberRunnerTest {
	static String featureFilePath = System.getProperty("user.dir")+"/src/test/resources/features";
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
    	System.out.println("***************** Started Execution ******************");
        ExternalDataLoad.readExternalData(featureFilePath);
    }
    
    @AfterSuite
    public static void test1() throws InvalidFormatException, IOException {
    	
    	System.out.println("***************** Finished Execution ******************");
    	 ExternalDataLoad.cleanExternalData(featureFilePath);
    	
    }
}