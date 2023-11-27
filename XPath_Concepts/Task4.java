package com.XPath_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toysrus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//div[@class='actions-toolbar primary']")).click();
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Deepi");
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("V");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("deepika345@gmail.com");
        WebElement phoneno = driver.findElement(By.xpath("//input[@name='mobile_no']"));
        phoneno.sendKeys("7744589668");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("password@123");
        driver.findElement(By.xpath("//input[@title='Sign Up for Newsletter']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
	}

}
