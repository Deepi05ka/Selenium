package com.windowHandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class BasicRobot {
	//static WebDriver driver;
//	public static void browser() throws IOException, AWTException, InterruptedException{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
//	    driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		String s = driver.getWindowHandle();
//		System.out.println(s);
//		driver.findElement(By.id("APjFqb")).sendKeys("chennai");
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File Dest = new File("C:\\Users\\lenovo\\workspace\\SeleniumConcepts\\Screenshot\\gsearch.png");
//		FileHandler.copy(source, Dest);
//	}
	
	public static void down() throws AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
	    WebElement mobile = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
	    a.contextClick(mobile).perform();
	    Thread.sleep(2000);
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		//BasicRobot b = new BasicRobot();
		//b.browser();
		
		down();
	
		
	}

}
