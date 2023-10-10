package com.NykaaCucumber_IPT.runner;

import org.junit.runner.RunWith;

import com.NykaaCucumber_IPT.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Avadi\\workspace1\\NykaaCucumber_Navin\\src\\test\\resources\\com\\feature\\NykaaSearch.feature",
		"D:\\Avadi\\workspace1\\NykaaCucumber_Navin\\src\\test\\resources\\com\\feature\\NykaaRemove.feature"},
		glue="com.NykaaCucumber_IPT.stepDef", 
		monochrome = true,
		dryRun = false,
		tags = ("@RegressionTest"),
		plugin = {"pretty", "html:Reports/nykaa.html", "json:Reports/nykaa.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends BaseClass {

	
	
	
	
}
