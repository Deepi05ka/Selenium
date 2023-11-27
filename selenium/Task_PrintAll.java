package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task_PrintAll {
	static WebDriver driver;
  public static void Browser(){
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
  }
  public static void today(){
		while(true){
		    List<WebElement> ref = driver.findElements(By.xpath("(//div[@class='col-sm-6 col-counters'])[1]"));
	        for(WebElement aa : ref){
	        	System.out.println(aa.getText());
	        }
			}
  }
//  public static void Birth(){
//		
//		String r = driver.findElement(By.xpath("((//div[@class='label-counter'])[1]//following::div[@class='sec-text'])[1]")).getText();
//	    System.out.println(r);
//	        }
//  public static void year(){
//	  while(true){
//		  List<WebElement> yy = driver.findElements(By.xpath("(//div[@class='col-sm-6 col-counters'])[2]"));
//		  for(WebElement bb : yy){
//			  System.out.println(bb.getText());
//		  }
//		  
//	  }
//  }
			

  

	public static void main(String[] args) {
		Browser();
		today();
		//Birth();
		//year();
	}

}
