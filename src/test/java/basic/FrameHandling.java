package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame("singleframe");
		
		driver.switchTo().frame(1);
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@type = 'text']"));
        inputBox.sendKeys("selenium");
        
        driver.switchTo().defaultContent();
        
        
        WebElement btn = driver.findElement(By.xpath("//a[text() = 'Iframe with in an Iframe' ]"));
        btn.click();
        
       // WebElement frame1 = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
        
       // driver.switchTo().frame(frame1);
        
        driver.switchTo().frame(2);
        
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
       // driver.switchTo().frame(frame2);

       
        driver.switchTo().frame(0);
        
        WebElement input2 = driver.findElement(By.xpath("//input[@type = 'text']"));
        input2.sendKeys("testing");
        driver.switchTo().parentFrame();
        
        WebElement htext = driver.findElement(By.xpath("//h5[text() = 'Nested iFrames']"));
        
        System.out.println(htext.getText());
        
       // driver.switchTo().defaultContent();       
        
        
	}

}
