package BrowserLanuch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	
	public static void Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\"
				+ "Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().to("https://www.facebook.com");
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);
        
        driver.navigate().back();
        driver.navigate().back();
        String s = driver.getTitle();
        System.out.println("2nd page Title: "+s);
        
        driver.navigate().forward();
        System.out.println("3rd page url: "+driver.getCurrentUrl());
        
        driver.navigate().forward();
        System.out.println("4th page Title: "+driver.getTitle());
        
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        System.out.println("1st page url: "+driver.getCurrentUrl());
    }
	public static void main(String[] args) throws InterruptedException {
		Test();
		}
}
