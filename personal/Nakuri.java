package com.personal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.PublicKey;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;

public class Nakuri {
	static WebDriver driver;
	static Robot r;
	
	public static void login(){
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		
		WebElement visibily = driver.findElement(By.xpath("//label[text()='Email ID / Username']"));
		System.out.println("visibilty "+visibily.isDisplayed());
		
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("deepika1214v@gmail.com"); //email
        //driver.findElement(By.id("email")).sendKeys("deepika123l34v@gmail.com"); //negative
        //driver.findElement(By.id("email")).sendKeys("123l34v@gmail.com");
        //driver.findElement(By.id("email")).sendKeys(" ");
        //driver.findElement(By.id("email")).sendKeys("dee#24%$3l34v@gmail.com");
        
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Deepika2123"); //
      //driver.findElement(By.id("password")).sendKeys("Deepika2123@we"); //negative
      //driver.findElement(By.id("password")).sendKeys("2123@we");
      //driver.findElement(By.id("password")).sendKeys(" ");
      //driver.findElement(By.id("password")).sendKeys("3@we");
        
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        
        //OTP
//        driver.findElement(By.xpath("//button[text()='Use OTP to Login']")).click();
//        driver.findElement(By.xpath("//input[@placeholder='Enter your 10 digit mobile number']")).sendKeys("8608951871");
//        driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
        
        //google
        //driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
        
	}
	
	public static void register() throws AWTException, InterruptedException {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("name")).sendKeys("Deepika"); //name
		driver.findElement(By.id("email")).sendKeys("deepika1214v@gmail.com"); //email
		//driver.findElement(By.id("email")).sendKeys("deepika123lv@gmail.com"); //exiting mail
		driver.findElement(By.id("password")).sendKeys("Deepika2123");
		driver.findElement(By.id("mobile")).sendKeys("8608951871");
		driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
		driver.findElement(By.id("currentCity")).sendKeys("Thiruvallur");
	    Thread.sleep(3000);
		
		//file upload
		WebElement upload = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		upload.click();
		Thread.sleep(3000);
		
		r = new Robot();
		StringSelection s = new StringSelection("C:\\Users\\lenovo\\Documents\\Deepika Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//check checkbox
		System.out.println(driver.findElement(By.xpath("//i[@class='ico-tick resman-icon resman-icon-check-box-checked']")).isSelected());
		driver.findElement(By.xpath("//i[@class='ico-tick resman-icon resman-icon-check-box-checked']")).click(); //unchecked
		//driver.findElement(By.xpath("//button[text()='Register now']")).click(); //register click
	}
	
	public static void searchjob() throws InterruptedException{
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Search jobs here']"));
		e.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys("software testing");
	//	e.sendKeys("software testing");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.navigate().back();
//	

//		e.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys(" $%^&*");
//		driver.findElement(By.xpath("//span[text()='Search']")).click();
//		driver.navigate().back();
		

//		e.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']"));
//		driver.findElement(By.xpath("//span[text()='Search']")).click();
//		driver.navigate().back();
		

//		e.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys(" java python");
//		driver.findElement(By.xpath("//span[text()='Search']")).click();
//		driver.navigate().back();
		
//		WebElement searchJob = driver.findElement(By.xpath("//span[text()='Search jobs here']"));
//		location.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys(" java python");
//		driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("chennai");
//		driver.findElement(By.xpath("//span[text()='Search']")).click();
//		driver.navigate().back();
		
//		searchJob.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys(" java python");
//		driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("Xyz123");
//		driver.findElement(By.xpath("//span[text()='Search']")).click();
		}
	
	public static void jobapplication() {
		
	}
	
