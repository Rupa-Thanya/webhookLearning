package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageRepository.HomePage;
import genericClass.BaseClass;

public class CiTest extends BaseClass {
	SoftAssert soft=new SoftAssert();
	
	@Test()
	public void imgSave() {
		
		HomePage home = new HomePage(driver);
		
		soft.assertEquals(true, home.getYourhouzztext().isDisplayed());

		soft.assertAll();
	}
	

	@Test()
	public void faitetcae() {
		
		HomePage home = new HomePage(driver);
		
		soft.assertEquals(true, home.getYourhouzztext().isDisplayed());

		soft.assertAll();
	}
}
