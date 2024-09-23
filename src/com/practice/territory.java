package com.practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class territory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\NAVEEN\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://knowindia.india.gov.in/states-uts/");
	   List<WebElement>	states=driver.findElements(By.xpath("//*[@id=\"fontSize\"]/section/div/div/div[2]/div[2]/div"));
	   ////*[@id="fontSize"]/section/div/div/div[2]/div[2]/div/div[1]/ul
	   ////*[@id="fontSize"]/section/div/div/div[2]/div[2]/div/div[2]/ul
	   for (WebElement webElement : states) {
		  String ok= webElement.getText();
		  System.out.println(ok);
		
	}
	   ////*[@id="fontSize"]/section/div/div/div[2]/div[3]/div/div[1]/ul
		List<WebElement> territories=driver.findElements(By.xpath("//*[@id='fontSize']/section/div/div/div[2]/div[3]/div/div[1]/ul/li"));
		for (WebElement territory : territories) {
			String hm=territory.getText();
			System.out.println(hm);
			
		}
		driver.close();

	}////*[@id="fontSize"]/section/div/div/div[2]/div[2]/div/div[1]/ul/li

}
