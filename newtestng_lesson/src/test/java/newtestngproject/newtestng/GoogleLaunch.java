package newtestngproject.newtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleLaunch {

	WebDriver driver;
	
	@BeforeSuite

	public void setup() {
		System.out.println("this is @BeforeSuite ");
	}


	@BeforeTest
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("the chorme browser has started successfully");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test
	public void VerifyTheTile() {
		System.out.println("this test verifies the title");
		String TitleOfThePage = driver.getTitle();
		System.out.println("The title of the page is:" + TitleOfThePage);
	}
	
	@Test
	public void VerifyTheCurrentURL() {
		System.out.println("This test verifies the current URL ");
		String TheCurrentURL=driver.getCurrentUrl();
		System.out.println("The current URL of the page is:" + TheCurrentURL);
	}
	
	@AfterTest
	public void CloseTheBrowser() {
		System.out.println("This method closed the current open browser");
		driver.close();
	}
		
		@AfterSuite

		public void end() {
			System.out.println("this is @AfterSuite ");
		}

		
	}

