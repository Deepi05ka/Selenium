package com.DropDownExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic_concepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toysrus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//strong[@class='years_in_num'])[5]")).click();
		WebElement options = driver.findElement(By.id("sorter"));
		Select ref = new Select(options);
		ref.selectByIndex(4);
		List<WebElement> alloptions = ref.getOptions();
		for(WebElement single : alloptions){
			System.out.println(single.getText());
		}
		
		

	}

}
