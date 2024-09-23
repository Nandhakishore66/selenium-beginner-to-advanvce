package Advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		/*What is tooltip?
		 * While we move the mouse to the required field, it shows what should need to entered in that place
		 *  
		 *  How to find the tooltip?
		 *  Retrive the title Attribute from the Locator---->INTERVIEW QUESTION
		 */
		WebElement name=driver.findElement(By.id("age"));
		String toolTip=name.getAttribute("title");
	    System.out.println(toolTip);

	}

}
