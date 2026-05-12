package Basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Launch {
	
	@Test
	public void manin_m1()
	{
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Jay Ganesh");
		
		System.out.println("Welcome to TestNG");
		
	}
	
	@Test
	public void Signin()
	{
		System.out.println("Sign in ");
	}
	
	
	
}
