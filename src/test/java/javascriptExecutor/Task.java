package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basic.BaseClass;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = BaseClass.browserSetup("chrome");
		
		driver.get("https://auth.openai.com/authorize?client_id=TdJIcbe16WoTHtN95nyywh5E4yOo6ItG&scope=openid%20email%20profile%20offline_access%20model.request%20model.read%20organization.read%20organization.write&response_type=code&redirect_uri=https%3A%2F%2Fchatgpt.com%2Fapi%2Fauth%2Fcallback%2Flogin-web&audience=https%3A%2F%2Fapi.openai.com%2Fv1&device_id=7031aa67-a74b-43b0-9026-2ed4db5fe75a&prompt=login&screen_hint=login&ext-statsig-tier=production&ext-oai-did=7031aa67-a74b-43b0-9026-2ed4db5fe75a&state=osGgNCW0l6djZrBgZjlhlQwwgwYjdUc3d-mbHLBmzwg&code_challenge=VV6rA7D2XzsMJEhF4wG2bXKORXzwK3lsr0C-DJkVJ-U&code_challenge_method=S256");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email-input']"));		
		
		JavascriptExecutor java = (JavascriptExecutor) driver;		
		
		java.executeScript("arguments[0].value = 'muralitharan103@gmail.com';",email);
		//WebElement btn = driver.findElement(By.xpath("//button[@class='continue-btn']"));
		
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".continue-btn")));
		((JavascriptExecutor) driver).executeScript("var x= document.getElementsByClassName('continue-btn')[0];"+"x.click();");

		//java.executeScript("arguments[1].click();",btn);
		
		

	}

}
