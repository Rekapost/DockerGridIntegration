package docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class FirefoxTest {
	
	@Test
	public void test() throws MalformedURLException {
		 FirefoxOptions options = new FirefoxOptions();  
		 URL url = new URL ("http://localhost:4444/wd/hub");
		 RemoteWebDriver driver = new RemoteWebDriver(url,options);	
		 driver.get("https://www.flipkart.com/");
		 String ActualTitle =driver.getTitle();			
		 System.out.println("opened correct page :  " + ActualTitle);	
		 driver.quit();
	}
}
