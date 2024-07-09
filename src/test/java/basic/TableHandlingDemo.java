package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandlingDemo {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	
		
		List<WebElement> allcols = driver.findElements(By.xpath("//table[@id='productTable']//th"));
		int colsize = allcols.size();
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr"));
		int rowsize = allrows.size();
		
		for(int i=1; i<=rowsize; i++)
		{
			for(int j=1; j<=colsize; j++) 
			{
				WebElement data = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+i+"]/td["+j+"]"));
				String text = data.getText();
				System.out.print(text+" ");
			}
			System.out.println();                    
		}
		
		

	}
}