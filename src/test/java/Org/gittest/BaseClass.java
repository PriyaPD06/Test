package Org.gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
	
	public static WebDriver driver;
		
		public static WebDriver launchBrowser(String browserName) {
		
			switch(browserName) {
			
	        case "Chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
	       
	        	default:
	        		
	        	System.err.println("Invalid Browser Name");
	        	break;
			}
			
			return driver;
			
		}
		public static void launchUrl(String url) {
			
			driver.get(url);
			
			}
		
		public static void fillTextBox(WebElement e, String value) {
			e.sendKeys(value);
		}
			public static void btnClick(WebElement e) {
				e.click();
			}
			
			public static void quitBrowser() {
				driver.quit();}
			
			public static String getCurrentURL() {
				String url = driver.getCurrentUrl();
				return url;}
			
			public static String getAttribute(WebElement e) {
				return e.getAttribute("Value");}
			

			public static String getText(WebElement e) {
				return e.getText();}
			
			
		public static void moveToElement(WebElement e) {
			Actions a = new Actions(driver);
			a.moveToElement(e).perform();
			}
		
		public static void dragAndDrop(WebElement src, WebElement des) {
			
			Actions a = new Actions(driver);
			a.dragAndDrop(src, des).perform();}
		public static void selectByIndex(WebElement element, int index) {
			
		Select s = new Select(element);
	    s.selectByIndex(index);
		}
		
		public static WebElement findElement(String locatname, String locator) {
			WebElement e = null;
		if(locatname.equals("id")) {
			e = driver.findElement(By.id(locator));
		}
		else if(locatname.equals("name")) {
			e = driver.findElement(By.name(locator));
		}
		else if (locatname.equals("xpath")) {
			e=driver.findElement(By.xpath(locator));
		}
		return e;
			
		}
		}
