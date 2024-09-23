package firstjava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		//after finding the alertbox element then we have to click it
		alertBox.click();
		/* the whole control is in alert only we did not do anything in the driver which means in the web page
		 we have to close or press ok in the alert box so we have switch the driver control to alert
		 */
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confirmBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confirmAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();
		
		WebElement promptBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		promptAlert.sendKeys("hai bro");
		promptAlert.accept();
		

	}

}
