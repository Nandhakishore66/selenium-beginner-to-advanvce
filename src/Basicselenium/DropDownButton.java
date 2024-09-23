package firstjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Which browser we have to use and where it is
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		//this line is used to launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//the url of the page which we have to go
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//find the locator
		WebElement dd=driver.findElement(By.id("dropdown1"));
		
		/*95% of dropdown is in select tag so, we have to create object. bcoz we did not find any methods for dd*/
		Select select=new Select(dd);
		
		//index starts from o
		select.selectByIndex(3);
		//this line delays exectution of 3000 milli seconds which means 3 seconds we did use this in real time project
		Thread.sleep(3000);
		
		// value is in inspect dropdown 1
		select.selectByValue("0");
		Thread.sleep(3000);
		
		// text which is visible to our eyes
		select.selectByVisibleText("Selenium");
		Thread.sleep(3000);
		
		//get the number of dropdown options <webelement>= generics which means only the values of webelement will be present
		List<WebElement> listOfOptions=select.getOptions();
		int size=listOfOptions.size();
		System.out.println(size);
		
		// use send keys to select= if we select india from drop down there are 100's of countries we can select easily by ind
		dd.sendKeys("Loadrunner");
		
		//multiselect
		WebElement multiSelect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select ms=new Select(multiSelect);
		ms.selectByIndex(1);
		ms.selectByIndex(2);
		// for select by index, did not use double quotes for value and visible text use double quotes
		
		
		

	}

}
