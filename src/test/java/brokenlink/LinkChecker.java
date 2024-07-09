package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LinkChecker {
	
	public static int brokenLinkChecker(String urlStr) {
		int count =0;
		try {
			URL url = new URL(urlStr);
			HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
			httpurl.connect();
			
			int responseCode = httpurl.getResponseCode();
			
			if(responseCode>=400) {
				System.out.println("Given link is a broken link."+urlStr);
				count++;
				
			}else {
				System.out.println("Given link is a valid link"+urlStr);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

}
