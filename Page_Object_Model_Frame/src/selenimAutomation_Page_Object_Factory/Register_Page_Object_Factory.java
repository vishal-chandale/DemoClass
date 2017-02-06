package selenimAutomation_Page_Object_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page_Object_Factory {
	
	
	WebDriver driver = null;
	
	public Register_Page_Object_Factory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="First_Name")
	private WebElement First_Name;
	
	public WebElement getFirst_Name(){
		return this.First_Name;
	}

	
	@FindBy(name="Last_Name")
	private WebElement Last_Name;
	
	public WebElement getLast_Name(){
		return this.Last_Name;
	}
	
	@FindBy(name="Email_Id")
	private WebElement Email_Id;
	
	public WebElement getEmail_Id(){
		return this.Email_Id;
	}
	
	@FindBy(name="Mobile_Number")
	private WebElement Mobile_Number;
	
	public WebElement getMobile_Number(){
		return this.Mobile_Number;
	}
	
	@FindBy(name="Gender")
	private WebElement Gender;
	
	public WebElement getGender(){
		return this.Gender;
	}
	
	@FindBy(name="insert")
	private WebElement Submitbtn;
	
	public WebElement getSubmitbtn(){
		return this.Submitbtn;
	}
	
	
	@FindBy(name="Birthday_day")
	private WebElement dropdownday;
	
	public WebElement getdropdownday(){
		return this.dropdownday;
	}
	
	@FindBy(name="Birthday_Month")
	private WebElement dropdownmonth;
	
	public WebElement getdropdownmonth(){
		return this.dropdownmonth;
	}
	
	@FindBy(name="Birthday_Year")
	private WebElement dropdownyear;
	
	public WebElement getdropdownyear(){
		return this.dropdownyear;
	}
	
	
	

}
