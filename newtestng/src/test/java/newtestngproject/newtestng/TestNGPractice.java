package newtestngproject.newtestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {

	@BeforeSuite

	public void setup() {
		System.out.println("this is @BeforeSuite ");
	}

	@BeforeTest

	public void launchBrowser() {
		System.out.println("this is @BeforeTest ");
	}

	@BeforeClass
	public void enterURL() {
		System.out.println("this is @BeforeClass ");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("this is @BeforeMethod");
	}

	@Test

	public void verifyTitle() {
		System.out.println("this is @Test-1");
	}

	@Test

	public void verifyCurrentURL() {
		System.out.println("this is @Test-2");
	}

	@AfterMethod

	public void logoutFromApp() {
		System.out.println("this is @AfterMethod");
	}

	@AfterClass
	public void deleteCookies() {
		System.out.println("this is @AfterClass");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("this is @AfterTest");
	}

	@AfterSuite
	public void generateReport() {
		System.out.println("this is @AfterSuite");
	}

}
