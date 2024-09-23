package Advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		//1st we need to find the element
		WebElement find=driver.findElement(By.id("tags"));
		find.sendKeys("s");
	/* once "s" is typed it take some time to reveal the related values but it is to fast 
	 * so we need to write the explicit wait
	 */
		Thread.sleep(4000);
		
	
	//once i type s in the text box the (ul) is blinks. in that there are list of values
		
       //After the xpath of (ul),we add the (/li)--->means it consider the elements which is after the ul
		List<WebElement> options=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));//
		
		
		//Size of the list
		int size=options.size();
		System.out.println(size);
		
		// we select Text=WEB SERVICES
		//For that we need to compare each text that is equals to webservice---->For each loop
		for (WebElement webElement : options) {
			if(webElement.getText().equals("Web Services")){
				webElement.click();
				break;
			}
		}
		
		
		
		/* In this place we need web services, it came at last option, suppose it came at 
		 * 2nd place once that web element find the web services it came out of the loop
		 * Not necessary to do the iteration after getting the required answer .......
		 * By using break we can improve the efficiency of the code
		 */

	}

}
