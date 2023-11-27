package com.cssSelectorBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	   // driver.findElement(By.cssSelector("[name='q']")).sendKeys("flowers");
       List <WebElement> ref = driver.findElements(By.tagName("a"));
       for(WebElement datas : ref) { 
    	   System.out.println(datas.getText());
       }
       String lang ="English";
       for(WebElement datas : ref) { 
    	   if(datas.getText().equals(lang)){
    		   datas.click();
    	   }
       }
       
	    
	}

}
