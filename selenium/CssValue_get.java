package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue_get {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
        WebElement ref = driver.findElement(By.id("APjFqb"));
        System.out.println(ref.getCssValue("font-family"));
        System.out.println(ref.getCssValue("line-height"));
        System.out.println(ref.getCssValue("margin-bottom"));
        System.out.println(ref.getCssValue("overflow-x"));
        System.out.println(ref.getCssValue("color"));
	}

}
