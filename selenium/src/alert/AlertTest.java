package alert;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import Initilization.Init;

public class AlertTest extends Init{
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException, Exception  {	
		    Setup();
		    driver.get("https://demoqa.com/alerts");			
 	      	
	        driver.findElement(By.id("alertButton")).click();					
	       		
	        		
	        // Switching to Alert
	        Alert alert = driver.switchTo().alert();		
	        		
	        // Capturing alert message
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	        alert.accept();
	        
	        TearDown();
	        
	}
}
