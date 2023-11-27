package com.XPath_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_xpath {
	public static void pathTypes(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo"
				+ "\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.in");
		driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope yt-chip-cloud-chip-renderer'])[2]")).click();
		
	}

	public static void main(String[] args) {
		
		pathTypes();

	}

}
