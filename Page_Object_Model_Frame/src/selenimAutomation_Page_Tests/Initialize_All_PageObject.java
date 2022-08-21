package selenimAutomation_Page_Tests;
import selenimAutomation_Page_Verifications.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Initialize_All_PageObject extends BaseClass{
	
	Login_Page_Verifications loginPV;
	Register_Page_Verifications registerPV;
	
	public Initialize_All_PageObject() {
		// TODO Auto-generated constructor stub
		loginPV = new Login_Page_Verifications(driver);
		registerPV = new Register_Page_Verifications(driver);
		//code 
		
	}

}
