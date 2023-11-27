package com.Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_selectors {
	static WebDriver driver;
	public static void browser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/shampoo");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	    public static void app() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("All product Details : ");
		WebElement a = driver.findElement(By.cssSelector("ul.results-base")); // get all product details
		System.out.println(a.getText());
		Thread.sleep(2000);
		System.out.println();
		
		WebElement aa = driver.findElement(By.cssSelector("ul.results-base>li")); // get 1st product details
		System.out.println(aa.getText());
		System.out.println();
		
		WebElement aaa = driver.findElement(By.cssSelector("ul.results-base>li:first-of-type")); // get 1st product details
		System.out.println(aaa.getText());
		System.out.println();
		
		WebElement b = driver.findElement(By.cssSelector("ul.results-base>li:last-of-type")); // get Last product details(Dummy)
		System.out.println(b.getText());
		System.out.println();
		
		System.out.println("get particular product");
		WebElement c = driver.findElement(By.cssSelector("ul.results-base>li:nth-of-type(30)")); // get nth product details
		System.out.println(c.getText());
		System.out.println();
		
	}
	public static void main(String[] args) throws InterruptedException {
		 browser();
         app();
	}

}
