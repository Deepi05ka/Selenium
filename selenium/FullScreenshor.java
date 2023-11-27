package com.selenium;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.Screenshot;

public class FullScreenshor {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/personal-care");
		Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(3000)).takeScreenshot(driver);
		File dest = new File("C:\\Users\\lenovo\\workspace\\IPTconcepts\\src\\Snap\\Full.png");
		ImageIO.write(sc.getImage(), "PNG", dest);	
		
		

	}

}
