package com.javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//scrolldown
		WebElement chinna = driver.findElement(By.xpath("//a[text()='China']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//js.executeScript("arguments[0].scrollIntoView()", chinna);
		//range
		js.executeScript("window.scrollBy(0,2000)"); //scrol-down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-2000)"); //scroll-up
		 
		

	}

}
