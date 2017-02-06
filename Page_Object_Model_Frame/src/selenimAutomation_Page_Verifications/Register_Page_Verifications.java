package selenimAutomation_Page_Verifications;

import org.openqa.selenium.WebDriver;

import selenimAutomation_Page_Actions.Login_Page_Action;
import selenimAutomation_Page_Actions.Register_Page_Actions;

public class Register_Page_Verifications {
	
	WebDriver driver;
	
	
	public Register_Page_Verifications(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void verifyRegister(){
		
		Register_Page_Actions regact= new Register_Page_Actions(driver);
		regact.enterFirstName("test");
		regact.enterLastName("test");
		regact.enterEmailid("abc@gmail.com");
		regact.enterMobileNo("8526589633");
		regact.selectdaydropdown();
		regact.selectmonthdropdown();
		regact.selectyeardropdown();
		regact.selectradiobtn();
		regact.ClickSubmitbtn();
			
		
	}

	
}
