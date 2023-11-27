package com.XPath_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toysrus.in/");
		driver.manage().window().maximize();
		WebElement years = driver.findElement(By.xpath("//a[@href='https://www.toysrus.in/shop-by-age/12-big-kids/']"));
		years.click();
		Thread.sleep(1000);
		WebElement pink = driver.findElement(By.xpath(" //a[contains(text(),'SUNNYLiFE pink color inflatable Ride')]"));
		//pink.click();
		Thread.sleep(1000); 
        System.out.println(pink.getText());
        WebElement price =driver.findElement(By.xpath("//span[text()='₹3,899']"));
        System.out.println(price.getText());
	}
}
