package org.stepdefenition;



import org.base.BaseClass;
import org.pom.LoginStep;

import io.cucumber.java.en.*;

public class LoginFeature extends BaseClass {
	LoginStep l;
	
	@When("The user has to click sigin in button")
	public void the_user_has_to_click_sigin_in_button() {
	   l=new LoginStep();
	   click(l.getBtnSignin());
	}
	

	@When("The user has to enter {string} and {string}")
	public void the_user_has_to_enter_and(String email, String password) {
	    sendkeys(l.getTxtEmail(),email );
	    sendkeys(l.getTxtPassword(), password);
	    
	}
    @Then("The user has to click signin button")
	public void the_user_has_to_click_signin_button() {
	    click(l.getBtnSigin());
	    
	}




}
