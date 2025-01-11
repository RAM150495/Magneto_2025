package org.runner;

import org.base.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefenition",dryRun=false,monochrome=true,
tags="@Login or @Reg",
plugin= {"pretty",//"html:src//test//resources//Reports//Htmlreport//htmlreport.html",
        "json:src//test//resources//Reports//Jsonreport//report.json",
       // "junit:src//test//resources//Reports//Junitreport//junitreport.xml",
        "rerun:src//test//resources//FailedScenario//failed.txt"
        })

public class TestRunner {
	
	@AfterClass
	public static void report() {
	JvmReport.generateJVMreport("src//test//resources//Reports//Jsonreport//report.json");
             System.out.println("-------report generated--------------");
	}

}
