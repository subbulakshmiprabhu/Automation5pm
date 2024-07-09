package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/dropdowns");

		WebElement dropdown = driver.findElement(By.id("fruits"));

		Select s = new Select(dropdown);
//s.selectByIndex(3);
//s.selectByValue("4");
		s.selectByVisibleText("Banana");
		List<WebElement> options = s.getOptions();
		for(WebElement opt:options) {
			System.out.println(opt.getText());
		}

		
		WebElement drop = driver.findElement(By.id("superheros"));
		
		Select s1 = new Select(drop);
		s1.selectByIndex(2);
		s1.selectByValue("bt");
		s1.selectByVisibleText("Black Panther");
		
		//s1.deselectAll();
		System.out.println("Selected options");
		
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		
		for(WebElement e: allSelectedOptions){
			
			System.out.println(e.getText());
			
		}
		
		
	}
}