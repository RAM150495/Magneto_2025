package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginStep extends BaseClass {
	
	public LoginStep() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="(//a[contains(text(),'Sign')])[1]")
	private WebElement btnSignin;
	
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	
	
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	private WebElement btnSigin;
	
	public WebElement getBtnSignin() {
		return btnSignin;
	}



	public WebElement getTxtEmail() {
		return txtEmail;
	}



	public WebElement getTxtPassword() {
		return txtPassword;
	}



	public WebElement getBtnSigin() {
		return btnSigin;
	}

}
