package Advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Image.html");
        
        //Check the image is broken or not---1st we need to find the element
        WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
        
        //Then we have to check the "naturalWidth=0"----It is a css property if it is 0 it is broken otherwise not broken
        if(brokenImage.getAttribute("naturalWidth").equals("0")) {
        	System.out.println("Image is broken");
        }
        else {
        	System.out.println("Image is not broken");
        }
        
	}//

}
