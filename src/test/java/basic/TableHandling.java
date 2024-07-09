package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       // WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//To print a single table data
		
		WebElement data = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr[6]/td[2]"));
		
		System.out.println(data.getText());
		
		//To print all the table datas
		
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@name = 'BookTable' ]//tr"));
		
		int rowSize = allrows.size();
		
		List<WebElement> allcols = driver.findElements(By.xpath("//table[@name = 'BookTable' ]//tr/th"));
		
		int colSize = allcols.size();
		
		for(int i=2; i<=rowSize; i++) {  //7<7
			for(int j=1; j<=colSize; j++) {
				
				String text = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+ "   ");
				
			}System.out.println();
		}
		
		//Read datas based on specific condition
		
		for(int i=2; i<=rowSize; i++) {
			  String author = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+i+"]/td[2]")).getText();
			  
			  if(author.equals("Animesh")) {
				  
				  String bookname = driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+i+"]/td[1]")).getText();
				  
				  System.out.println(bookname);
				  
			  }
			
		}
		
		//To add all the price datas
		
		List<WebElement> allPrices = driver.findElements(By.xpath("//table[@name = 'BookTable' ]//tr/td[4]"));
		
		int sum = 0;
		
		for(WebElement price : allPrices) {
			
			String text = price.getText();
			
			//Double.parseDouble(text);
			
			int num = Integer.parseInt(text);
			
			sum =  sum+num; 
		}
		System.out.println("Total amount is  "+sum);
		
		

	}

}
