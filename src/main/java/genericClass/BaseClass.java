package genericClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import PageRepository.HomePage;
import PageRepository.LoginPage;

public class BaseClass extends WebDriverUtitlity {
	public WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		// TODO Auto-generated method stub

	}

	@AfterSuite
	public void AfterSuite() {

	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() {
		// TODO Auto-generated method stub

	}

	@BeforeClass
	public void beforeclass() {
		
		
		
		// TODO Auto-generated method stub
		
		String bro=(System.getProperty("browser")!=null)?System.getProperty("browser"):FileUtility.getProperty("browser");
//		String browser = FileUtility.getProperty("browser");
		
		if (bro.contains("Chrome")) {

//			driver = new ChromeDriver();
			
			ChromeOptions options = new ChromeOptions();
		 driver = new ChromeDriver(options);

		} else if (bro.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else
			driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		// TODO Auto-generated method stub
		String url = FileUtility.getProperty("url");
		driver.get(url);
		initObjects(driver);
		LoginPage login = new LoginPage(driver);
		login.login();
	}

	@AfterMethod
	public void afterMethod() {
		LoginPage login = new LoginPage(driver);
		login.LogOut();
	}

}
