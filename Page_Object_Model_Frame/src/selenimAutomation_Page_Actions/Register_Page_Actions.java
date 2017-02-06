package selenimAutomation_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_Object_Model_Common_Functions.WebButton;
import page_Object_Model_Common_Functions.WebDropDown;
import page_Object_Model_Common_Functions.WebEdit;
import page_Object_Model_Common_Functions.WebRadioButton;
import selenimAutomation_Page_Object_Factory.Register_Page_Object_Factory;


public class Register_Page_Actions {
	
	WebDriver driver= null;
	
	
	public Register_Page_Actions(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void enterFirstName(String Firstname){
		
		Register_Page_Object_Factory registerPF = new 
				Register_Page_Object_Factory(driver);
		
		if(registerPF.getFirst_Name()!=null){
			WebEdit.sendInput(driver ,registerPF.getFirst_Name(), Firstname);
			
		}else{
			System.out.println("Firstname textbox Not found");
		}
	
	}
		public void enterLastName(String Lastname){
			
			Register_Page_Object_Factory registerPF = new 
					Register_Page_Object_Factory(driver);
			
			if(registerPF.getLast_Name()!=null){
				WebEdit.sendInput(driver ,registerPF.getLast_Name(), Lastname);
				
			}else{
				System.out.println("Lastname textbox Not found");
			}
			
		}
		
		public void enterEmailid(String email){
			
			Register_Page_Object_Factory registerPF = new 
					Register_Page_Object_Factory(driver);
			
			if(registerPF.getEmail_Id() !=null){
				WebEdit.sendInput(driver ,registerPF.getEmail_Id(), email);
				
			}else{
				System.out.println("Email textbox Not found");
			}
			
		}
		
		public void enterMobileNo(String mobileno){
			
			Register_Page_Object_Factory registerPF = new 
					Register_Page_Object_Factory(driver);
			
			if(registerPF.getMobile_Number()!=null){
				WebEdit.sendInput(driver ,registerPF.getMobile_Number(), mobileno);
				
			}else{
				System.out.println("mobile textbox Not found");
			}
			
		}
		
		public void selectdaydropdown(){
			
			Register_Page_Object_Factory registerPF = new Register_Page_Object_Factory(driver);
			
			if(registerPF.getdropdownday() !=null){
				WebDropDown.dropdownact(driver, registerPF.getdropdownday());
				
			}else{
				System.out.println("dropdown not found");
			}
			
		}
		
		
		public void selectmonthdropdown(){
			
			Register_Page_Object_Factory registerPF = new Register_Page_Object_Factory(driver);
			
			if(registerPF.getdropdownmonth() !=null){
				WebDropDown.dropdownact(driver, registerPF.getdropdownmonth());
				
			}else{
				System.out.println("dropdown not found");
			}
			
		}
		
		public void selectyeardropdown(){
			
			Register_Page_Object_Factory registerPF = new Register_Page_Object_Factory(driver);
			
			if(registerPF.getdropdownyear() !=null){
				WebDropDown.dropdownact(driver, registerPF.getdropdownyear());
				
			}else{
				System.out.println("dropdown not found");
			}
			
		}
		
		public void selectradiobtn(){
			
			Register_Page_Object_Factory registerPF = new Register_Page_Object_Factory(driver);
			
			if(registerPF.getGender() !=null){
				WebRadioButton.radiobtnact(driver, registerPF.getGender());
				
			}else{
				System.out.println("radio btn not found");
			}
			
		}
		
		
		
		
		public void ClickSubmitbtn( ){
			
			Register_Page_Object_Factory registerPF = new 
					Register_Page_Object_Factory(driver);
			
			if(registerPF.getSubmitbtn() !=null){
				WebButton.sendClick(driver ,registerPF.getSubmitbtn());
				
			}else{
				System.out.println("Submit btn not found");
			}
			
		}
		
		
		
		

}
