package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindProfesionalPage extends BasePage {

	public FindProfesionalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getPageTitle() {
		return pageTitle;
	}

	@FindBy(xpath = "//h1[@class='header-1 mt0 mbm hz-professionals-directory-title']")
	private WebElement pageTitle;
	
	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getGetStartedButton() {
		return getStartedButton;
	}

	public WebElement getTitle() {
		return title;
	}

	@FindBy(xpath = "//div[.='Get Matched with Local Professionals']")
	private WebElement title;
	
	@FindBy(xpath = "//div[@class='hz-pro-match-wizard__content']//input")
	private WebElement zipcode;
	
	@FindBy(xpath = " //div[@class='hz-pro-match-wizard__content']//button")
	private WebElement getStartedButton;

	@FindBy(xpath = "//input[@placeholder='Search City, State or ZIP']")
	private WebElement locationSearchBar;

	public WebElement getLocationSearchBar() {
		return locationSearchBar;
	}
	@FindBy(xpath = "//div[@data-container=\"Applied Filters\"]//div[@data-spf-animate-scroll='true']")
	private WebElement selectedMsg;

	public WebElement getSelectedMsg() {
		return selectedMsg;
	}
	@FindBy(id = "hui-collapsible-5-trigger")
	private WebElement profrsionalButton;

	public WebElement getProfrsionalButton() {
		return profrsionalButton;
	}
	@FindBy(xpath = "//label[.='Architects & Building Designers']//input[@class='sc-1pq6trr-1 gBqEvN']")
	private WebElement architecuteOption;

	public WebElement getArchitecuteOption() {
		return architecuteOption;
	}
	
	@FindBy(xpath = "//label[.='Architects & Building Designers']")
	private WebElement Architects_Building_Designers;

	public WebElement getArchitects_Building_Designers() {
		return Architects_Building_Designers;
	}

}
