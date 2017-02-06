package selenimAutomation_Page_Object_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Object_Factory {
	
	WebDriver driver = null;
	
	public Login_Page_Object_Factory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="name")
	private WebElement userID;
	
	//@FindBy(name)
	
	public WebElement getUserID(){
		return this.userID;
	}
	
	@FindBy(name="password")
	private WebElement passwordID;
	
	
	public WebElement getPassword(){
		return this.passwordID;
	}
	
	@FindBy(name="confirmpassword")
	private WebElement confirmPasswordID;
	
	public WebElement getConfirmPassword(){
		return this.confirmPasswordID;
	}
	
	@FindBy(name="insert")
	private WebElement submitButton;
	
	public WebElement getSubmitButton(){
		return this.submitButton;
	}
}
