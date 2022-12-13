package com.adactin.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features =
		"Features/AdactinHotel.feature",
		glue = 
		"com.stepDefination.hotel"
		)

public class Runner {

}
