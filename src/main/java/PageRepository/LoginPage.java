package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericClass.FileUtility;
import genericClass.WebDriverUtitlity;

public class LoginPage extends BasePage {
public WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//div[@role='checkbox']")
	private WebElement checkBox;
	
	@FindBy(id = "signIn")
	private WebElement signinButton;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getSigninButton() {
		return signinButton;
	}
	public  void login() {
		// TODO Auto-generated method stub
		Signin sing=new Signin(driver);
		sing.getSigninLink().click();
		username.sendKeys(FileUtility.getProperty("email"));
		password.sendKeys(FileUtility.getProperty("password"));
		checkBox.click();
		signinButton.click();

	}
	public void LogOut() {
		HomePage home=new HomePage(driver);
		WebDriverUtitlity web=new WebDriverUtitlity();
		
		web.mouseHover(home.yourHouzzLink);
		home.signOutLink.click();
	}

}
