package com.XPath_Concepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Duplicate_price {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toysrus.in/");
		driver.findElement(By.xpath("(//strong[@class='years_in_num'])[5]")).click();
		List <WebElement> price = driver.findElements(By.xpath("//span[@class='price']"));
//		for(WebElement duplicate : price ){
//			System.out.println(duplicate.getText());
//		}
		String productprice = "₹2,499";
		List<String> count = new ArrayList<String>();
		for(WebElement duplicate : price ){
			if(duplicate.getText().equals(productprice)){
				count.add(duplicate.getText());
				System.out.println(count);
			}
				
			
		}
		System.out.println("count of duplicate price: "+count.size());
		
	}

}
