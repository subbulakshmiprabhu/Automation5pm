package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	@Test
	public void login() {
		
		//Assert.assertEquals(10, 15);
		Assert.assertTrue(true); //hard assertion
		
		System.out.println("Afetr hard assertion");
		
	}
	@Test
	public void homepage() {
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(false, true);		
		System.out.println("After soft assertion.");
		s.assertAll();
		
	}

}
