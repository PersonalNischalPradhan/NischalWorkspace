package com.automation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory==Object Repository

	@FindBy(xpath = "//*[@class=\"login\"]")
	WebElement loginButton;

	// constructor of this class
	// Initializing the page object

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public CreateAccount login() {

		loginButton.click();
		return new CreateAccount();

	}
}
