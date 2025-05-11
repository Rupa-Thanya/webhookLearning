package genericClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtitlity implements FrameWorkConstraints{
	public static Actions action;
	public static JavascriptExecutor je;
	/////////////Select Class
	public static void selectOptionByIndex(WebElement dropdown, int index) {
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public static void selectOptionByValue(WebElement dropdown, String value) {
		Select select=new Select(dropdown);
		select.selectByValue(value);
	}
	
	public static void selectOptionByVisibleText(WebElement dropdown, String  text) {
		Select select=new Select(dropdown);
		select.selectByVisibleText(text);
	}
//	Switch to window using title
	public static void switchToWindowByTitle(WebDriver driver, String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains(title)) {
				break;
			}
		}
		
	}
	
//	Switch to window using URL
	public static void switchToWindowByURL(WebDriver driver, String url) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
			if(driver.getCurrentUrl().contains(url)) {
				break;
			}
		}
		
	}
	
	///////////////////Frames//////////////////////////////////
	
//	Switch to frame using index
	public static void switchToFrameByIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
//	Switch to frame using name or id
	public static void switchToFrameByNameorId(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
//	Switch to frame using webelement
	public static void switchToFrameByWebElement(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	
	/**
	 * this is used to get the SystemDate
	 * @return 
	 */
	public static String getSystemDate() {
		 return LocalDate.now().toString().replace(":", "_");
	}
	
	/**
	 * This method is used to take the screenshot of entire webpage
	 * @param driver
	 */
public static void getScreenshotOfWebPage(WebDriver driver) {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);

	File perm=new File(SCREENSHOT+getSystemDate()+".png");
	
	try {
		FileHandler.copy(temp, perm);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


/**
 * This method is used to take screenshot of webelement
 * @param element
 */
public static void getScreenshotOfWebElement(WebElement element) {
	File temp=element.getScreenshotAs(OutputType.FILE);
	File perm=new File(SCREENSHOT+getSystemDate()+".png");
	try {
		FileHandler.copy(temp, perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
/////////////////////////////method to handle alert
public static void switchToAlertAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}


public static void switchToAlertAndDismiss(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}

public static String switchToAlertAndGetText(WebDriver driver) {
	return driver.switchTo().alert().getText();
}


public static void switchToAlertAndSsndText(WebDriver driver, String text) {
	driver.switchTo().alert().sendKeys(text);
}



/**
 * Method initialize Objects like Actions and JavaScriptExecutor
 */
public static void initObjects(WebDriver driver) {
	action=new Actions(driver);
	je=(JavascriptExecutor) driver;
}
//methods to handle mouse actions
public static void mouseHover(WebElement element) {
	action.moveToElement(element).perform();
}

public static void mouseClick(WebElement element) {
	action.click(element).perform();
}

public static void rightClick( WebElement element) {

action.contextClick(element).perform();

}
public static void dragAndDrop(WebElement source,WebElement target) {
	// TODO Auto-generated method stub
	action.dragAndDrop(source,target).perform();
	
}
public static void clickAndHold(WebElement element) {
	action.clickAndHold(element).perform();
	
}
public static void scrollByAmount(int x,int y) {
	action.scrollByAmount(x,y);

}
public static void scrollToElement(WebElement element) {
	action.scrollToElement(element);
}
public static void scrollFtomOrigin(ScrollOrigin element,int x,int y) {
	action.scrollFromOrigin(element, x, y);

}


/**
 * Method to handle Hidden or Disabled button 
 */
public static void clickOnHiddenOrDisabledElement(WebElement element) {
	
	je.executeScript("arguments[0].click();", element);
}

/**
 * Method to handle Hidden or Disabled text field 
 */
public static void enterTextToHiddenOrDisabledElement(WebElement element, String value) {
	
	je.executeScript("arguments[0].value='"+value+"';", element);
}

/**
 * Method to scroll the window by given x and y value
 */
public static void scrollByXAndYValue( int x, int y) {
	je.executeScript("window.scrollBy("+x+","+y+");");
}


/**
 * Method to scroll the window to the given x and y
 */
public static void scrollToXAndYValue( int x, int y) {
	je.executeScript("window.scrollTo("+x+","+y+");");
}
public static void webDriverWait(WebDriver driver,By element) {
	// TODO Auto-generated method stub
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.presenceOfElementLocated(element));
}

/**
 * method to scroll the window to the top of the webelement
 */
public static void scrollIntoView(WebElement element, boolean position) {
	je.executeScript("arguments[0].scrollIntoView("+position+");",element);
}

/**
 * method to send value using javaScriptExecutor
 */
public static void sendvalue(String values,WebElement element) {
	
	je.executeScript("arguments[0].value()='designer house';",element);
}




}
