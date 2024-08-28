package designPattern_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	static LoginPage  login = new LoginPage();
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

}
