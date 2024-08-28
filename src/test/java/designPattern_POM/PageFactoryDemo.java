package designPattern_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryDemo {
	
	@FindBy(id = "email")
	public static WebElement username;
	
	@FindBy(id ="pass")
	public static WebElement password;
	
	@FindBy(name = "login")
	public static WebElement loginBtn;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		PageFactory.initElements(driver, PageFactoryDemo.class);
		
		username.sendKeys("selenium@gmail.com");
		password.sendKeys("123");
		loginBtn.click();
	}
	

}
