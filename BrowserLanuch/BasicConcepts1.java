package BrowserLanuch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class BasicConcepts1 {
	
	static WebDriver driver;
	
	public static void Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\"
				+ "Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	} 
	public static void WebDriverMethods() {
		driver.manage().window().maximize();//webDriver()
		driver.get("https://www.amazon.com");//url
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
		}

	public static void main(String[] args) {
		Browser();
		WebDriverMethods();
		}
	}
