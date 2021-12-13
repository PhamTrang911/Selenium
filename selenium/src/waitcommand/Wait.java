package waitcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Initilization.Init;

public class Wait extends Init{
	
	 public static void main(String[] args) throws Exception {
			
			Setup();
			driver.get("https://demoqa.com/");
		     // Create new WebDriver wait
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			String tempTitle = "ToolsQA";
			//get the actual value of the title
			String eTitle = driver.getTitle();
			//compare the actual title with the expected title
			if (eTitle.contentEquals(tempTitle))
			{
			System.out.println( "Test Passed") ;
			}
			else {
			System.out.println( "Test Failed" );
			}
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt='Selenium Online Training']")));

			driver.findElement(By.cssSelector("img[alt='Selenium Online Training']")).click();
			
			TearDown();
			
	    }
}
