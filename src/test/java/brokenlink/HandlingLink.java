package brokenlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class HandlingLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = BaseClass.browserSetup("chrome");
		
		driver.get("https://www.softwaretestingmaterial.com/#google_vignette");
		
		List<WebElement> atags = driver.findElements(By.tagName("a"));
		int sum =0;
		for(WebElement tag : atags) {
			String url = tag.getAttribute("href");
			int count = LinkChecker.brokenLinkChecker(url);
			
			sum = sum +count;
		}
		System.out.println(sum);
		
	}

}
