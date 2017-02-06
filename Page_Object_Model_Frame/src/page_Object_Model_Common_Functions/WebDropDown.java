package page_Object_Model_Common_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDropDown {
	
	static WebDriver driver=null;
	
	public WebDropDown(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
		


	public static void dropdownact(WebDriver driver, WebElement getdropdownday) {
		
		//if(WebElementCommon.waitForElementPresent(driver, getdropdownday)){
			
			Select sel= new Select(getdropdownday);
			sel.selectByIndex(4);
			
		//}
		
	}


	
	

}
