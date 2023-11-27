package BrowserLanuch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basic {
	static WebDriver driver;
	public static void browser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	public static void acc() throws InterruptedException{
		 driver.findElement(By.linkText("Create new account")).click();;
		 Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("dd");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("dddd");
		WebElement reg_email__ = driver.findElement(By.name("reg_email__"));
		reg_email__.sendKeys("23355478");
		WebElement reg_passwd__ = driver.findElement(By.name("reg_passwd__"));
		reg_passwd__.sendKeys("dddg");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select ref = new Select(day);
		ref.selectByVisibleText("24");
		WebElement month = driver.findElement(By.id("month"));
		Select ref1 = new Select(month);
		ref1.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.id("year"));
		Select ref2 = new Select(year);
		ref2.selectByVisibleText("1999");
		System.out.println(ref2.isMultiple());
		
		WebElement aa= driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		Actions act = new Actions(driver);
		act.click(aa).perform();
		
	}

	public static void main(String[] args) throws InterruptedException {
		browser();
		acc();
	}

}
