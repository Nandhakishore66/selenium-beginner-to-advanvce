package Advanceselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		/*Identity of the old window which means parent window.
		 * it has the data of the current window which means parent window. and we have to store it.
		 handle is singular which is used to store the data of one window*/
		String oldWindow=driver.getWindowHandle();
		
		//by using this we can find the element and clicks on it.. then it opens the new window which means child window
		WebElement openHome=driver.findElement(By.id("home"));
		openHome.click();
		
		/*now we have to five the control to new window,,
		 * for that we need to give the identity of new window in one place
		 */
		/*whatever the windows open with the help of driver(15th line) all the parent and 
		 * child windows stores only in the windowHandles(plural)-->it stores multiple windows */
		
		Set<String> handles=driver.getWindowHandles();
		
		//for each loop--> used to iterate the windows that stored in the handles
		for (String newWindow : handles) {
			/*if, new window--> which carries all the opened windows... not equals to old window
			 * then do the below operation
			 */
			if(!newWindow.equals(oldWindow)) {
				//below(41th line)-->it used to give the driver control to the new window
			driver.switchTo().window(newWindow);
			}
			
		}
		//find the element of the edit box and then click it
		WebElement editBox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		
	    //now close the new window
		driver.close();
		
		//now give the control back to old window to perform the next operation
		driver.switchTo().window(oldWindow);
		
		//2....find the number of opened windows 
		WebElement numberOfWindows=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		numberOfWindows.click();
		int size=driver.getWindowHandles().size();
		System.out.println("number of windows opened:"+ size);
		
		//close all the windows except the parent windows
		WebElement doNotClose=driver.findElement(By.xpath("//*[@id=\"color\"]"));
		doNotClose.click();
		Set<String> allWindows=driver.getWindowHandles();
		for (String windowNew : allWindows) {
			//if not parent window then close
			if(!windowNew.equals(oldWindow)) {
				driver.switchTo().window(windowNew);
				driver.close();
			}
			
				
		}
		
		driver.quit();
		
		
		
	}

}
