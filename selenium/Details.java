package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Details {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.myntra.com/personal-care");
//         String s = driver.findElement(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']")).getText();
//         String s1 = driver.findElement(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']//following::span[@class='product-discountPercentage']")).getText();
//         System.out.println(s);
//         System.out.println(s1);
        
     List <WebElement> ref = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
     while(true){
    	 for(WebElement w : ref){
    		 System.out.println(w.getText());
    	 }
     }
	}

}
