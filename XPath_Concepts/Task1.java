package com.XPath_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toysrus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='dropdown-main-account']")).click();;
		
		driver.get("https://www.toysrus.in/customer/account/create/");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Deepika");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Deepi");
		WebElement email = driver.findElement(By.id("email_address"));
		email.sendKeys("deepika123@gmail.com");
		WebElement mobileno = driver.findElement(By.id("mobile_no"));
		mobileno.sendKeys("7788994456");
		WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("deepika@123");
	    driver.findElement(By.id("is_subscribed")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='action register primary']")).click();
		

	}

}
