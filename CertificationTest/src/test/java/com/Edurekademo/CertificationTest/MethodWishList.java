package com.Edurekademo.CertificationTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodWishList {
	
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
	
	public static void searchWishCourse(String value, String param) throws InterruptedException{
		WebElement wishCourse = driver.findElement(By.xpath(value));
		wishCourse.sendKeys(param);
		wishCourse.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public static void clickOnWishCourse(String value) throws InterruptedException{
		driver.findElement(By.xpath(value)).click();
		Thread.sleep(1000);
	}
	
	public static void viewWishCourseDetails(String value) throws InterruptedException{
		driver.findElement(By.xpath(value)).click();
		Thread.sleep(1000);
	}
	
	public static void screenWishCourse(String param) throws IOException, InterruptedException{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File(param));
		Thread.sleep(1000);
	}
	
	public static void enrollWishCourse(String value) throws InterruptedException{
		((JavascriptExecutor) driver).executeScript("scroll(0,500)"); /// to scroll the page down
		/// Click On Enroll
		Thread.sleep(5000);

		driver.findElement(By.xpath(value)).click();
		// validating element

		Thread.sleep(3000);
	}
	
	public static void enrollWishCourseCapture(String param) throws IOException, InterruptedException{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File(param));
			Thread.sleep(1000);
	}
	
	public static void applClose(){
		driver.close();
	}
}
