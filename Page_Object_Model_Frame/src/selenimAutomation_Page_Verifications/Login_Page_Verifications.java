package selenimAutomation_Page_Verifications;

import org.openqa.selenium.WebDriver;

import selenimAutomation_Page_Actions.Login_Page_Action;

public class Login_Page_Verifications {
	WebDriver driver = null;
	
	
	public Login_Page_Verifications(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifySuccesfullLogin(){
		Login_Page_Action loginPA = new Login_Page_Action(driver);
		loginPA.enterUserID("user");
		loginPA.enterPassword("pass");
		loginPA.enterConfirmPassword("pass");
		loginPA.clickSubmit();
		
	}
	
	public Register_Page_Verifications verifySuccesfullLogin1(){
		Register_Page_Verifications inst = new Register_Page_Verifications(driver);
		Login_Page_Action loginPA = new Login_Page_Action(driver);
		loginPA.enterUserID("user");
		loginPA.enterPassword("pass");
		loginPA.enterConfirmPassword("pass");
		loginPA.clickSubmit();
		return inst;
	}

}
