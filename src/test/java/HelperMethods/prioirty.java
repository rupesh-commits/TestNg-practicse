package HelperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prioirty {

	@Test(priority = 1)
	public void mi() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mumbaiindians.com");
		Thread.sleep(2000);
		driver.close();
	}

	@Test(priority = 0)
	public void CSK_Team() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.close();
	}

	@Test(priority = 1)
	public void Rcb() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		driver.close();
	}

}
