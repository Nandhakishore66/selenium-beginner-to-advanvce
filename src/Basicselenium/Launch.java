package firstjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe" );
WebDriver driver =new ChromeDriver();
driver.get("http://www.leafground.com/pages/Edit.html");
WebElement emailBox=driver.findElement(By.id("email"));
emailBox.sendKeys("test@gmail.com");
WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
append.sendKeys("text");
WebElement getTextBox=driver.findElement(By.name("username"));
String value=getTextBox.getAttribute("value");
System.out.println(value);
WebElement clearTextBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
clearTextBox.clear();
//driver.quit();
WebElement disabledBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
boolean enabled= disabledBox.isEnabled();
System.out.println(enabled);


	}

}
