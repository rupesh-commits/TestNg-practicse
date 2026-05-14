package Configuration_Anoatation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class config_anotation {

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}

	@AfterClass
	public void aferclass() {
		System.out.println("After class");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("aftertefst");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite");
	}

	@BeforeSuite
	public void beforesuit() {
		System.out.println("Before suite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}

	@Test
	public void demo() {
		System.out.println("Test");
	}

}
