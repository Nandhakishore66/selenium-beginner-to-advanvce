package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTestCase {
	  
       public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(4000);
		
		//Find Email
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("user@phptravels.com");
		
		//Find Password
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("demouser");
		
		//Login Button
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"fadein\"]"));
		loginBtn.click();

		

	}

}
