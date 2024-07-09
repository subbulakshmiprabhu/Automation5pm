package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class RightClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.partialLinkText("Gmail"));
		
		Actions act = new Actions(driver);
		act.contextClick(gmail).perform();
		

	}

}