	public static void resueupload() throws AWTException, InterruptedException {
		driver.findElement(By.xpath("//a[text()='Complete profile']")).click();
		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Upload']")).click();
		
		r = new Robot();
		r.delay(2000);
		
		StringSelection s = new StringSelection("C:\\Users\\lenovo\\Documents\\Deepika Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("(//span[text()='CrossLayer'])[13]")).click();
	}
	
	public static void notifications() {
		
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='nI-gNb-nc__icon-wrapper']"));

		dropdown.click();
		driver.findElement(By.xpath("(//div[text()='Recommended jobs'])[2]")).click(); //Recommended job
		driver.navigate().back();
		driver.findElement(By.xpath("//div[text()='Pending Actions']")).click(); //Pending Actions
		driver.navigate().back();
        driver.findElement(By.xpath("//div[text()='Promotional Offer']")).click(); //Promotional Offer
        driver.navigate().back();
        driver.findElement(By.xpath("//div[text()='Recruiter Searches']")).click(); //Recruiter Searches
        driver.navigate().back();
        
	}
	
	
	public static void profileHeadlineUpdate() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/mnjuser/profile']")).click();
		//driver.findElement(By.xpath("//em[text()='editOneTheme']")).click(); //edit
		WebElement headline = driver.findElement(By.xpath("//span[text()='Add resume headline']"));
		headline.click(); //add resume headline
		WebElement text = driver.findElement(By.id("resumeHeadlineTxt"));
		text.click();
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		
//		//headline.sendKeys(" "); //Add Resume Headline with Empty Text
//		text.sendKeys(" ");
//		save.click();
//		
//		//Add Resume Headline with Maximum Length
//		text.sendKeys("Skilled Software Engineer | Crafting Efficient and Scalable Solutions for Complex Challenges");
//		Thread.sleep(3000);
//		save.click();
//				
//		
//		//Add Resume Headline with Invalid Characters
//		text.sendKeys("Skilled Software Engineer@3$^%^*&() gftf@$#%");
//		Thread.sleep(3000);
//		save.click();	
//		
//		//Edit Existing Resume Headline
//		text.sendKeys("Skilled Software Engineer | Crafting Efficient and Scalable Solutions for Complex Challenges");
//		Thread.sleep(3000);
//		save.click();	
		
		//Add Multiple Resume Headlines
//		text.sendKeys("Skilled Software Engineer | Crafting Efficient and Scalable Solutions for Complex Challenges,
//		Passionate Educator | Fostering Lifelong Learning and Growth in Students,
//		Detail-Oriented Administrative Assistant | Streamlining Operations and Improving Efficiency");
//		Thread.sleep(3000);
//		save.click();
		
		
		}
	public static void keyskill() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/mnjuser/profile']")).click();
		WebElement keyskills = driver.findElement(By.xpath("//span[text()='Add key skills']"));
		keyskills.click();
//		WebElement enter = driver.findElement(By.xpath("keySkillSugg"));
//		enter.click();
//		enter.sendKeys("java");
		
		//Add Key Skill with Maximum Length
		driver.findElement(By.xpath("//span[text()='Java']")).click();	
		driver.findElement(By.xpath("//span[text()='SQL']")).click();
		driver.findElement(By.xpath("//span[text()='Angular']")).click();
		driver.findElement(By.xpath("//span[text()='Javascript']")).click();
		driver.findElement(By.xpath("//span[text()='Python']")).click();
		WebElement save = driver.findElement(By.xpath("saveKeySkills"));
		save.click();
		
		driver.findElement(By.id("saveKeySkills")).click();
		
		//Add Key Skill with Empty Text
		driver.findElement(By.xpath("  ")).click();
		//Add Key Skill with Valid Text
		driver.findElement(By.xpath("//span[text()='Java']")).click();	
		
		//Add Key Skill with Invalid Characters
		keyskills.click();
		keyskills.sendKeys("@#^$dghjjh%&^((*");
		
	}
	
	public static void Aboutus() {
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		Set<String> window = driver.getWindowHandles();
		for(String n: window) {
			driver.switchTo().window(n);
		}
		
	}
	public static void Helpcenter() throws InterruptedException {
		Thread.sleep(3000);
		WebElement help = driver.findElement(By.xpath("//a[text()='Help center']"));
		help.click();
		Thread.sleep(3000);
//		driver.findElement(By.id("keyword_search")).sendKeys("How to reset password\", \"How to upload a resume");
//		driver.findElement(By.xpath("//button[@class='search_btn']")).click();
		
		driver.findElement(By.xpath("(//div[@class='content_box'] )[5]")).click();
		Set<String> window = driver.getWindowHandles();
		for(String n: window) {
			driver.switchTo().window(n);
		}
		driver.navigate().back();
		//Interview Advice
		driver.findElement(By.xpath("(//a[@href='https://www.naukri.com/blog/tag/interview-advice/'])[2]")).click();
		Set<String> window2 = driver.getWindowHandles();
		for(String n2: window2) {
			driver.switchTo().window(n2);
		}
		
	  }
	
	public static void privacyPolicy() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Privacy policy']")).click();
		driver.navigate().back();
		
	}
	
	public static void careers() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		Set<String> window3 = driver.getWindowHandles();
		for(String n3: window3) {
			driver.switchTo().window(n3);
		}
		
		//about
		driver.findElement(By.xpath("//span[text()='About']")).click();
		driver.findElement(By.xpath("//span[text()='Office']")).click();
		driver.findElement(By.xpath("//span[text()='Office")).click(); //People
		driver.findElement(By.xpath("//span[text()='Benefits")).click(); //Benefits
		driver.findElement(By.xpath("//span[text()='Jobs")).click();  //Jobs
		driver.navigate().back();
		
		}
	
	public static void Termsconditions() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Terms & conditions']")).click();
		Set<String> window4 = driver.getWindowHandles();
		for(String n: window4) {
			driver.switchTo().window(n);
		}
		 driver.findElement(By.xpath("//a[@href='https://jobsearch.naukri.com/mynaukri/mn_privacypolicy.php']")).click(); //link
		 Set<String> win = driver.getWindowHandles();
			for(String n: win) {
				driver.switchTo().window(n);
			}
			
			driver.navigate().back();
			
			}
	
	public static void  Reportissue() throws InterruptedException, AWTException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Report issue']")).click();
		Set<String> win = driver.getWindowHandles();
		for(String n: win) {
			driver.switchTo().window(n);
		}
		
		WebElement name =driver.findElement(By.xpath("//input[@name='strName']"));
		name.sendKeys("Jhon");
		WebElement email = driver.findElement(By.xpath("//input[@name='strEmail']"));
		email.sendKeys("srggh@gmail.com");
		WebElement no = driver.findElement(By.xpath("//input[@name='strMobile']"));
		no.sendKeys("2345678934");
		WebElement sub = driver.findElement(By.xpath("//input[@name='strSubject']"));
		sub.sendKeys("fake compines");
		WebElement details = driver.findElement(By.xpath("//textarea[@name='strDetails']"));
		details.sendKeys("privacy policy and contact details not fare");
		
		WebElement attachement = driver.findElement(By.id("atchRes"));
		attachement.click();
		r = new Robot();
		r.delay(2000);
		
		StringSelection s = new StringSelection("C:\\Users\\lenovo\\Pictures\\Screenshots..png"); 
		//StringSelection s = new StringSelection("C:\\Users\\lenovo\\Pictures\\Screenshots..png"); // size morethan 150kb
		//StringSelection s = new StringSelection("C:\\Users\\lenovo\\Pictures\\Screenshots..png"); // size Lessthan 50kb
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("(//div[@role='presentation'])[2]")).click();
	driver.findElement(By.id("Submit")).click();
	}
	
	public  static void logout() {
		driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
	}
	
	public  static void Delete() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();
		driver.findElement(By.xpath("//a[text()='Settings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Read More']")).click();
		Thread.sleep(3000);
		WebElement down = driver.findElement(By.xpath("//i[text()='DownArrow']"));
		down.click();
		
		driver.findElement(By.xpath(" //a[@data-id='notLooking_1']")).click(); //delete acc
		
		//Deactiveate till next login
