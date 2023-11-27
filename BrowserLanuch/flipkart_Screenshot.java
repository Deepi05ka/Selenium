package BrowserLanuch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class flipkart_Screenshot {
	static WebDriver driver;
	public static void browser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo"
				+ "\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
	public static void browserSearch() throws InterruptedException, IOException{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mobile");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\lenovo\\workspace\\SeleniumConcepts\\Screenshot\\flipkart.png");
		FileHandler.copy(source, destination);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		browser();
		browserSearch();
		
	}

}
