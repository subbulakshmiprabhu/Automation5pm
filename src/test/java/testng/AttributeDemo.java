package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeDemo {
	
	@Test(priority = -2, description= "login test case", timeOut= 2000)
	public void login() {
		Assert.assertTrue(true);
		System.out.println("login method");
	}
	
	@Test(priority = -1, dependsOnMethods = "login", alwaysRun = true)
	public void homepage() {
		System.out.println("homepage method");
	}
	
	@Test(priority = 0, invocationCount = 2, invocationTimeOut = 2000)
	public void productPage() throws InterruptedException {
		Thread.sleep(1900);
		System.out.println("product method");
		
	}
	@Test(priority = 2, enabled = true, expectedExceptions= Exception.class)
	public void addTocartPage() {
		int div = 10/0;
		System.out.println("Addtocart method");
		
	}

}
