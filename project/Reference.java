package com.project;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reference {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
        Actions a = new Actions(driver);
        a.moveToElement(skin).perform();
        driver.findElement(By.xpath("//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]")).click();
        Set<String> s = driver.getWindowHandles();
        for(String newwindow : s){
        	driver.switchTo().window(newwindow);
        }
        driver.findElement(By.xpath("//img[@alt='Cetaphil Oily Skin Cleanser']")).click();
        Set<String> s1 = driver.getWindowHandles();
        for(String n : s1){
        	driver.switchTo().window(n);
        }
        driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("602001");
        Thread.sleep(9000);
        
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("12/72"); // house no
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//label[@class='floating-label'])[5]")).sendKeys("VKnagar");//area name
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Deepika"); //name
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("2345678945"); // phone no
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("deepika123@gmail.com"); //email
        
	}

}
