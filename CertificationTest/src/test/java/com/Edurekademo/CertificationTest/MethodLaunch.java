package com.Edurekademo.CertificationTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodLaunch {
	static WebDriver driver;
	
	public static void openBrowser()
	{	
		
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		driver = new ChromeDriver();	
	}

	public static void maximizeBrowser() throws InterruptedException{
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public static void gotoAppl(String url) throws InterruptedException{
		driver.get(url);
		Thread.sleep(2000);
	}

	public static void clickLogin(String value) throws InterruptedException{
		driver.findElement(By.cssSelector(value)).click();
		Thread.sleep(3000);
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
		Thread.sleep(5000);
	}
	
	public static void screenImageLogOut(String param) throws IOException, InterruptedException{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File(param));
		Thread.sleep(5000);
	
	}
	public static void userNameClick(String value) throws InterruptedException{
		driver.findElement(By.cssSelector(value)).click();
		Thread.sleep(2000);
	}
	
	public static void clickLogOut(String value){
		driver.findElement(By.linkText(value)).click();
	}
	
	public static void closeOpenBrowser(){
		driver.close();
	}
}
