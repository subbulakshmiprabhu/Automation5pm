package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class JavascriptExeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://demo.nopcommerce.com/");
		WebElement register = driver.findElement(By.linkText("Register"));
		//register.click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click();", register);
		
		WebElement fname = driver.findElement(By.id("FirstName"));
		
		WebElement male = driver.findElement(By.id("gender-male"));
		
		WebElement lname = driver.findElement(By.id("LastName"));
		
		jse.executeScript("arguments[0].click(); arguments[1].value='selenium123'; arguments[2].value = 'java';", male, fname, lname);
		

	}

}
