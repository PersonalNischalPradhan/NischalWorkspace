package com.automation.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		// how to read a properties files create the object of properties classs which
		// is already available inside the util package

		try {
			System.out.println("super started");
			prop = new Properties();
			// one more class fileinputstream
			FileInputStream ip = new FileInputStream("C:\\Users\\NISCHAL\\Nischal Java\\completetestproject\\"
					+ "src\\main\\java\\com\\automation\\qa\\config\\config.properties");

			// the fileinputstream class is making a collection/streaming bw the java code
			// and config.property
			// prop.load will all the property
			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("super ended");

	}

//
	public static void initialisation() {
		System.out.println("something is treribily wrong at the begining of ini method");
//		// now accessing the browser
	System.out.println(prop.getProperty("browser"));
//		 create a string variable browserName
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chorme")) {
			System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("the code is working till here 2");
		} else if (browserName.equals("ff")) {
			System.out.println("FF is launched");
		} else {
			System.out.println("no browser is available");
		}
		
	

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}
 }
