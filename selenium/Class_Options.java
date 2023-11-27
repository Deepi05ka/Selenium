package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class_Options {
	static WebDriver driver;
	public static void Demo(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
		op.addArguments("start-Maximized");
		op.addArguments("headless");
		op.addArguments("disable-extensions");
		op.addArguments("version");
		driver = new ChromeDriver(op);
		driver.get("https://www.myntra.com/personal-care");
		driver.manage().window().maximize();
		String s = driver.getTitle();
		System.out.println(s);
		}

	public static void main(String[] args) {
		Demo();
	}

}
