package tooltip;


import org.openqa.selenium.WebElement;

import initilization.Init;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ToolTip extends Init {
	
	public static void main(String[] args) throws InterruptedException, Exception  {	
	    Setup();
	
	driver.get("http://demo.guru99.com/test/social-icon.html");
	String expectedTooltip = "Git";

	// Find the Github icon at the top right of the header
	WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));

	// get the value of the "title" attribute of the github icon
	String actualTooltip = github.getAttribute("title");

	// Assert the tooltip's value is as expected
	System.out.println("Actual Title of Tool Tip is " + actualTooltip);
	if (actualTooltip.equals(expectedTooltip)) {
		System.out.println("Passed");
	}
}
}