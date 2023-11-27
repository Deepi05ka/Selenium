package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        WebElement logo = driver.findElement(By.id("logo-icon"));
        File source = logo.getScreenshotAs(OutputType.FILE);
        File desti = new File("C:\\Users\\lenovo\\workspace\\IPTconcepts\\src\\Snap\\youtube.png");
        FileHandler.copy(source, desti);
	}

}
