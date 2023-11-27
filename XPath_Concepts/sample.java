package com.XPath_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toysrus.in/");
		WebElement Locationlogo = driver.findElement(By.xpath("//div[@class='store-locator-head']"));
	    System.out.println(	Locationlogo.isEnabled());
	    Locationlogo.click();
	    driver.findElement(By.id("pincode-popup")).sendKeys("602001");
	    driver.findElement(By.id("apply")).click();

	}

}
