package listeners;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase  {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("testng");
		driver.findElement(By.id("pass")).sendKeys("1234");
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void anotherTest() {
		Assert.assertEquals(false, false);
	}
	
	
	
	public void captureScreenshot() throws AWTException, IOException {
		Robot r = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		BufferedImage image = r.createScreenCapture(rect);
		File dest = new File(System.getProperty("user.dir")+"/screenshot/afacebookRobot"+System.currentTimeMillis()+".png");
		ImageIO.write(image, "png", dest);
		
		
	}
	
	
	

}
