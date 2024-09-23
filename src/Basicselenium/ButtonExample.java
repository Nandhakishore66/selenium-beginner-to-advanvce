package firstjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http://www.leafground.com/pages/Button.html");
       
       //1.Get the xy position of button
       WebElement getPositionButton=driver.findElement(By.id("position"));
       Point xyPoint=getPositionButton.getLocation();
       int xvalue=xyPoint.getX();
       int yvalue=xyPoint.getY();
       System.out.println("x value is:"+ xvalue+"y value is:"+ yvalue);
       
       //2.Find the color of the button
       WebElement colorButton=driver.findElement(By.id("color"));
       String color=colorButton.getCssValue("background-color");
       System.out.println("Button color is:"+ color);
       
       //3.Find the height and width
       WebElement hw=driver.findElement(By.id("size"));
       int height=hw.getSize().getHeight();
       int width=hw.getSize().getWidth();
       System.out.println("height is"+ height+"width is:"+ width);
       
       //4.click button to travel home page
       WebElement cb=driver.findElement(By.id("home"));
       cb.click();
       
	}

}
