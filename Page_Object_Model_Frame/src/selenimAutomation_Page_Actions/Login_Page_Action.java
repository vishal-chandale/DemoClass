package selenimAutomation_Page_Actions;

import org.openqa.selenium.WebDriver;

import page_Object_Model_Common_Functions.WebButton;
import page_Object_Model_Common_Functions.WebEdit;
import selenimAutomation_Page_Object_Factory.Login_Page_Object_Factory;

public class Login_Page_Action {
	
	WebDriver driver = null;
	
	public Login_Page_Action(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserID(String userID){
		
		Login_Page_Object_Factory loginPF = new 
				Login_Page_Object_Factory(driver);
		
		if(loginPF.getUserID()!=null){
			WebEdit.sendInput(driver ,loginPF.getUserID(), userID);
			
		}else{
			System.out.println("User Id Not found");
		}
	}
	
	public void enterPassword(String password){
		Login_Page_Object_Factory loginPF = new 
				Login_Page_Object_Factory(driver);
		if(loginPF.getPassword()!=null){
			WebEdit.sendInput(driver ,loginPF.getPassword(), password);
		}else{
			System.out.println("password Not found");
		}
	}
	
	public void enterConfirmPassword(String confrimPass){
		Login_Page_Object_Factory loginPF = new 
				Login_Page_Object_Factory(driver);
		if(loginPF.getConfirmPassword()!=null){
			WebEdit.sendInput(driver ,loginPF.getConfirmPassword(), confrimPass);
		}else{
			System.out.println("Confirm Password Not found");
		}
	}
	
	public void clickSubmit(){
		Login_Page_Object_Factory loginPF = new 
				Login_Page_Object_Factory(driver);
		if(loginPF.getSubmitButton()!=null){
			WebButton.sendClick(driver ,loginPF.getSubmitButton());
		}else{
			System.out.println("Submit button Not found");
		}
	}
	
	//code 

}
