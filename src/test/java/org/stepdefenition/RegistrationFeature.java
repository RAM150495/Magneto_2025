package org.stepdefenition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pom.RegistrationStep;

import io.cucumber.java.en.*;

public class RegistrationFeature extends BaseClass {
	
	RegistrationStep r;
	@When("The user has to click Create an account button")
	public void the_user_has_to_click_create_an_account_button() {
		r=new RegistrationStep();
		click(r.getBtnCreate());
	    
	}
	@When("The user has to enter the details in required fields")
	public void the_user_has_to_enter_the_details_in_required_fields(io.cucumber.datatable.DataTable data) {
	    List<Map<String, String>> mp = data.asMaps();
	    sendkeys(r.getTxtFirstname(), mp.get(0).get("fname"));
	    sendkeys(r.getTxtLastname(), mp.get(0).get("lname"));
	    sendkeys(r.getTxtEmail(), mp.get(0).get("email"));
	    sendkeys(r.getTxtpassword(), mp.get(0).get("password"));
	    sendkeys(r.getTxtRepassword(), mp.get(0).get("repass"));
	    
	}
	@Then("The user has to click create account button")
	public void the_user_has_to_click_create_account_button() {
	   click(r.getBtnCreateAccount());
	}



	





}
