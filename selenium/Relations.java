package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
		while(true){
	    List<WebElement> ref = driver.findElements(By.xpath("//div[@class='maincounter-number']//span[@class='rts-counter']"));
        for(WebElement aa : ref){
        	System.out.println(aa.getText());
        }
		}
	}

}
