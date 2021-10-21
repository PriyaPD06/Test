package Org.gittest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class sample extends BaseClass{

	@BeforeClass
	private void BeforeClass() {
		launchBrowser("Chrome");
		System.out.println("Before class");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	private void afterClass() {
		quitBrowser();
		System.out.println("After class");
	}

	@Test
	private void Test1() {
		launchUrl("https://www.amazon.in/");
		WebElement acc = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		acc.click();
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("dharshini.pd93@gmail.com");
		WebElement login = driver.findElement(By.id("continue"));
		login.click();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Priya$06");
		WebElement contbtn = driver.findElement(By.id("signInSubmit"));
		contbtn.click();
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("iphone 13 pro");
		WebElement button = driver.findElement(By.id("nav-search-submit-button"));
		button.click();
		System.out.println("...........Searching for IPHONE 13 PRO.............");
	}
	@Test
	private void testA() {
		System.out.println("MODEL 01 === Apple iPhone 13 Pro Max (128GB) - Sierra Blue");
		System.out.println("Price === 1,29,900 ");
	}
	@Test
	private void testB() {
		System.out.println("MODEL 02 === Apple iPhone 13 Pro Max (256GB) - Gold");
		System.out.println("Price === 1,39,900 ");
	}
	@Test
	private void testC() {
		System.out.println("MODEL 03 === Apple iPhone 13 (256GB) - Starlight");
		System.out.println("PRICE === 89,900 ");
	}
	@Test
	private void testD() {
		System.out.println("MODEL 04 === Apple iPhone 13 Pro Max (128GB) - Gold");
		System.out.println("PRICE === 1,29,900 ");
	}
	@Test
	private void testE() {
		System.out.println("MODEL 05 === Apple iPhone 13 (256GB) - Starlight");
		System.out.println("PRICE === 89,900 ");
	}
	@Test
	private void testF() {
		System.out.println("MODEL 06 === Apple iPhone 13 (128GB) - Midnight");
		System.out.println("PRICE === 79,900 ");
	}
	
}
