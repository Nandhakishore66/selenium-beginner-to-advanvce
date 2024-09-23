package Advanceselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		
		//Find the element
		WebElement button1=driver.findElement(By.name("filename"));
		button1.click();
		Thread.sleep(3000);
		
		//Now the control moves to the windows
		
		//C:\\Users\\ELCOT\\Downloads\\obpass.pdf---->Location of the file that we want to choose
		//clipboard--- Saves the recent copied content... how to put the location into the clipboard?
		
		//It is used to transfer the string into a plain text..
		String file="//C:\\Users\\ELCOT\\Downloads\\onboarding pass.pdf";
		StringSelection paste=new StringSelection(file);
		
		//upto this the copy operation is done.. which means the content is in clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(paste, null);
		
		// now move to paste operation ...... for that we use Robot class--->This is also used to simulate keyboard actions=for windows based....web based=Actions class
		Robot obj=new Robot();
		//virtual key= inside the screen there is a keyboard and it uses that
		obj.keyPress(KeyEvent.VK_CONTROL);
		obj.keyPress(KeyEvent.VK_V);
		obj.keyRelease(KeyEvent.VK_V);
		obj.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		obj.keyPress(KeyEvent.VK_ENTER);
		obj.keyRelease(KeyEvent.VK_ENTER);
		
		
		//C:\Users\ELCOT\Downloads\onboarding pass.pdf
		

	}

}
