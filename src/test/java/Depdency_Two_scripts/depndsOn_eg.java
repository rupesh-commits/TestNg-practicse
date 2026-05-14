package Depdency_Two_scripts;


import static org.testng.Assert.fail;

import org.testng.TestNGException;
import org.testng.annotations.Test;

import HelperMethods.prioirty;

public class depndsOn_eg  {

	@Test(priority = 0)
	public void register() {
		System.out.println("In the register");
	}

	@Test(priority = 1, dependsOnMethods = "register")
	public void login() {
		fail("defect occur");
		System.out.println("In the login");
	}

	@Test(priority = 2, dependsOnMethods = { "register", "login" })
	public void homepage() throws TestNGException{
		System.out.println("In the homepage");
	}

}
