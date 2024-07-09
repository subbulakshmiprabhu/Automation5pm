package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	WebDriver driver;
	@BeforeTest
	@Parameters({"url"})
	public void setUp(String url) {
		WebDriverManager.chromedriver().setup();		
		 driver =  new ChromeDriver();
		driver.get(url);
	}
	@Test
	@Parameters({"userName","passWord"})
	public void login(String username, String passWord) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(passWord);
		driver.findElement(By.name("login")).click();
	}
	
	
	@AfterTest
	
	public void tearDown() {
		
		//driver.close();
	}
	

}
