package Advanceselenium;

import java.util.List;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		/*What is selectable?
		 * When we select normal we should able to select only one element..
		 * But if we select along with ctrl key we can select multiple elements.. this is known as selectable
		 */
		
		/*Ol=ordered list. Actually, we 1st consider the id, name, class.
		 * but in this we 1st consider the xpath, because it consider we selected only 1 element.
		 * even in xpath also it assumed as only one element(ol) so we need to add(/li)---> in
		 * the xpath----> which means consider the element which presented after orderlist
		 */
		//finding more than 1element means use(findelements)
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		//check the size of the list
		int size=selectable.size();
		System.out.println(size);
		
	//For doing keyboard and mouse over actions-----> use Actions Class
		
		Actions obj=new Actions(driver);
		
		/*keydown---> simulates the key is pressed 
		 * (keys.CONTROL)--->tells that which key needs to be pressed
		 * click(selectable.get(o)--->then we need to click the element--->which element
		 * --->The element which is stored in the 0th index of selectable(ordered list)
		 * build perform---> if we use actions then we need to use thsi to perform the operations
		 * 
		 */
		obj.keyDown(Keys.CONTROL).click(selectable.get(0))
		.click(selectable.get(1)).click(selectable.get(2)).click(selectable.get(3)).build()
		.perform();
		
		//Another simple way to perform
		/*obj.clickAndHold(selectable.get(0)).clickAndHold(selectable.get(1))
		.clickAndHold(selectable.get(2)).build().perform();*/
		
		

	}

}
