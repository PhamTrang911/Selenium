package frame;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;

import Initilization.Init;

public class FrameTest extends Init{
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException, Exception  {	
	    Setup();
	    
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
  		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
    
			System.out.println("*********We are done***************");
	}
}
