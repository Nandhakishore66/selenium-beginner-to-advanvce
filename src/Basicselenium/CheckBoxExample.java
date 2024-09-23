package firstjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//Select the language that u known
		WebElement language=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		Thread.sleep(3000);
		language.click();
		////*[@id="contentblock"]/section/div[2]/input
		
		//check whether the checkbox is selected
		WebElement selected=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		boolean selenium=selected.isSelected();
		System.out.println(selenium);
		
		//deselect the selected checkbox
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		if(box1.isSelected()) {
			box1.click();
		}
		WebElement box2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		if(box2.isSelected()) {
			box2.click();
		}

	}

}