//        driver.findElement(By.xpath("//a[text()='CANCEL']")).click(); //cancel
		driver.findElement(By.xpath("//button[text()='Deactivate and Logout']")).click(); //Deactivate and Logout
		
		//Delete account
		
		WebElement password = driver.findElement(By.id("passwordField"));
		WebElement deleteAcc = driver.findElement(By.id("passowrdConfirmation"));
		WebElement sumbit = driver.findElement(By.xpath("saveDeleteFeedback"));
		
//       //1.I am getting too many phone calls from recruiters
//		driver.findElement(By.xpath("//a[@data-id='notLooking_2']")).click();
//		driver.findElement(By.xpath("//label[text()='I am getting too many phone calls from recruiters.']")).click();
//		sumbit.click();
//		password.sendKeys("Deepika2123");
//		deleteAcc.click();
//		
//		////I am not receiving relevant jobs
//		driver.findElement(By.xpath("//a[@data-id='notLooking_2']")).click();
//		driver.findElement(By.xpath("//label[text()='I am not receiving relevant jobs.']")).click();
//		sumbit.click();
//		password.sendKeys("Deepika2123");
//		deleteAcc.click();
		
//		// I am getting too many emails
//		driver.findElement(By.xpath("//a[@data-id='notLooking_2']")).click();
//		driver.findElement(By.xpath("//label[text()='I am getting too many emails.']")).click();
//		sumbit.click();
//		password.sendKeys("Deepika2123");
//		deleteAcc.click();
//		
//		//Found a new job
//		driver.findElement(By.xpath("//a[@data-id='notLooking_2']")).click();
//		driver.findElement(By.xpath("//label[text()='Found a new job.']")).click();
//		sumbit.click();
//		password.sendKeys("Deepika2123");
//		deleteAcc.click();
		
		//I have a duplicate account
		driver.findElement(By.xpath("//a[@data-id='notLooking_2']")).click();
		driver.findElement(By.xpath("//label[text()='I have a duplicate account.']")).click();
		sumbit.click();
		password.sendKeys("Deepika2123");
		deleteAcc.click();
//		
//		//others
//		driver.findElement(By.xpath("//a[@data-id='notLooking_2']")).click();
//		driver.findElement(By.xpath("//label[text()='Other']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("otherText")).sendKeys("NA /srtghdj/egtfdn/acdsfb"); //reasons
//		sumbit.click();
//		password.sendKeys("Deepika2123");
//		deleteAcc.click();
//		

	}
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
       //register();
		login();
	   searchjob();
	   //resueupload();
		//notifications();
		//profileHeadlineUpdate();
		//keyskill();
		//Aboutus();
		//Helpcenter();
		//privacyPolicy();
		//careers();
		//Termsconditions();
		//Reportissue();
		//Delete();
	}

}
