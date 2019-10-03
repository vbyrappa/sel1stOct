package com.Edurekademo.CertificationTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class MethodProfessional {
		
	static WebDriver driver;
		
		public static void openBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
			driver = new ChromeDriver();	
		}

		public static void maximizeBrowser() throws InterruptedException{
			driver.manage().window().maximize();
			//Thread.sleep(2000);
		}
		
		public static void gotoAppl(String url) throws InterruptedException{
			driver.get(url);
			Thread.sleep(3000);
		}

		public static void clickLogin(String value) throws InterruptedException{
			driver.findElement(By.cssSelector(value)).click();
			Thread.sleep(1000);
		}
		
		public static void loginName(String value, String param) throws InterruptedException{
			driver.findElement(By.id(value)).sendKeys(param);
			Thread.sleep(2000);
		}
		
		public static void loginPassword(String value, String param) throws InterruptedException{
			driver.findElement(By.id(value)).sendKeys(param);
			Thread.sleep(2000);
		}
		
		public static void loginButton(String value) throws InterruptedException{
			driver.findElement(By.xpath(value)).click();
			Thread.sleep(3000);
		}
		
		public static void clickUserImage(String value){
			driver.findElement(By.xpath(value)).click();
		}
		
		public static void clickOnProfile(String value) throws InterruptedException{
			driver.findElement(By.linkText(value)).click();
			Thread.sleep(4000);
		}
		
		public static void editForProfessional(String value) throws InterruptedException{
			driver.findElement(By.cssSelector(value)).click();
			Thread.sleep(2000);
		}
		
		public static void enterCompanyName(String value, String param) throws InterruptedException{
			driver.findElement(By.name(value)).clear();
			driver.findElement(By.name(value)).sendKeys(param);
			Thread.sleep(2000);
		}
		
		public static void selectIndustryName(String value, String param) throws InterruptedException{
			//driver.findElement(By.name(value)).clear();
			Select profSelect = new Select(driver.findElement(By.name(value)));
			profSelect.selectByValue(param);
			//Thread.sleep(4000);
			Thread.sleep(2000);
		}
	
		public static void enterRequiredSkills(String value, String param){
			driver.findElement(By.name(value)).clear();
			driver.findElement(By.name(value)).sendKeys(param);
		}
		
		public static void enterJobLevel(String value, String param) throws InterruptedException{
			Select profSelectJob = new Select(driver.findElement(By.name(value)));
			profSelectJob.selectByValue(param);
			Thread.sleep(4000);
		}
		
		public static void screenProfessionalEntered(String param) throws IOException, InterruptedException{
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File(param));
			Thread.sleep(1000);
		}
		
		public static void professionalNext(String value) throws InterruptedException{
			driver.findElement(By.xpath(value)).click();
			//driver.findElement(By.xpath(value)).click();
			Thread.sleep(3000);
		}
		
		public static void careerNext(String value) throws InterruptedException{
			driver.findElement(By.xpath(value)).click();
			//driver.findElement(By.xpath(value)).click();
			Thread.sleep(3000);
		}
		
		public static void otherNext(String value) throws InterruptedException{
			driver.findElement(By.xpath(value)).click();
			Thread.sleep(4000);
		}
		
		public static void verifyProfile(String value) throws InterruptedException{
			driver.findElement(By.xpath(value)).click();
			Thread.sleep(4000);
		}
		
		public static void checkProfDetails(String value) throws InterruptedException{
			driver.findElement(By.linkText(value)).click();
			Thread.sleep(3000);
		}
		
		public static void verifyUpdProf(String param) throws IOException, InterruptedException{
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File(param));
			Thread.sleep(1000);
		}
		
//		public static void applClose(){
//			driver.close();
//		}
}
