package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRightClick {
	
	public static void main(String[] args) throws InterruptedException {

		// specify the driver location
		 System.setProperty("webdriver.chrome.driver", "D:\\Download\\Program\\chromedriver.exe");

		// instantiate the driver
		WebDriver driver = new ChromeDriver();

		// maximise the window
		driver.manage().window().maximize();

		// specify the URL of the webpage
		driver.get("https://www.google.com/");

		// specify the locator of the search box
		WebElement element = driver.findElement(
				By.name("q"));

		// create an object for the Actions class and pass the driver argument
		Actions action = new Actions(driver);

		// pass the product name that has to be searched in the website
		action.sendKeys(element, "fit.hanu").build().perform();

		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		// Get element title of page
		WebElement elementTitlePage = driver.findElement(By.xpath("//h3[normalize-space()='FIT HANU']"));

		// perform a mouse click on the search button
		action.click(elementTitlePage).build().perform();
		
		WebElement element1 = driver.findElement(
				By.id("socialheading"));
		
		//Double click to element
		action.doubleClick(element1).build().perform();
		
		Thread.sleep(1000);
		
		//Right click to element
		action.contextClick(element1).build().perform();

		Thread.sleep(2000);
		driver.quit();
	}
}

