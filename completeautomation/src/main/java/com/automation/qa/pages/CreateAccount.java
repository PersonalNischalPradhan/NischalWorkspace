package com.automation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.qa.base.TestBase;




public class CreateAccount extends TestBase{
	
	//Page Factory==Object Repository
	
		@FindBy(name="email")
		WebElement email;
		
		
		@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
		WebElement createAccountButton; 
		
		//constructor of this class
		//Initializing the page object
		
		public CreateAccount() { 
		PageFactory.initElements(driver,this);
			
		}
		
		//Actions:
		public String validateCreateAccountPageTitle(){
			return driver.getTitle();
			
		}
		
		public HomePage create(String em) {
			email.sendKeys(em);
			
			createAccountButton.click();
			return new HomePage();
		}

}
