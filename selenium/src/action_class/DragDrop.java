package action_class;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragDrop {
	public static void main(String[] args) throws InterruptedException {

		// specify the driver location
		 System.setProperty("webdriver.chrome.driver", "D:\\Download\\Program\\chromedriver.exe");

		// instantiate the driver
		WebDriver driver = new ChromeDriver();

		// maximise the window
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		// Element which needs to drag.
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		// Element on which need to drop.
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		Actions action = new Actions(driver);
		Thread.sleep(1000);
		// Dragged and dropped.
		action.dragAndDrop(From, To).build().perform();
		
		Thread.sleep(1000);
		// Drag and Drop by Pixel.
		WebElement from_5000 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		action.dragAndDropBy(from_5000, 168, 40).build().perform();

		Thread.sleep(2000);
		
		
		
	}
}
