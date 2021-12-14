package initilization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Init {

	public static WebDriver driver;
	
	public static void Setup() {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Download\\Program\\chromedriver.exe");
		 
		    driver = new ChromeDriver();
		    // set waiting time = 10s
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            // // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		    //1 - Maximize browser 
	        driver.manage().window().maximize();

	       
	}
	
	public static void TearDown() throws Exception{
		Thread.sleep(2000);
		driver.quit();
	}
 
    
}
