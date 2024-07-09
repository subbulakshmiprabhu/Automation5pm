package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class DrawBorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].value = 'selenium@gmail.com';", email);
		
		//draw border
		jse.executeScript("arguments[0].style.border='3px solid red';", email);
		
		WebElement login = driver.findElement(By.name("login"));
		
		String bgColor = login.getCssValue("background-color");
		
		System.out.println(bgColor);
		
		String newBgColor = "rgb(235, 9, 39)";
		
		for(int i= 0; i<100;i++) {
		
		jse.executeScript("arguments[0].style.backgroundColor = '"+newBgColor+"'", login);
		
		jse.executeScript("arguments[0].style.backgroundColor = '"+bgColor+"'", login);
		}
		
		jse.executeScript("arguments[0].click();", login);
		
		
		
		
	}

}
