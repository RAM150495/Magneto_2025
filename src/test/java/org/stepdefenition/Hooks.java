package org.stepdefenition;

import java.io.IOException;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario() {
		System.out.println("---------------before Scenario-------------------");
		 launchBrowser("chrome");
		 launchurl("https://magento.softwaretestingboard.com/");
		 implicitwait(20);
	}
	
	@After
	public void afterScenario(Scenario sc) throws IOException {
		System.out.println("--------------after Scenario---------------------");
	    String name = sc.getName();
	    takeScreenShot(name);
		closeBrowser();

	}

}
