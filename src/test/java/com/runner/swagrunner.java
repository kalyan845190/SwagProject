package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="src/main/resources/feature/swaglabs.feature",//path of feature file
glue= "com/stepdefinition",// the path of stepdefinition file
plugin = {"pretty","html:test-output","json:json_output/cucmber.json","junit:junit_xml/cucumber.xml"},//reports
//tags= {"@TS_01,@TS_02,@TS_03,@TS_04,@TS_05"},
tags= {"@TS_01"},
monochrome=true,//display console output in readable format
strict=true,//checking if any step is not defined in stepdefinition file
dryRun=false// mapping between feature and stepdefinition file
)
public class swagrunner {

}
