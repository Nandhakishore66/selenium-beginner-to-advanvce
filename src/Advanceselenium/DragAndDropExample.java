package Advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		//Find the element of dragging 
		WebElement from=driver.findElement(By.id("draggable"));
		//Find the element of dropping 
		WebElement to=driver.findElement(By.id("droppable"));
		
		//For performing the  mouse over actions we need to use the class---->ACTIONS
		Actions obj=new Actions(driver);
		
		
		/*doing manual actions only, we return in the Selenium format
		 * first we click and hold the draggable element and move the element to the (droppable)
		 * and release it in the droppable place,, then we use build and perform ----->
		 * for all the actions that we done before should perform
		 */
		obj.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		
		//we have another easy option to do the same operation
		//obj.dragAndDrop(from, to).build().perform();

	}

}
