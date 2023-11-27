package com.project;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String first = driver.getWindowHandle();
		
		WebElement mobile = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
		Actions a1 = new Actions(driver);
		a1.contextClick(mobile).keyDown(Keys.CONTROL).click().perform();
		Thread.sleep(3000);
		Set<String> second = driver.getWindowHandles();
		for(String sec : second){
			driver.switchTo().window(sec);
		}

		
//		a1.contextClick(mobile).perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyPress(KeyEvent.VK_DOWN);
//		
		WebElement today = driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']"));
		Actions a2 = new Actions(driver);
		a2.contextClick(today).keyDown(Keys.CONTROL).click().perform();
		Thread.sleep(3000);
		Set<String> todaytap = driver.getWindowHandles();
		for(String t2 : todaytap){
			driver.switchTo().window(t2);
		}
//		
		WebElement release = driver.findElement(By.xpath("//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases']"));
		Actions a3 = new Actions(driver);
		a3.contextClick(release).keyDown(Keys.CONTROL).click().perform();
		Thread.sleep(3000);
//		
//		Set<String> window2 = driver.getWindowHandles();
//		for(String f2 : window2){
//			//if(!f2.equalsIgnoreCase(todaytap)){
//				driver.switchTo().window(f2);
//			//}
//		}
		 // print title of today detals
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']"));
		 for(WebElement Allproducts : products){
			 System.out.println(Allproducts.getText());
			
		 }
		
        
	}

}
