package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin extends BasePage {

	public Signin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[.='Sign In']")
	private WebElement signinLink;

	public WebElement getSigninLink() {
		return signinLink;
	}
}
