package demo.SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Module6Priority {

	WebDriver driver;
	
	@Test(priority=7)
	public void applicationSignUp() throws Exception{
	driver.findElement(By.linkText("Sign Up")).click();

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.id("sg_popup_email")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("sg_popup_email")).sendKeys("vijay.byrappa@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.id("sg_popup_phone_no")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("sg_popup_phone_no")).sendKeys("9611103816");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]//button[contains(@class,'clik_btn_log btn-block signup-new-submit')]")).click();
	Thread.sleep(3000);
	String expectedLoginErrorMsg = "You are registered with us. Login to continue.";
	String actualLoginErrorMsg = driver.findElement(By.xpath("//p[contains(.,'You are registered with us. Login to continue.')]")).getText();
	System.out.println("The error is mesage as : " + actualLoginErrorMsg);

	Assert.assertEquals(actualLoginErrorMsg, expectedLoginErrorMsg);
}
	
	@Test(priority=3)
	public void coursesAll() throws InterruptedException, IOException{
		((JavascriptExecutor) driver).executeScript("scroll(0,-100)"); /// to scroll the page down
		/// Click On Enroll
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header-breadcrumb/section/div/div/div[1]/span[2]/a")).click();
		// validating element

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id=\"add-training-courses\"]//span[contains(@class,'viewdetailsbtn')])[1]")).click();
		Thread.sleep(3000);
		//Take Screenshot
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\selenium\\DevOps.png"));
		Thread.sleep(1000);
		//Return Back to Allcourses
//		driver.findElement(By.xpath("(//*[@id=\"brdcrm_holder\"]//a[contains(@class,'ga-click')])[2]")).click();
//		Thread.sleep(5000);
	}
		
	@Test(priority=1)
	public void openBrowserApplication() throws InterruptedException{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.edureka.co/");
	Thread.sleep(5000);
	}	

	@Test(priority=4)
	public void enrollDevOps() throws InterruptedException, IOException{
		((JavascriptExecutor) driver).executeScript("scroll(0,500)"); /// to scroll the page down
		/// Click On Enroll
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"batch_table_enroll\"]/div/div[3]/a")).click();
		// validating element

		Thread.sleep(3000);   
		//Take Screenshot for enroll
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				// now copy the  screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File("C:\\selenium\\DevOpsEnroll.png"));
				Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='footer_v2']//h4[contains(.,'Big Data Hadoop Certification Training')]")).click();
	}
	
	@Test(priority=8)
	public void clseApplication(){
		driver.close();
	}
	
	@Test(priority=2)
	public void applicationLogin() throws InterruptedException{
	//CLick on Login to OPen the Window
	driver.findElement(By.linkText("Log In")).click();
	Thread.sleep(3000);
	
	//Enter the UserName and Password and CLick on Login Button
	driver.findElement(By.id("si_popup_email")).sendKeys("vijay.byrappa@gmail.com");
	driver.findElement(By.id("si_popup_passwd")).sendKeys("P@ssword123");
	driver.findElement(By.cssSelector(".tr_signin_form > button:nth-child(3)")).click();
	Thread.sleep(3000);
	}
	
	
	@Test(priority=6)
	public void homePage() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='footer_v2']/section/div/div[1]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log Out")).click();		
		Thread.sleep(5000);
	}
	

	@Test(priority=5)
	public void hadoopData() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2[contains(.,'Curriculum')]")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0,500)"); /// to scroll the page down
		/// Click On Enroll
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='batch_table_enroll']/div/div[3]/a")).click();
		// validating element

		Thread.sleep(3000);    
	}

}
