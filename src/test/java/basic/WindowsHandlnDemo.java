package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlnDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement input = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		input.sendKeys("selenium");
		input.sendKeys(Keys.ENTER);
		List<WebElement> links = driver.findElements(By.xpath("//div[@id = 'wikipedia-search-result-link']/a"));
		for(WebElement link :links) {
			link.click();
		}
		
		String windowHandle = driver.getWindowHandle();//parent window handle
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String windowId : windowHandles) {
			driver.switchTo().window(windowId);
			
			String title = driver.getTitle();
			if(title.equals("Selenium disulfide - Wikipedia")) {
			    System.out.println(title);
			}
			
		}
		
		
		//move to windows using index
		
		List<String> list = new ArrayList<>(windowHandles);
		
		
		for(int i = 0; i<list.size();i++) {
			
			if(!(windowHandle.equals(list.get(i)))) {
			driver.switchTo().window(list.get(i));
			String title = driver.getTitle();
			
			
			 System.out.println(title);
			}
		}
		
	}

}
