package handleCheckbox_Dropdown_Radius;

import org.openqa.selenium.support.ui.*;

import initilization.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DropDownList extends Init{
        public static void main(String[] args) throws Exception {
		
		Setup();
		driver.navigate().to("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		
		
		//-----Handle DropDown Static--------
		WebElement element = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select simpleSelect = new Select(element);
		
		simpleSelect.selectByVisibleText("Wednesday");
		System.out.println("Get Wednesday");
		Thread.sleep(2000);
		
		simpleSelect.selectByIndex(1);
		System.out.println("Click Sunday");
		
		System.out.println("Runned");
		
		TearDown();
		
    }
}