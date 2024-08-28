package designPattern_POM;

import org.openqa.selenium.By;

public class LoginPage extends BaseClass{
	
	By username = By.id("email");
	By password = By.id("pass");
	By login = By.name("login");
	By forgotpwd = By.linkText("Forgotten password?");
	
	
	public void login() {
		driver.findElement(username).sendKeys("selenium@gmail.com");
		driver.findElement(password).sendKeys("123");
		driver.findElement(login).click();
	}
	
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
		
	}

}
