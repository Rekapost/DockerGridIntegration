package docker;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SetupDockerGrid {

		@BeforeTest
		void startDockerGrid() throws IOException, InterruptedException
		{
			Runtime.getRuntime().exec("cmd /c start startDockerGrid.bat");
			Thread.sleep(15000);
		}
	
		@AfterTest
		void stopDockerGrid() throws IOException, InterruptedException
		{
			Runtime.getRuntime().exec("cmd /c start stopDockerGrid.bat");
			Thread.sleep(15000);
			
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); // kills all process closes command prompt
		}	

}
