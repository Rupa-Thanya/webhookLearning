package testScripts;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageRepository.FindProfesionalPage;
import PageRepository.HomePage;

import genericClass.BaseClass;
import genericClass.FileUtility;

public class ProfessionalPageTest extends BaseClass {
	SoftAssert soft = new SoftAssert();

	@Test
	public void openingPage() {
		HomePage home = new HomePage(driver);
		FindProfesionalPage pro=new FindProfesionalPage(driver);
		home.getSeeAll().click();
		soft.assertEquals(true, pro.getTitle().isDisplayed());
		soft.assertAll();
	}
@Test
	public void zipcodeTest() {
		HomePage home = new HomePage(driver);
		FindProfesionalPage pro=new FindProfesionalPage(driver);
		home.getSeeAll().click();
		pro.getZipcode().clear();
		pro.getZipcode().sendKeys(FileUtility.getProperty("zipcode"));
		pro.getGetStartedButton().click();
		Set<String> ids = driver.getWindowHandles();
		boolean value = false;
		for (String window : ids) {
			driver.switchTo().window(window);

			if (driver.getCurrentUrl().equalsIgnoreCase(FileUtility.getProperty("allprovesionalUrl"))) {
				value = true;
				break;
			}
		}
		soft.assertEquals(true, value);
		soft.assertAll();
	}

	
	public void locationzipCode()  {
		HomePage home = new HomePage(driver);
		FindProfesionalPage pro=new FindProfesionalPage(driver);
		home.getSeeAll().click();
		pro.getLocationSearchBar().click();
		pro.getLocationSearchBar().clear();
		pro.getLocationSearchBar().sendKeys(FileUtility.getProperty("zipcode"),Keys.ENTER);
		soft.assertEquals(pro.getSelectedMsg().getText().contains(FileUtility.getProperty("zipcode")),true);
		soft.assertAll();
	}
	
	public void locationByCity() {
		HomePage home = new HomePage(driver);
		FindProfesionalPage pro=new FindProfesionalPage(driver);
		home.getSeeAll().click();
		pro.getLocationSearchBar().click();
		pro.getLocationSearchBar().clear();
		pro.getLocationSearchBar().sendKeys("chennai",Keys.ENTER);
		soft.assertEquals(pro.getSelectedMsg().getText().contains("cheenai"),true);
		soft.assertAll();
	}
	
	public void ProfesionalCategoryDropDown() {
		HomePage home = new HomePage(driver);
		FindProfesionalPage pro=new FindProfesionalPage(driver);
		home.getSeeAll().click();
		pro.getProfrsionalButton().click();
		pro.getArchitecuteOption().click();
		soft.assertEquals(pro.getArchitects_Building_Designers().getText().contains(pro.getSelectedMsg().getText()),true);
		soft.assertAll();
	}
	
}
