package listeners;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo extends Testcase implements ITestListener{
	
	  public  void onTestStart(ITestResult result) {
		   System.out.println("onTestStart");
		  }
	  
	  public void onTestSuccess(ITestResult result) {
		    // not implemented
		  System.out.println("onTestSuccess");
		  try {
			captureScreenshot();
		} catch (AWTException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }
	  
	  public  void onTestFailure(ITestResult result) {
		    // not implemented
		  System.out.println("onTestFailure");
		  try {
			captureScreenshot();
		} catch (AWTException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }
	  
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }
	
	  public void onStart(ITestContext context) {
		    // not implemented
		  System.out.println("onStart");
		  }
	  
	  public void onFinish(ITestContext context) {
		    // not implemented
		  System.out.println("onFinish");
		  }
	  


}
