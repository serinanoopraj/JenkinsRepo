package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // makes the class as runner class
@CucumberOptions(features="features", glue="com.stepdef",
monochrome = true,
dryRun=true,
plugin = {"pretty","html:target/index.html","json:target/myreport.json"}) // To bind the featurefile layer and the step def layer ..Test Case Execution is configured
                               //tells the location of feature file and step def file
public class TestRunner {

}
