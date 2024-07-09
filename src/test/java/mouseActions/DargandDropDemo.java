package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class DargandDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome = driver.findElement(By.id("box6"));
		
		WebElement washington = driver.findElement(By.id("box3"));
		
		WebElement italy = driver.findElement(By.id("box106"));
		
		WebElement us = driver.findElement(By.id("box103"));
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, italy).dragAndDrop(washington, us).build().perform();
	}

}
