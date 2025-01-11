package org.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static WebDriver  launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	return driver;
		}
	public static void launchurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		}
	public static void implicitwait(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		

	}
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void click(WebElement e) {
		e.click();

	}
	
	public static void closeBrowser() {
       
            driver.quit();
      
    }
	public static  String getcurrenturl() {
		String url = driver.getCurrentUrl();
		return url;
	

	}
	public static String gettitle() {
		return driver.getTitle();

	}
	
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
	}
	
	public static void movetoElement(WebElement target) {
	       
        Actions a=new Actions(driver);
        
        a.moveToElement(target).perform();
        
        }
	public static void draganddrop(WebElement source,WebElement target) {
		   Actions a=new Actions(driver);
		   a.dragAndDrop(source, target).perform();
		
	}
	public static void selectbyvalue(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public static WebElement findelement(String locatorname, String localValue) {
		WebElement e = null;
		if(locatorname.equals("id")) {
			 e = driver.findElement(By.id(localValue));
			}
		else if(locatorname.equals("name")) {
			e=driver.findElement(By.name(localValue));
		}
		else if(locatorname.equals("xpath")) {
			e=driver.findElement(By.xpath(localValue));
		}
		return e;
		}
	public static void takeScreenShot(String imagename) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ScreenShots\\"+ imagename +".png");
		FileUtils.copyFile(src,des);
		

	}
	public static  boolean waitforurl(long sec,String particularurl) {
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		return w.until(ExpectedConditions.urlContains(particularurl));
	}


}
