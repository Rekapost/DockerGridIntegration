package docker;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest2 {
	
	@Test
	public void test1() throws MalformedURLException {
		 ChromeOptions options = new ChromeOptions();  
		 URL url = new URL ("http://localhost:4444/wd/hub");
		 RemoteWebDriver driver = new RemoteWebDriver(url,options);	
		 driver.get("https://www.google.com/");
		 String ActualTitle =driver.getTitle();			
		 System.out.println("opened correct page :  " + ActualTitle);	
		 driver.quit();
	}

}
