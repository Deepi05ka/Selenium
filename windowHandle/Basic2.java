package com.windowHandle;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Basic2 {
	 WebDriver driver;
		public void browser() throws IOException, AWTException, InterruptedException{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.nykaa.com/");
			WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
			Actions act = new Actions(driver);
			act.moveToElement(skin).perform();
			driver.findElement(By.xpath("//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]")).click();
			Set<String> s = driver.getWindowHandles();
			for(String newWindow : s){
			driver.switchTo().window(newWindow);
			}
			driver.findElement(By.xpath("//div[text()='Nykaa Naturals Face Wash']")).click();
			Thread.sleep(2000);
			WebElement dropdown = driver.findElement(By.xpath("//img[@alt='Nykaa Naturals Face Wash']"));
	        Select ref = new Select(dropdown);
	        ref.selectByVisibleText("Tea Tree & Neem");
	        driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	        Thread.sleep(3000);
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
			File Dest = new File("C:\\Users\\lenovo\\workspace\\SeleniumConcepts\\Screenshot\\Nykaa.png");
			FileHandler.copy(source, Dest);
		}
           
        

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Basic2 b = new Basic2();
		b.browser();
	}

}
