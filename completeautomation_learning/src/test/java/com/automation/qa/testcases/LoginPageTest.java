package com.automation.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.qa.base.TestBase;
import com.automation.qa.pages.CreateAccount;
import com.automation.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	  LoginPage loginPage;
	  CreateAccount createAccount;

@BeforeMethod
public void SetUp() {
	System.out.println("for login till here the code is working fine now inside initialisation method");
	initialisation();
  
	loginPage = new LoginPage();

}

@Test(priority=1)

public void validateCreateAccountPageTitleTest() {

	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, "My Store");

}

@Test(priority=2)

public void loginPageTest() {
	createAccount=loginPage.login();
}

@AfterMethod

public void tearDown() {
	driver.close();
}

}
