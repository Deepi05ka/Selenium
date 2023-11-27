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

public class Task3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement Type = driver.findElement(By.id("twotabsearchtextbox"));
		Type.sendKeys("Book");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\lenovo\\workspace\\SeleniumConcepts\\Screenshot\\image.png");
        FileHandler.copy(source, Destination);
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.id("nav-search-submit-button"));
        search.click();
        

	}

}
