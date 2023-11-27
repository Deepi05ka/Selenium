package com.personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	static WebDriver driver;
    public static void browser(){
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
    }
//    public static void name(){
//    	driver.findElement(By.id("name")).sendKeys("deepika");
//    	driver.findElement(By.id("email")).sendKeys("deepika113@gmail.com");
//    	driver.findElement(By.id("phone")).sendKeys("234444557");
//    	driver.findElement(By.id("textarea")).sendKeys("No:72/36,lakshmipuram,thiruvallur-602001");
//    	driver.findElement(By.id("female")).click();
//  }
    public static void days(){
    	//specific checkbox
    	driver.findElement(By.id("sunday")).click();
    	driver.findElement(By.id("monday")).click();
    	driver.findElement(By.id("tuesday")).click();
    	driver.findElement(By.id("wednesday")).click();
    	driver.findElement(By.id("thursday")).click();
    	driver.findElement(By.id("friday")).click();
    	driver.findElement(By.id("saturday")).click();
    	
    }
    
    public static void frames(){
    	driver.switchTo().frame(0);
    	driver.findElement(By.xpath("//input[@class='text_field']")).sendKeys("Deepika");
    	driver.findElement(By.xpath("//input[@value='Radio-1']")).click();
    	WebElement w = driver.findElement(By.xpath("//span[@class='icon_calendar']"));
    	Select s = new Select(w);
    	s.selectByVisibleText("11");
    	s.selectByVisibleText("24");
    	s.selectByVisibleText("1999");
    	
    }
	public static void main(String[] args) {
		browser();
        //name();
        days();
        frames();
        
	}

}
