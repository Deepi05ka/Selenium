package com.windowHandle;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement skin = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
        Actions a = new Actions(driver);
        a.moveToElement(skin).perform();
        driver.findElement(By.xpath("//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]")).click();
        Set<String> s = driver.getWindowHandles();
        for(String newwindow : s){
        	driver.switchTo().window(newwindow);
        }
        driver.findElement(By.xpath("//div[text()='Nykaa Naturals Face Wash']")).click();
        Set<String> s1 = driver.getWindowHandles();
        for(String n : s1){
        	System.out.println(driver.switchTo().window(n).getTitle());
        }
        WebElement dropdown = driver.findElement(By.xpath("//select[@title='SHADE']"));
        Select ref = new Select(dropdown);
        ref.selectByVisibleText("Tea Tree & Neem");
        driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
        Thread.sleep(2000);
        
        Thread.sleep(5000);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\lenovo\\workspace\\SeleniumConcepts\\Screenshot\\NykaaBag1.png");
		FileHandler.copy(source, Dest);
        
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        
        WebElement quanity = driver.findElement(By.xpath("(//span[@class='css-1aowomc ehes2bo0'])[1]")); // quanity locator
        quanity.click();
        driver.findElement(By.xpath("//span[text()='2']")).click(); //quanity choose
        driver.findElement(By.xpath("//span[text()='Proceed']")).click(); //proceed button
        
        driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();//continue as guest
        driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("602001"); //pincode
        
        WebElement house = driver.findElement(By.xpath("(//input[@type='text'])[3]")); //house no
        house.click();
        Thread.sleep(5000);
        house.sendKeys("36/72"); //house no
        
        Thread.sleep(8000);
        WebElement roadname = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));//area name
        roadname.click();
        Thread.sleep(5000);
        roadname.sendKeys("Gh road");
        
        WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']")); // name
        name.click();
        Thread.sleep(5000);
        name.sendKeys("Deepika");
        
        WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone']")); //phone
        phone.click();
        Thread.sleep(5000);
        phone.sendKeys("7788443366");
        
        WebElement email = driver.findElement(By.xpath("//input[@type='email']")); //email
        email.click();
        Thread.sleep(5000);
        email.sendKeys("deepika12@gmail.com");
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='SHIP TO THIS ADDRESS']")).click();

       Thread.sleep(2000);
       driver.findElement(By.xpath("//p[text()='Cash on delivery']")).click();

        
	}

}
