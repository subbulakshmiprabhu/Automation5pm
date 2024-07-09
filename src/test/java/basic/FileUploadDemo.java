package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement btn = driver.findElement(By.name("upfile"));
		btn.sendKeys("G:\\Subbulakshmi\\Demo\\selenium notes\\selenium_5pm\\WindowsHandling.txt");
		
		WebElement press = driver.findElement(By.xpath("//input[@type = 'submit']"));
		press.click();

	}

}
