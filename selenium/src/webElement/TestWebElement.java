package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestWebElement {
	public static void main(String[] args) throws Exception {
		    System.setProperty("webdriver.chrome.driver", "D:\\Download\\Program\\chromedriver.exe");
		 
		    WebDriver driver = new ChromeDriver();
		    // set waiting time = 10s
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    //1 - Maximize browser của mình
	        driver.manage().window().maximize();
	        
	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	        
	        WebElement un = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	        un.click();
	        un.sendKeys("admin");
	        WebElement ps = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	        ps.click();
	        ps.sendKeys("admin123");
	        WebElement bt = driver.findElement(By.xpath("//input[@id='btnLogin']"));
	        bt.click();
	        
	        driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	        driver.findElement(By.xpath("//a[normalize-space()='User Management']")).click();
	        driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
	        driver.findElement(By.xpath("//select[@id='systemUser_status']")).click();
	        
	         WebElement stt_disable = driver.findElement(By.xpath("//select[@id='systemUser_status']"));
	         stt_disable.click();
	
	        Thread.sleep(5000);
	        
	        driver.quit();
	        
	
	}
}
