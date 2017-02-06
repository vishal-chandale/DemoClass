package page_Object_Model_Common_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebLink {
	
	WebDriver driver= null;
	
	public WebLink(WebDriver driver){
		
		this.driver= driver;
				
	}
	
	public void sendClick(WebDriver driver, WebElement ele){
		
		if(WebElementCommon.waitForElementPresent(driver,ele)){
			ele.click();
			
		}
		
	}
	
	

}
