package page_Object_Model_Common_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebEdit {
	
	 WebDriver driver = null;
	
	public WebEdit(WebDriver driver){
		this.driver = driver;
	}
	
	public static void sendInput(WebDriver driver, WebElement ele, String text){
		if(WebElementCommon.waitForElementPresent(driver, ele))
			ele.sendKeys(text);
	}
	
	public static String getText(WebElement ele){
		String text = null;
		if(WebElementCommon.waitForElementPresent(ele))
			text = ele.getText();
		
		return text;
	}
}
