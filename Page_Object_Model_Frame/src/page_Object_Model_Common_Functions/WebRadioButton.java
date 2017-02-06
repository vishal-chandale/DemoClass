package page_Object_Model_Common_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebRadioButton {
	
	WebDriver driver=null;
	
	public WebRadioButton(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public static void radiobtnact(WebDriver driver, WebElement radio) {
		
		//if(WebElementCommon.waitForElementPresent(driver, getdropdownday)){
			
			radio.click();
		
			
		//}
		
	}
	
	
}
