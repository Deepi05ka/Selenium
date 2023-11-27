package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsing_Autoit {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.findElement(By.xpath("//span[text()='Add Files']")).click();;
		Runtime.getRuntime().exec("E:\\Upload.exe");

	}

}
