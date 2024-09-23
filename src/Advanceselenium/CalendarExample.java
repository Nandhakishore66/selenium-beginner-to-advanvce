package Advanceselenium;                     //In This We Worked On Two Methods Of Calendar

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		//1.The Calendar is most like a jquery Calendar which we can able to use by using send keys
		WebElement jQuery=driver.findElement(By.id("datepicker"));
		jQuery.click();
		//jQuery.sendKeys("05/10/2022"+Keys.ENTER);
		
		//2.Suppose it is not like jquery Calendar the condition is like we want select.......
		
		////*[@id="ui-datepicker-div"]/div/a[2]/span--This is normal xpath-----It gives us the Position like where it is
		
		/*Writing Xpath by our own is easier--->//a[@title='Next'] //=I dont know where it is located... 
		 * a=But it is in the anchor tag.... []=brackets... inside that @title=Attribute name... 'Next'=Attribute Value  */
		WebElement nextButton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		//3.Find the date=//*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[3]/a--copied xpath
		////a[contains(text(),'10')]----Hand Written Xpath
		WebElement date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a"));
		date.click();
		

	}

}
