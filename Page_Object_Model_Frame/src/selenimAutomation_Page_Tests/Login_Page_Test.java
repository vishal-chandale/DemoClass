package selenimAutomation_Page_Tests;

import org.testng.annotations.Test;

import selenimAutomation_Page_Verifications.Login_Page_Verifications;
import selenimAutomation_Page_Verifications.Register_Page_Verifications;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Login_Page_Test extends Initialize_All_PageObject{
	//WebDriver driver;	
	
//  @Test
//  public void successfullLogin() {
//	  Login_Page_Verifications loginVF = new Login_Page_Verifications(super.driver);
//	  loginVF.verifySuccesfullLogin();	  
//  }
  
  @Test
  public void successfullLogin1() {
	  
	  //loginPV.verifySuccesfullLogin1();
	  //registerPV.verifyRegister();
	  
	  
	  Login_Page_Verifications loginVF = new Login_Page_Verifications(BaseClass.driver);
	  Register_Page_Verifications regVF = new Register_Page_Verifications(BaseClass.driver);
	  loginVF.verifySuccesfullLogin();
	  regVF.verifyRegister();
  }
  
  
  
  
}
