package testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class PracticeModule11 {
		WebDriver driver;	

		@BeforeTest
		public void test_setup() throws Exception {		
			System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.edureka.co/");
			Thread.sleep(5000);
	 }
			
		@Test
		public void test() throws Exception {
			driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/a[2]")).click();
			Thread.sleep(10000);
			driver.findElement(By.id("si_popup_email")).sendKeys("vijay.byrappa@gmail.com");
			driver.findElement(By.id("si_popup_passwd")).sendKeys("P@ssword123");
			
			driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='footauto']/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[1]/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='personal_details']/i")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='collapseOne']/div/div/div[2]/a/i")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='custom-input']")).click();
		Thread.sleep(10000);
		Runtime.getRuntime().exec("FileUploader.exe");
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-personal-details/div[2]/div/div/div[2]/div[2]/button")).click();
		
		
		}
		@AfterTest(enabled=false)
		public void Aftertest() throws Exception {
			Thread.sleep(1000);	
			driver.close();
		}
	}



