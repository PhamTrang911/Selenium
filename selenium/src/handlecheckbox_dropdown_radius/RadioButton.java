package handlecheckbox_dropdown_radius;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import Initilization.*;

public class RadioButton extends Init{
 
	public static void main(String[] args) throws Exception {
		
		Setup();
		driver.navigate().to("https://demo.anhtester.com/basic-radiobutton-demo.html");
		Thread.sleep(2000);
		
		WebElement radiobutton1 = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]"));
		 if(radiobutton1.isSelected() == true) {
			 System.out.println("Button1 Clicked!");
			 
		 }else {
			 radiobutton1.click();
			 System.out.println("Button1 Clicked!!!");
		 }
		 Thread.sleep(2000);
		 WebElement radiobutton2 = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[2]/input[1]"));
		 if(radiobutton2.isSelected() == true) {
			 System.out.println("Button2 Clicked!");
			 
		 }else {
			 
			 System.out.println("Button2 Not Clicked!!!");
		 }
		 TearDown();
	}
	
}
