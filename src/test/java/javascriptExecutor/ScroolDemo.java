package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class ScroolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://en.wikipedia.org/wiki/India");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 3000);");
		
		WebElement geography = driver.findElement(By.id("Geography"));
		jse.executeScript("arguments[0].scrollIntoView(true)", geography);
		

	}

}
