package com.Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example1 {
	static WebDriver driver;
              public static void test() throws InterruptedException{
              System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
          	  driver = new ChromeDriver();
          	  driver.get("https://www.myntra.com/");
          	   Thread.sleep(3000);
          	  System.out.println( driver.findElement(By.xpath("//div[@class='desktop-logoContainer']")).isDisplayed());
          	  
          	  WebElement all = driver.findElement(By.cssSelector("ul.results-base>li"));
          	  System.out.println(all.getText());
              }
	public static void main(String[] args) throws InterruptedException {
		test();

	}

}
