package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportGenerator {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void openUrl() {

		ExtentSparkReporter spark = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\report\\extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void openGoogle() {

		test = extent.createTest("Navigate to google page").assignAuthor("user1").assignCategory("smoke")
				.assignDevice("windows10");
		driver.get("https://www.google.com/");
		test.log(Status.INFO, "User is getting the title");
		String title = driver.getTitle();

		

	}
@AfterTest
	
	public void quit() {
		extent.flush();
	}
	

}
