package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"C:\\Users\\hyper\\eclipse-workspace\\com.acucumber.maven\\src\\test\\java\\features"},
glue = {"stepDefinitions"},
monochrome = true,
plugin = {"pretty", "html:target/cucumber.html", "rerun:target/failed_scenarios.txt"},
dryRun = false,
tags = "@A3" 
)
public class TestRunner {

}
