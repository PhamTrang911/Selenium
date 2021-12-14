package popup;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;

import initilization.*;

public class PopupTest extends Init{
	public static void main(String[] args) throws InterruptedException {
	Setup();	
	driver.get("http://demo.guru99.com/popup.php");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
	
	// Lưu lại lớp window đầu tiên 
	String MainWindow = driver.getWindowHandle();
	System.out.println(MainWindow);
	
	// Get all new opened window.
	Set<String> windows = driver.getWindowHandles();
	
	//Set là một Collection không thể chứa các phần tử trùng lặp.
	//Cách duyệt từng phần tử không trùng lặp trong Collection (Set)
	for(String window : windows){
		System.out.println(window);
		if (!MainWindow.equalsIgnoreCase(window)) {
			//Switch to Child window
			driver.switchTo().window(window);
			Thread.sleep(2000);
			System.out.println("�?ã chuyển đến lớp Window con");
			driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
			driver.findElement(By.name("btnLogin")).click();
			// Closing the Child Window.
			Thread.sleep(2000);
			driver.close();
		}
	}
	// Switching to Parent window (Main Window)
	driver.switchTo().window(MainWindow);
	System.out.println("�?ã chuyển v�? lớp Window chính: "+ driver.getTitle());
   }
}