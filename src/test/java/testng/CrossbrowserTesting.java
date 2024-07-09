package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossbrowserTesting {
	WebDriver driver; //instance
	@BeforeTest
	@Parameters({"browser"})
	public void setUp(String browser) {
	
		//local var
		switch(browser) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("provide valid browser name");
		
		}
		
		//return driver;
		
	}
	@Test
	public void login() {
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		System.out.println("Thread id is :"+Thread.currentThread().getId());
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
