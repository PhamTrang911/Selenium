package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import initilization.Init;

public class Locators extends Init {
	
	
		public static void main(String[] args) throws Exception {
			
			Setup();
			driver.navigate().to("https://login.yahoo.com/");
	        Thread.sleep(2000);
	        
	      //id locator for text box
	        driver.findElement(By.id("login-username")).sendKeys("phamtrang361@yahoo.com"); 
	        Thread.sleep(3000);
	        
	      //linkText locator for links
	        driver.findElement(By.linkText("Forgot username?")).click();
	        Thread.sleep(2000);
	        driver.navigate().back();
	        
	      //name locator for next button
	        WebElement nextBtn = driver.findElement(By.name("signin"));
	        nextBtn.click();
	        Thread.sleep(2000);
	        
	        // CSS Selector with tag and class for password field
	        WebElement pw = driver.findElement(By.cssSelector("input.password"));
	        pw.sendKeys("duyen123!");
	        Thread.sleep(2000);
	        
	        //XPath for next button with id attribute
	        WebElement btn = driver.findElement(By.xpath("//button[@id='login-signin']"));
	        btn.click();
	        Thread.sleep(2000);
	        
	    	TearDown();
	        
     }
}