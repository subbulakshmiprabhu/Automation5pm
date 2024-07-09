package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class DoubleClickDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement btn = driver.findElement(By.xpath("//button[text() = 'Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(btn).perform();

	}

}
