package com.DropDownExamples;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5000);
//		WebElement element=driver.findElement(By.id("oldSelectMenu"));
//		Select ref = new Select(element);
//		ref.selectByValue("4");
//		//ref.selectByIndex(1);
////		List<WebElement> alloptions = ref.getOptions();
////		for(WebElement Singleoptions : alloptions){
////			System.out.println(Singleoptions.getText());
//		}
		WebElement cars = driver.findElement(By.id("cars"));
		Select  sel = new Select(cars);
		sel.selectByVisibleText("Opel");
		sel.selectByIndex(3);
		System.out.println(sel.isMultiple());
		
	}

}
