package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvicePage extends BasePage {

	public AdvicePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//h1[@class='hz-browse-galleries__header']")
	private WebElement pageTitle;
	public WebElement getPageTitle() {
		return pageTitle;
	}

	
}
