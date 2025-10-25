package com.cheap.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features ="C:\\Automation\\AutomationMaven\\CheapAir\\src\\test\\java\\com\\cheap\\feature\\OneWay.feature" , 
glue ={"com.cheap.stepdefinition","com.cheap.hooks"},
plugin = {"pretty", "html:target/cucumber-reports/html-report.html", "json:target/cucumber-reports/cucumber.json"},
monochrome = true
)

public class Runner {

}
