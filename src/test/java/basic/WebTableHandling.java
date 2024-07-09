package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//WebElement booktable = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[2]"));
		//System.out.println(booktable.getText());
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rowsize = allRows.size();
		List<WebElement> allcols = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		int colssize = allcols.size();
		
		
		for( int i1=2; i1<=rowsize; i1++)
		{
			for( int j1=1; j1<=colssize; j1++) 
			{
	
				String text = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+i1+"]/td["+j1+"]")).getText();
				System.out.print(text+ "   ");
			
			}
			System.out.println();
		}
		
		 List<WebElement> allprices = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[4]"));
		 int sum=0;
		 for(WebElement prices: allprices) 
		 {
			 String text = prices.getText();//300
			 
			 int number = Integer.parseInt(text);
			 
			 sum = sum + number;
		 }
		System.out.println("the total prices:"+sum);
}}