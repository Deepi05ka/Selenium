package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programs {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		//simple
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		//comfirm (ok/cancel)
		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		//prompt(type,ok,cancel)
		Thread.sleep(2000);
		driver.findElement(By.id("prompt")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Hellow");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("myName")).getText());
		//Modern
		driver.findElement(By.id("modern")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert();
		
		
	}

}
