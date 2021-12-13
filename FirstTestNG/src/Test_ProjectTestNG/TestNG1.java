package Test_ProjectTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
//import Initilization.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG1 {
	public static WebDriver driver = null;
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Download\\Program\\chromedriver.exe");
		 
	    driver = new ChromeDriver();
	    // set waiting time = 10s
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    //1 - Maximize browser của mình
      driver.manage().window().maximize();

  }

  @Test
  public void Demo1() {
	  driver.navigate().to("https://www.toolsqa.com/testng/testng-test/");
  }
  
  @Test
  public void Demo2() {
	  driver.navigate().to("https://demoqa.com/");
  }
  
  
  @AfterTest
  public void afterTest() {
  }

}
