package com.Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBook_DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
//		driver.findElement(By.name("firstname")).sendKeys("Deepika");
//		driver.findElement(By.name("lastname")).sendKeys("V");
//		driver.findElement(By.name("reg_email__")).sendKeys("7744556677"); 
//		driver.findElement(By.name("reg_passwd__")).sendKeys("Deepika@123");
		Thread.sleep(3000);
		WebElement ref1 = driver.findElement(By.id("day"));
		Select day = new Select(ref1);
		day.selectByIndex(23);
		WebElement ref2 = driver.findElement(By.id("month"));
		Select month = new Select(ref2);
		month.selectByValue("11");
		WebElement ref3 = driver.findElement(By.id("year"));
		Select year = new Select(ref3);
		year.selectByVisibleText("1999");
	}

}
