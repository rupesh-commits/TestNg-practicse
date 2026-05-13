package Anotations;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CricketTeams {
	@Test
	public void Mi_Team() throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.mumbaiindians.com");
		Thread.sleep(2000);
		driver.close();
		
	}
	@Test
	public void ZSK_Team() throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void Rcb() throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		driver.close();
	}
	

}
