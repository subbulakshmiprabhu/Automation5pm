package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = BaseClass.browserSetup("chrome");
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=6194568405764232856&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061909&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        
        WebElement order = driver.findElement(By.xpath("//span[text()= 'Your Orders']"));
        
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
        act.moveToElement(order).click().perform();
	}

}
