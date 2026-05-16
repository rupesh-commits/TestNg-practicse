package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.internal.objects.GuiceBackedInjectorFactory;

import BaseUtility.Base;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class tests_script1 extends Base {

	@Test(enabled =false)
	public void test_profile() throws InterruptedException {

		WebElement search_box = driver.findElement(By.id("small-searchterms"));
		search_box.sendKeys("Computer");

		WebElement search_button = driver.findElement(By.xpath("//input[@type='submit']"));
		search_button.click();
		System.out.println("Test profile running");

	}

	@Test(enabled = true)
	public void add_gift_card_script() throws InterruptedException {

		Thread.sleep(2000);

		WebElement gift_link = driver.findElement(By.partialLinkText("$25 Virtual Gift Card"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.scrollToElement(gift_link).click().perform();

		driver.get("https://demowebshop.tricentis.com/25-virtual-gift-card");

		Thread.sleep(2000);
		WebElement recipientname = driver.findElement(By.cssSelector(".recipient-name"));
		recipientname.sendKeys("dfg");

		Thread.sleep(2000);

		WebElement recipientemail = driver.findElement(By.cssSelector(".recipient-email"));
		recipientemail.sendKeys("dfgq@gmail.com");
		Thread.sleep(2000);

		WebElement message = driver.findElement(By.className("message"));
		message.sendKeys("This is dummy message");

		Thread.sleep(2000);

		WebElement qty = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		qty.sendKeys(Keys.CONTROL + "a");
		qty.sendKeys(Keys.DELETE);
		qty.sendKeys("2");

		Thread.sleep(2000);
		WebElement Addbutton = driver.findElement(By.id("add-to-cart-button-2"));
		Addbutton.click();

		Thread.sleep(2000);
		WebElement add_cart = driver.findElement(By.id("add-to-cart-button-2"));
		add_cart.click();

		Thread.sleep(4000);
		
		WebElement shopping_cart = driver.findElement(By.className("ico-cart"));
		shopping_cart.click();

		System.out.println("gift card added sucessfully");
	}
}
