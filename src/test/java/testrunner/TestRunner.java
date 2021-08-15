package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="Features",
glue="stepDefinition",
tags="@FacebookLogin,@Assignment2",
format={"pretty","html:test-output","json:json-output"},
monochrome=true,
dryRun=false
)
public class TestRunner {

}
