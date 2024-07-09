package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo  {
	WebDriver driver;
	
	@Test(priority = 1, dataProvider = "data")
	
	public void setup(String url) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get(url);
		
	}
	
	@Test(priority=2, dataProvider ="credentialData")
	public void login(String uname, String password) {
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	@DataProvider	
	public Object[] data() {
		//int[] a = {10,20,30};
		
		Object[] arr = {"https://www.facebook.com/"};
		return arr;
		
	}
	@DataProvider	
	public Object[][] credentialData() {
		
		Object[][] arr ={ {"tesng@gmail.com", "123"},
				{"selenium@gmail.com", "456"},
				{"java@gmail.com", "456"}};
		
		return arr;	
		
		
	}
	
	

}
