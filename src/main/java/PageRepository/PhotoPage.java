package PageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotoPage extends BasePage {

	public PhotoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//h1[@class='browse-result-set-title browse-photo__resultset-header__title']")
	private WebElement pageTitle;

	public WebElement getPageTitle() {
		return pageTitle;
	}
	 By pageTitle2=By.xpath("//h1[@class='browse-result-set-title browse-photo__resultset-header__title']");

	public By getPageTitle2() {
		return pageTitle2;
	}
	 
	

}
