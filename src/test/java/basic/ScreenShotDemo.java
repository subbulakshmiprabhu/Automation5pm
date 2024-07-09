package basic;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("selenium@gmail.com");
		
		//captureScreenShot(driver);
		completeScreenShot();
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123");
		
		//captureScreenShot(driver);
		
		completeScreenShot();
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		
		//captureScreenShot(driver);
		completeScreenShot();
	}
	
	
	
	public static void captureScreenShot(WebDriver driver) throws IOException {
		
		SimpleDateFormat dateformatter = new SimpleDateFormat("dd-MM-yyyy h-m-s");
		
		Date date = new Date();
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		
		File image = tks.getScreenshotAs(OutputType.FILE);
		
		//File dest = new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
		
		File dest = new File("./screenshot/facebook"+dateformatter.format(date)+".png");
		
		FileUtils.copyFile(image, dest);
		
		
		
	}
	
	public static void completeScreenShot() throws AWTException, IOException {
		
		Robot r =  new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		BufferedImage image = r.createScreenCapture(rect);
		File dest = new File("./screenshot/robot"+System.currentTimeMillis()+".png");
		ImageIO.write(image, "png", dest);
		
		
		
	}

}
