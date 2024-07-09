package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class KeyBoardActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		act.sendKeys(email, "selenium").perform();
		
		//select the text atrl+a
		
		act.keyDown(Keys.LEFT_CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//to copy the text ctrl+c
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//press tab key to move to password field
		
		act.sendKeys(Keys.TAB).perform();
		
		//ctrl+v
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//press two tabs and enter
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		

	}

}
