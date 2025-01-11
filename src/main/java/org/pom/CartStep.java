package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartStep extends BaseClass {
	public CartStep() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="//span[text()='Men']")
	private WebElement goMen;
	
	
	@FindBy(xpath="(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[5]")
	private WebElement goTops;
	
	@FindBy(xpath="(//a[@class='ui-corner-all'])[10]")
	private WebElement goJacket;
	
	@FindBy(xpath="(//div[text()='S'])[1]")
	private WebElement goSize;
	
	
	@FindBy(xpath="(//div[@option-label='Blue'])[1]")
	private WebElement gocolour;
	
	@FindBy(xpath="(//span[text()='Add to Cart'])[1]")
	private WebElement gotocart;
	
	public WebElement getGoMen() {
		return goMen;
	}

	public WebElement getGoTops() {
		return goTops;
	}

	public WebElement getGoJacket() {
		return goJacket;
	}

	public WebElement getGoSize() {
		return goSize;
	}

	public WebElement getGocolour() {
		return gocolour;
	}

	public WebElement getGotocart() {
		return gotocart;
	}

	
}
