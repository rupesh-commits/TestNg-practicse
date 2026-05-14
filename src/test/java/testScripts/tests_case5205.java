package testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseUtility.Base;

public class tests_case5205 extends Base {

	@Test
	public void testScript0101() {
		driver.findElement(By.id("small-searchterms")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("Main from test");

	}
}
