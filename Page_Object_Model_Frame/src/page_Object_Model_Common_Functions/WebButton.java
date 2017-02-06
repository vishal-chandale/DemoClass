package page_Object_Model_Common_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebButton {
	
	WebDriver driver = null;
	public WebButton(WebDriver driver) {
		this.driver=driver;
	}
	public static void sendClick(WebDriver driver, WebElement ele){
		
		if(WebElementCommon.waitForElementPresent(driver, ele)){
			ele.click();
		}
	}
}
