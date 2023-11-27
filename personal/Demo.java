package com.personal;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nykaa.com/");
     WebElement wait=   driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
        Actions action=new Actions(driver);
        action.moveToElement(wait).build().perform();
        driver.findElement(By.xpath("//a[contains(@href,'https://www.nykaa.com/skin/cleansers/face-wash/c/8379')]")).click();
        Thread.sleep(3000);
        Set<String> switchtab=driver.getWindowHandles();
        for(String tab:switchtab) {
        	driver.switchTo().window(tab);
        }
        driver.findElement(By.xpath("//div[text()='Nykaa Naturals Face Wash']")).click();
        Thread.sleep(5000);
        WebElement drop= driver.findElement(By.xpath("//select[@title='SHADE']"));
        Select dropdown=new Select(drop);
        dropdown.selectByVisibleText("Saffron & Honey");
//        driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
//        driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();
       // WebElement frame=driver.findElement(By.xpath("src=\"/mobileCartIframe?ptype=customIframeCart\""));
       // driver.switchTo().frame(frame);
//        driver.findElement(By.xpath("(//div[@label='2'])[1]")).click();
//        driver.findElement(By.xpath("//span[text()='Proceed']")).click();

	}

}
