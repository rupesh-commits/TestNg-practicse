package BaseUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver = null;

	@BeforeClass
	public void preCondition() {
		String browser = "Chrome";

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();

		}
		// driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("pre condition");
	}

	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("dfgq@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abcd@1234");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();	
			System.out.println("Before method");

	}

	@AfterMethod
	public static void logout() {
		driver.findElement(By.className("ico-logout")).click();
		System.out.println("After method --logout");
	}

	@AfterClass
	public static void postCondition() {
		System.out.println("post condition");
		driver.close();
	}

}
