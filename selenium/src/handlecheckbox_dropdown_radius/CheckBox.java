package handlecheckbox_dropdown_radius;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import Initilization.*;

public class CheckBox extends Init{
	
	public static void main(String[] args) throws Exception {
	
	Setup();
	driver.navigate().to("https://demo.anhtester.com/basic-checkbox-demo.html");
	
	driver.findElement(By.id("isAgeSelected")).isSelected();
	//Kiểm tra check box đã được check hay chưa
	Boolean isSelected = driver.findElement(By.id("isAgeSelected")).isSelected();

	//Nếu chưa được check thì click vào ô check box đó
	if(isSelected == false)
	{
		System.out.println("Not Click");
	Thread.sleep(2000);
	   driver.findElement(By.id("isAgeSelected")).click();
		System.out.println("Clicked");
	}else {
		System.out.println("Clicked!!!");
	}
	
	Thread.sleep(500); 

	TearDown();
	
	
  }
}
