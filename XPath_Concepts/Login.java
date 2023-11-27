package com.XPath_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toysrus.in/customer/account/create/");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Deepika");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Deepi");
		WebElement email = driver.findElement(By.id("email_address"));
		email.sendKeys("deepika123@gmail.com");
		WebElement mobileno = driver.findElement(By.id("mobile_no"));
		mobileno.sendKeys("deepika123@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("deepika@123");
	}

}
