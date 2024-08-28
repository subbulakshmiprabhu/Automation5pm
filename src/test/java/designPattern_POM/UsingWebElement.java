package designPattern_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebElement {
	
	
	public static WebElement email;
	public static WebElement pass;
	public static WebElement login;
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		PageFactory.initElements(driver, UsingWebElement.class);
		email.sendKeys("selenium");
		pass.sendKeys("123");
		login.click();
	}
	
	

}
