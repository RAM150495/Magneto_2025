package org.stepdefenition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pom.CartStep;
import org.pom.LoginStep;


import io.cucumber.java.en.*;

public class CartFeature extends BaseClass{
	LoginStep l;
	CartStep c;

	@When("The user has to enter email and password")
	public void the_user_has_to_enter_email_and_password(io.cucumber.datatable.DataTable data) {
		l=new LoginStep();
	    List<Map<String, String>> mp = data.asMaps();
	    sendkeys(l.getTxtEmail(), mp.get(0).get("email"));
	    sendkeys(l.getTxtPassword(), mp.get(0).get("password"));
	   }
	@Then("User has to got to mens category  under Top select jacket")
	public void user_has_to_got_to_mens_category_under_top_select_jacket() {
		c=new CartStep();
		
		
		movetoElement(c.getGoMen());
		System.out.println("men selected");
		movetoElement(c.getGoTops());
		click(c.getGoJacket());
		
		
		
	}
	@Then("user has to select the product and select size and colour")
	public void user_has_to_select_the_product_and_select_size_and_colour() {
	  click(c.getGoSize());
	  click(c.getGocolour());
	 
	}
	@Then("The user has click add to cart")
	public void the_user_has_click_add_to_cart() throws InterruptedException {
		 click(c.getGotocart());
		 Thread.sleep(1000);
	}




}
