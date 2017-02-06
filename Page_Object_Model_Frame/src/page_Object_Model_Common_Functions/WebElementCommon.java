package page_Object_Model_Common_Functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommon {
	
	static WebDriver driver;
	
	public static boolean waitForElementPresent(WebDriver driver, WebElement webElement) throws TimeoutException{
		try {
			
			//Thread.sleep(5000);
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				  //Wait for the condition with timeout 30 seconds
				      .withTimeout(60, TimeUnit.SECONDS) 
				        // poll interval of 1 seconds. 
				      .pollingEvery(1, TimeUnit.SECONDS) 
				        //ignore the NoSuchElementException
				      .ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.visibilityOf(webElement));
			return true;
		}catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println(" Failed! -- " +e.getMessage().substring(0, 90));
			return false;
		}catch (TimeoutException e) {
			// TODO Auto-generated catch block
			System.out.println(" Failed! -- " +e.getMessage().substring(0, 90));
			return false;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" Failed! -- " +e.getMessage().substring(0, 90));
			return false;
		}
	}
	
	public static boolean waitForElementPresent(WebElement webElement) throws TimeoutException{
		try {
			//Thread.sleep(5000);
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				  //Wait for the condition with timeout 30 seconds
				      .withTimeout(60, TimeUnit.SECONDS) 
				        // poll interval of 1 seconds. 
				      .pollingEvery(1, TimeUnit.SECONDS) 
				        //ignore the NoSuchElementException
				      .ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.visibilityOf(webElement));
			return true;
		}catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println(" Failed! -- " +e.getMessage().substring(0, 90));
			return false;
		}catch (TimeoutException e) {
			// TODO Auto-generated catch block
			System.out.println(" Failed! -- " +e.getMessage().substring(0, 90));
			return false;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" Failed! -- " +e.getMessage().substring(0, 90));
			return false;
		}
	}

}
