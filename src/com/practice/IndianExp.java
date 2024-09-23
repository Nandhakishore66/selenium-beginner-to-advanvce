package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.netty.util.Timeout;

public class IndianExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://indianexpress.com/article/india/28-states-9-union-territories-here-is-the-new-map-of-india-6099663/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement state=driver.findElement(By.xpath("//*[@id=\"pcl-full-content\"]/div[1]/p[3]"));
		String states=state.getText();
		System.out.println(states);
	    String title=driver.getTitle();
	    System.out.println(title);
	   
	    
	 
	    
	  
	    
		
		
        
	}

}
