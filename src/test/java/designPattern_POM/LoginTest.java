package designPattern_POM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test(priority =2)
	public void verifyLogin() {
		
		login.login();
		
	}
	@Test(priority =1)
	public void verifyTitle() {
		String title = login.getTitle();
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}

}
