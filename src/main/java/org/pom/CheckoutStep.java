package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStep extends BaseClass {
	
	public CheckoutStep() {
		PageFactory.initElements(driver, this);
		
	}
	
	

}
