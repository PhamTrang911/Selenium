package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import initilization.Init;


public class jsExecute extends Init{

	
	public static void main(String[] args) throws Exception {
		Setup();
		// Creating the JavascriptExecutor interface object
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://anhtester.com/");
		Thread.sleep(1000);
		
		// Click on "Website Testing" module using JavascriptExecutor
		WebElement button = driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']"));
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(1000);
		
		// Get page title and Domain using JavascriptExecutor
		String titleText = js.executeScript("return document.title;").toString();
		System.out.println("Page Title is: " + titleText);

		String domainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain is: " + domainName);

		// Add Alert window using JavascriptExecutor
		js.executeScript("alert('Successfully Logged In');");
	
	
	}
	
}
