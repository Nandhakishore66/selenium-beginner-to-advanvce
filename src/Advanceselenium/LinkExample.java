package Advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/Link.html");
        WebElement homePage=driver.findElement(By.linkText("Go to Home Page"));
        
        /*After using this click operation it moves to the next page, but we need to come back again to the home page for doing 
         * the next operation...For that, we use (driver.navigate().to()....instead of driver.get*/
        homePage.click();
        
        /*Use of navigate method.... In get we do only the current page operations but 
         * In the navigate method we can use Forward,Backward,Refresh.. In this we need to use backward*/
        driver.navigate().back();
        
        //2.Find where am supposed to go without clicking me?
       WebElement withoutClick= driver.findElement(By.partialLinkText("Find where"));
       String value= withoutClick.getAttribute("href");
       System.out.println("This link is going to"+value);
       
       //3.Verify am I broken?
      WebElement brokenLink= driver.findElement(By.linkText("Verify am I broken?"));
      brokenLink.click();
     String title= driver.getTitle();
     if(title.contains("404")) {
    	 System.out.println("Link is broken");
     }
     driver.navigate().back();
     
     //4.Go to Home Page (Interact with same link name)
     /*homePage.click();= Suppose if we give like this it throws an Exception Which is==Stale Element Reference Exception
      * because of some refresh forward and backward actions... For that we need to find the element again
      */
     
     WebElement homePage1=driver.findElement(By.linkText("Go to Home Page"));
     homePage1.click();
     driver.navigate().back();
     
     //5.How many links are available in this page?
     //Finding size means more than 1 element so we use elements
     List<WebElement> numberOfLinks=driver.findElements(By.tagName("a"));
    int size= numberOfLinks.size();
    System.out.println(size);
     
     
        
        
        

	}

}
