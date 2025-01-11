package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationStep extends BaseClass {
	public RegistrationStep() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	private WebElement btnCreate;
	
	
	@FindBy(id="firstname")
	private WebElement txtFirstname;
	
	
	@FindBy(id="lastname")
	private WebElement txtLastname;
	
	
	@FindBy(name="email")
	private WebElement txtEmail;
	
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	
	@FindBy(id="password-confirmation")
	private WebElement txtRepassword;
	
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnCreateAccount;


	public WebElement getBtnCreate() {
		return btnCreate;
	}


	public WebElement getTxtFirstname() {
		return txtFirstname;
	}


	public WebElement getTxtLastname() {
		return txtLastname;
	}


	public WebElement getTxtEmail() {
		return txtEmail;
	}


	public WebElement getTxtpassword() {
		return txtpassword;
	}


	public WebElement getTxtRepassword() {
		return txtRepassword;
	}


	public WebElement getBtnCreateAccount() {
		return btnCreateAccount;
	}
	
}
