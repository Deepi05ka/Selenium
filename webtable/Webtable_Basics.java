package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Basics {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.worldometers.info/world-population/");
		WebElement table = driver.findElement(By.xpath("(//table)[4]"));
		//System.out.println(driver.findElement(By.xpath("(//table)[4]//thead")).getText()); //print all headings
		Thread.sleep(3000);
		//allrows
//		List<WebElement> allrows = driver.findElements(By.xpath("(//table)[4]/tbody/tr"));
//		for(WebElement all:allrows){
//			System.out.println(all.getText());
//		}
		
		System.out.println(driver.findElement(By.xpath("(//table)[4]//tbody//tr[8]//td[4]")).getText());
	}

}
