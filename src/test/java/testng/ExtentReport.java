package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
	
	
	ExtentReports extent;
	WebDriver driver;
	ExtentTest test ;
	@BeforeTest
	public void setup() {
		
		// directory where output is to be printed
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\report\\extentReport.html");
		 extent = new ExtentReports();
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}
	
	@Test
	public void login() throws IOException {
	 test = extent.createTest("Navigate to google page").assignAuthor("User1").assignCategory("smoke").assignDevice("windows10");
		
		driver.get("https://www.google.com/");
		
		test.log(Status.INFO, "User is getting the title");
		
		String title = driver.getTitle();
		if(title.equals("Googlee")) {
			test.log(Status.PASS, "Title matched");
		}else {
			test.log(Status.FAIL, "Title mismatched");
			captureScreenshot();
		}
		
	}
	
	@AfterTest
	
	public void tearDown() {
		extent.flush();
	}
	
	
	public void captureScreenshot() throws IOException {
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		
		File source = tks.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/google"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(source, dest);
		
		test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(dest.getAbsolutePath()).build());
		
		
		
	}
	@Test
	public void test2() {
		
		 test = extent.createTest("Login  page").assignAuthor("user2").assignCategory("sanity").assignDevice("windows11");
		test.log(Status.INFO, "user is logging");
		// test.log(Status.PASS, "test case got passed");
		test.pass("test case got passed");
		//test.fail("test case got failed");
	}
	

}
