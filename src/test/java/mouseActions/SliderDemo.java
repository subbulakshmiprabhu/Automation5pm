package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement min = driver.findElement(By.xpath("//div[@id = 'slider-range']//span[1]"));
		WebElement max = driver.findElement(By.xpath("//div[@id = 'slider-range']//span[2]"));
		
		Point location = min.getLocation();
		System.out.println(location);
		
		Point maxlocation = max.getLocation();
		System.out.println(maxlocation);
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(min, 100, 250).perform();
		act.dragAndDropBy(max, -150, 250).perform();

	}

}
