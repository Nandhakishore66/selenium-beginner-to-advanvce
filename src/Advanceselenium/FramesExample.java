package Advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		/*What is frame?
		 * Browser--->Inside the web = Html pages=inside the html page there is another html page which is called frames.
		 * example: if we visit some website, ADS came from Google or something that is called frames.
		 * In a  html we can able to embedded the another html for that we use----->frametag....
		 */
		//When we inspect using ri8 click---> there is visible of view framework-->it indicates that the element is inside the frame
		
		
		/*The driver only identifies the native html,which is at the top, and th Ads stored in the external html using i frame
		 * so we need to inform that driver to not see the default content, to see the inner html 
		 * so that we need to write one line  
		 */
		
		//check the name and id of the iframe---> not present means we have take the index position of iframe
		//now the control came to iframe
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		/*for getting value of human eye visible text which is inside the tag use getText();
		 * for the getting the valuse of parameters use getAttribute()
		 */
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		//Now the control is in 1stframe we have to return back it to the driver
		driver.switchTo().defaultContent();
		
		//move the control to the 2nd frame
		driver.switchTo().frame(1);
		//By using the before frame we have to move for the next frame in that it has----->id and name use any one of it
		driver.switchTo().frame("frame2");
		
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		
		//now move the control to driver
		driver.switchTo().defaultContent();
		
		//Find the total number of iframes
		//finding more than 1 elements means use driver.findElements.....
		List<WebElement> numberOfIframes=driver.findElements(By.tagName("iframe"));
		int size=numberOfIframes.size();
		System.out.println(size);
		
	}

}
