package com.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nakuri_ref {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		 String[] name = {"Deepika", "John", "123456", "Bob@123", "123@#gmail"};
		 
		
		 for (String input : name) {
			WebElement w = driver.findElement(By.id("name"));
	        w.sendKeys(input);
			Thread.sleep(3000);
	        
//	        WebDriverWait wait = new WebDriverWait(driver, 50); 
//	        wait.until(ExpectedConditions.visibilityOf(w)).clear();
			w.clear();
		 
	            }
	
	}

}
