package Advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		//We Need to add (/li) Then only it consider all the elements which is presented after the unordered list
		//List=findElements
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		WebElement fromElement=list.get(5);
		WebElement toElement=list.get(0);
		
		//Drag and drop= We need to use the Actions class
		Actions actions=new Actions(driver);
		actions.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build().perform();
				
		

	}

}
