package com.personal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Service.State;

public class FaceBook {
	static WebDriver driver;
	static Robot r;
	static Actions a;
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com/");
		
		driver.get("https://www.naukri.com/");  // nakuri
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		a= new Actions(driver);
		
		
		
		
		
//		String[] name = {"Deepika123@gmail","Alisha", "John.com", "12345@gmail6.com", "Bob@123.gmail", "123@#gmail"};
//		
//		 for (String input : name) {
//				//WebElement w = driver.findElement(By.id("email")); //facebook
//				
//				WebElement w = driver.findElement(By.id("name")); //nakuri
//				
//		        w.sendKeys(input);
////				 WebDriverWait wait = new WebDriverWait(driver, 50);
////		         wait.until(ExpectedConditions.visibilityOf(w)).clear();
//				Thread.sleep(5000);
//		        w.clear();
//			 
//		            }
		
		WebElement d =  driver.findElement(By.xpath("//input[@placeholder='What is your name?']"));
		String[] name = {"Deepika123@gmail","Alisha", "John.com", "12345@gmail6.com", "Bob@123.gmail", "123@#gmail"};
		for(String n : name) {
			WebElement d1 =  driver.findElement(By.xpath("//input[@placeholder='What is your name?']"));
			d1.sendKeys(name);
			for(int i = 0; i < n.length(); i++) {
		        d1.sendKeys(Keys.CONTROL+"a");
		        d1.sendKeys(Keys.DELETE);
		    }
			Thread.sleep(5000);
		}

	}

}
