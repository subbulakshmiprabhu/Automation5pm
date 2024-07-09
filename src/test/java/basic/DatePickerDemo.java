package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		WebElement input = driver.findElement(By.id("datepicker"));
		input.sendKeys("06/19/2024");
		
		String dateStr = "13";
		String month = "September";
		String yr = "2024";
		
		while(true) {
		String mon = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
		if(month.equals(mon) && yr.equals(year)) {
			break;
		}		
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		}
		
		
		//to pick the date
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']//tr/td/a"));
		for(WebElement date:allDates) {
			String text = date.getText();
			if(dateStr.equals(text)) {
				date.click();
			}
			
		}

	}

}
