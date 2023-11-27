package com.XPath_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	static WebDriver driver;
   public static void Browserlaunch(){
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.toysrus.in/");
		driver.manage().window().maximize();
   }
   public static void toysbrowser(){
	   WebElement createAcc = driver.findElement(By.xpath("//span[@class='header_TRS_icon_account']"));
	   Actions act = new Actions(driver);
	   act.click(createAcc).perform();
	   
   }
	public static void main(String[] args) {
		
		Browserlaunch();
		toysbrowser();
	}

}
