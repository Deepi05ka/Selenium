package com.project;


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

public class Project1 {
	static WebDriver driver;
        public static void browser() throws InterruptedException{
        	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
        	driver = new ChromeDriver();
        	driver.manage().window().maximize();
    	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    		driver.get("https://www.nykaa.com/");
    		String s = driver.getWindowHandle();
    		System.out.println("parent window id: "+s);
    		//System.out.println("parent window title: "+driver.switchTo().window(s).getTitle());
    		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));//skin
    		
    		//Mouseover action
    		Actions act = new Actions(driver);
    		act.moveToElement(skin).perform();
    		driver.findElement(By.xpath("//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]")).click(); //facewash click
    		Set<String> second = driver.getWindowHandles();
    		for(String secondwindow : second){
    			driver.switchTo().window(secondwindow);
    		}
    		Thread.sleep(2000);
        }
    		public static void product() throws InterruptedException{
    			
    			driver.findElement(By.xpath("//div[text()='Nykaa Naturals Face Wash']")).click();
    	        Set<String> s1 = driver.getWindowHandles();
    	        for(String third : s1){
    	        	System.out.println(driver.switchTo().window(third).getTitle());
    	        }
    	        WebElement dropdown = driver.findElement(By.xpath("//select[@title='SHADE']")); //Drop down
    	        Select ref = new Select(dropdown);
    	        ref.selectByVisibleText("Tea Tree & Neem");
    	        driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
    	        driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
    	        Thread.sleep(2000);
    			}
    		public static void screenshot() throws IOException{
    			TakesScreenshot ts = (TakesScreenshot)driver;
    	        File source = ts.getScreenshotAs(OutputType.FILE);
    			File Dest = new File("C:\\Users\\lenovo\\workspace\\SeleniumConcepts\\Screenshot\\NykaaImage.png");
    			FileHandler.copy(source, Dest);
    		}
    		
    		
        
	public static void main(String[] args) throws InterruptedException, IOException {
		browser();
		product();
		screenshot();
	}

}
