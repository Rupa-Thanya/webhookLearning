package testScripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageRepository.AdvicePage;
import PageRepository.FindProfesionalPage;
import PageRepository.HomePage;
import PageRepository.PhotoPage;
import genericClass.BaseClass;

public class HomePageTest extends BaseClass {
	SoftAssert soft = new SoftAssert();
	private static final int MAX_RETRY = 5; // You can adjust the maximum number of retry attempts

	
	public void PhotosLinksTest() throws InterruptedException {

		PhotoPage photo = new PhotoPage(driver);
		HomePage home = new HomePage(driver);
		for (WebElement element : home.getPhotossubLink()) {
			mouseHover(home.getPhotosLink());
			String linkname = element.getText();
			element.click();
			Thread.sleep(2000);
//			webDriverWait(driver,photo.getPageTitle2());
			Reporter.log(photo.getPageTitle().getText(), true);
			boolean value = photo.getPageTitle().getText().contains(linkname);
			soft.assertEquals(value, true);

		}
		soft.assertAll();
	}


//	public void design_renovationLink() throws InterruptedException {
//
//		HomePage home = new HomePage(driver);
//		for (WebElement element : home.getDesign_RenovationSubLink()) {
//
//			FindProfesionalPage findPro = new FindProfesionalPage(driver);
//			mouseHover(home.getFindProvesionalLink());
//			mouseHover(home.getDesign_Renovation());
//			String linkname = element.getText();
//			element.click();
//			Thread.sleep(2000);
//			boolean value = findPro.getPageTitle().getText().contains(linkname);
//			soft.assertEquals(value, true);
//
//		}
//		soft.assertAll();
//	}
	// a[.='Advice']//ancestor::span//a[not(.='Advice' or .='Houzz Discussions')]

//	@Test
//	public  void homeImprovement() throws InterruptedException {
//		HomePage home = new HomePage(driver);
//		    FindProfesionalPage findPro = new FindProfesionalPage(driver);
//		    
//		    for (WebElement element : home.getHomeImprovementSubLinks()) {
//		        mouseHover(home.getFindProvesionalLink());
//		        mouseHover(home.getHome_Improvement());
//		        
//
//		        // Retry mechanism to handle StaleElementReferenceException
//		        int attempts = 0;
//		        while (attempts < MAX_RETRY) {
//		            try {
//		            	String linkname = element.getText();
//		                element.click();
////		                home = new HomePage(driver);
//		                Thread.sleep(2000);
//		                boolean value = findPro.getPageTitle().getText().contains(linkname);
//		                soft.assertEquals(value, true);
//		                break; // Break out of the loop if the operation was successful
//		            } catch (StaleElementReferenceException e) {
//		                // Handle the exception or simply log it
//		                attempts++;
//		            }
//		        }
//		    }
//
//		    soft.assertAll();
//		}

	public void AdvicSubLinks() throws InterruptedException {
		HomePage home = new HomePage(driver);
		for (WebElement element : home.getAdviceSubLinks()) {
			AdvicePage advie = new AdvicePage(driver);
			Thread.sleep(2000);
			mouseHover(home.getAdviceLink());
			Thread.sleep(2000);
			String textname = element.getText();
			Reporter.log(textname, true);
			element.click();
			Thread.sleep(1000);
			boolean value = textname.contains(advie.getPageTitle().getText());
			soft.assertEquals(value, false);

		}
		soft.assertAll();

	}


	public void imgSave() {
		HomePage home = new HomePage(driver);
		home.getSaveButton().click();
//		Thread.sleep(1000);
		webDriverWait(driver, home.getSvaedNoti1());
		soft.assertEquals(true, home.getSvaedNoti().isDisplayed());

		soft.assertAll();
	}
//	@Test
//	public void footerDispaly() throws InterruptedException {
//		HomePage home = new HomePage(driver);
//		scrollByAmount(0,600);
////		webDriverWait(driver, home.getFooter());
////		scrollByXAndYValue(0,500);
//		Thread.sleep(1000);
//		soft.assertEquals(true, home.getFooterSection().isDisplayed());
//		
//		soft.assertAll();
//	}

	/**
	 * verify able to search on search bar by using the text
	 * @throws InterruptedException 
	 * 
	 */

	@Test
	public void searchText() throws InterruptedException {
		HomePage home=new HomePage(driver);
		home.getSearchBar().sendKeys("desinger house");
		String value="desinger house";
		soft.assertEquals(home.getSearchedText().getText().equalsIgnoreCase(value), false);
		soft.assertAll();
		
	}
}
