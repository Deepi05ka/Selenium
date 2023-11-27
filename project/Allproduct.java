package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Allproduct {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
//	    driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
//		List<WebElement> videos = driver.findElements(By.xpath("//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']"));
//		 for(WebElement products : videos){
//			 System.out.println(products.getText());
//			
//		 }
//		 System.out.println();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String first = driver.getWindowHandle();
		
		WebElement mobile = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
		Actions a1 = new Actions(driver);
		a1.contextClick(mobile).keyDown(Keys.CONTROL).click().perform();
		Thread.sleep(3000);
//		Set<String> second = driver.getWindowHandles();
//		for(String sec : second){
//			driver.switchTo().window(sec);
//		}
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		
		
	}

}
