package BrowserLanuch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\"
				+ "lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement createacc = driver.findElement(By.linkText("Create new account"));
		System.out.println(createacc.getText());
		createacc.click();
		
		WebElement text = driver.findElement(By.linkText("Sign Up"));
		System.out.println(text.getText());
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Ram");
		Thread.sleep(2000);
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("Ram");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("priya@gmail.com");
		Thread.sleep(2000);
		
		WebElement Reemail = driver.findElement(By.name("reg_email_confirmation__"));
		Reemail.sendKeys("priya@gmail.com");
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.id("password_step_input"));
		Password.sendKeys("Priya355");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("day"));
		date.sendKeys("25");
		Thread.sleep(2000);
		
		WebElement Month = driver.findElement(By.id("month"));
		Month.sendKeys("may");
		Thread.sleep(2000);
		
		WebElement Year = driver.findElement(By.id("year"));
		Year.sendKeys("1990");
		Thread.sleep(2000);
		
		WebElement Genderfe = driver.findElement(By.cssSelector("input[value='-1']"));
		Genderfe.click();
		Thread.sleep(2000);
		
		//WebElement Gendermale = driver.findElement(By.className("_8esa"));
		//Gendermale.click();
		//Thread.sleep(2000);
		
		
		

		
		}

}
