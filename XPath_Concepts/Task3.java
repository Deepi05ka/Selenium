package com.XPath_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task3 {
	static WebDriver driver;
	 public static void youtupe(){
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.youtube.com/");
		    driver.manage().window().maximize();
	 }
	 public static void treading() throws InterruptedException{
		 driver.findElement(By.xpath("//yt-formatted-string[text()='Trending'][1]")).click();
		 Thread.sleep(1000);
		 List<WebElement> videos = driver.findElements(By.xpath(" //yt-formatted-string[@class='style-scope ytd-video-renderer']"));
		 for(WebElement products : videos){
			 System.out.println(products.getText());
			 System.out.println();
		 }
	 }
	 public static void main(String[] args) throws InterruptedException {
		youtupe();
		treading();

	}

}
