package Advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		//1.Get the count of number of columns....Using count=then automatically use(findElements)
		List<WebElement> noOfColumns=driver.findElements(By.tagName("th"));
		int columnCount=noOfColumns.size();
		System.out.println("The Count of no of columns "+columnCount);
		
		//2.Get the count of number of rows
		List<WebElement> noOfRows=driver.findElements(By.tagName("tr"));
		int rowCount= noOfRows.size();
		System.out.println("The count of number of rows "+rowCount);
		
		//3.Get the progress value of 'Learn to interact with Elements'
       ////td[normalize-space()='Learn to interact with Elements']//following::td[1]
		WebElement progressValue=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String value=progressValue.getText();
		System.out.println("The Progress Value is "+value);
		
		//4.Check the vital task for the least completed progress.
		
	}
	
	

}
