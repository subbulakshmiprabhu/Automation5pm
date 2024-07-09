package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver browserSetup(String browserName) {
		WebDriver driver = null;
		switch(browserName) {		
		
		case "chrome":
			     WebDriverManager.chromedriver().setup();				
				 driver = new ChromeDriver();
				 break;
				 
		case "firefox":
			  WebDriverManager.firefoxdriver().setup();				
			 driver = new FirefoxDriver();
			 break;
			 
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver =  new EdgeDriver();
			break;
	    default:
	    	System.out.println("NOt a valid browser name");
	    break;
		
		}
		
		
		return driver;
		
		
		
	}

}
