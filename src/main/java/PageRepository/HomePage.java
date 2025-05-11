package PageRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@data-component='Your Houzz']")
	public WebElement yourHouzzLink;

	public WebElement getYourHouzzLink() {
		return yourHouzzLink;
	}

	@FindBy(xpath = "//button[.='Sign Out']")
	public WebElement signOutLink;

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	@FindBy(xpath = "//span[.='Photos']//ancestor::div[@class='hz-secondary-menu__idea-menu--columns-wrapper']//nav//a[not(@data-cta='View All')]")
	//// span[.='Photos']//ancestor::div[@class='hz-secondary-menu__idea-menu--columns-wrapper']//nav//a[not(@href='https://www.houzz.in/photos/home-design-photos-phbr0-bp~')]
	private List<WebElement> PhotossubLink;

	public WebElement getPhotosLink() {
		return photosLink;
	}

	@FindBy(linkText = "Photos")
	private WebElement photosLink;

	public List<WebElement> getPhotossubLink() {
		return PhotossubLink;
	}

	@FindBy(xpath = "//ul[@data-compid='HOME_IMPROVEMENT--section']//a")
	private List<WebElement> homeImprovementSubLinks;

	public List<WebElement> getHomeImprovementSubLinks() {
		return homeImprovementSubLinks;
	}

	public List<WebElement> getDesign_RenovationSubLink() {
		return design_RenovationSubLink;
	}

	public WebElement getDesign_Renovation() {
		return design_Renovation;
	}

	public WebElement getHome_Improvement() {
		return home_Improvement;
	}

	@FindBy(xpath = "//ul[@data-compid='DESIGN_&_RENOVATION--section']//a")
	private List<WebElement> design_RenovationSubLink;

	@FindBy(partialLinkText = "DESIGN & RENOVATION")
	private WebElement design_Renovation;

	@FindBy(partialLinkText = "HOME IMPROVEMENT")
	private WebElement home_Improvement;

	@FindBy(partialLinkText = "Find Professionals")
	private WebElement findProvesionalLink;

	public WebElement getFindProvesionalLink() {
		return findProvesionalLink;
	}

	@FindBy(xpath = "//span[@class='hz-secondary-menu__menu-wrapper-variant--active  ']//nav//a")
	private List<WebElement> AdvicesSubLinks;

	public List<WebElement> getAdviceSubLinks() {
		return AdvicesSubLinks;
	}

	@FindBy(partialLinkText = "Advice")
	private WebElement AdviceLink;

	public WebElement getAdviceLink() {
		return AdviceLink;
	}
	@FindBy(xpath = "//button[.='Save']")
	private WebElement saveButton;

	
	public WebElement getSaveButton() {
		return saveButton;
	}
	@FindBy(xpath = "//span[@class='icon-font icon-heart hz-header__icon--ideabooks']")
	private WebElement heartIcone;

	public List<WebElement> getAdvicesSubLinks() {
		return AdvicesSubLinks;
	}

	public WebElement getHeartIcone() {
		return heartIcone;
	}
	
	@FindBy(partialLinkText = "View All")
	private WebElement viewALLLink;

	public WebElement getViewALLLink() {
		return viewALLLink;
	}
	public By getSvaedNoti1() {
		return svaedNoti1;
	}

	@FindBy(xpath = "//div[@class='hz-frictionless-save-toast__details']")
	private WebElement svaedNoti;
	
	private By svaedNoti1=By.xpath("//div[@class='hz-frictionless-save-toast__details']");
			

	public WebElement getSvaedNoti() {
		return svaedNoti;
	}
	By footer=By.xpath("//div[@class='hz-compact-footer hz-compact-footer--show']");
	
	public By getFooter() {
		return footer;
	}

	@FindBy(xpath ="//div[@class='hz-compact-footer hz-compact-footer--show']" )
	private WebElement footerSection;

	public WebElement getFooterSection() {
		return footerSection;
	}
	
	@FindBy(xpath = "//span[.='See All']")
	private WebElement seeAll;

	public WebElement getSeeAll() {
		return seeAll;
	}
	
	@FindBy(xpath = "//span[@class='icon-font icon-close ']//preceding-sibling::span")
	private WebElement searchedText;

	public WebElement getSearchedText() {
		return searchedText;
	}
	
	public By searchedText2=By.xpath("//span[@class='icon-font icon-close ']//preceding-sibling::span");
			
	@FindBy(xpath = "//input[@placeholder='Search Houzz']")
	private WebElement searchBar;

	public WebElement getSearchBar() {
		return searchBar;
	}
	@FindBy(xpath = "//span[.='Your Houzz']")
	private WebElement yourhouzztext;

	public WebElement getYourhouzztext() {
		return yourhouzztext;
	}

	
	
	
}
