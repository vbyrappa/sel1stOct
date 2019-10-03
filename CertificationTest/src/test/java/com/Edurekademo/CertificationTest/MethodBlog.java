package com.Edurekademo.CertificationTest;
	
	import java.io.File;
import java.io.IOException;
import java.util.List;

	import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	public class MethodBlog {
		
		static WebDriver driver;
		
		public static void openBrowser()
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
			driver = new ChromeDriver(options);	
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
			Thread.sleep(7000);
		}
		
		public static void clickToOpenBlog(String value) throws InterruptedException{
			driver.findElement(By.xpath(value)).click();
			Thread.sleep(1000);
		}
		
		public static void clickBlog(String value) throws InterruptedException{
//			Actions action=new Actions(driver);
//			WebElement viewBlog = driver.findElement(By.xpath(value));
//			action.moveToElement(viewBlog).perform();
//			viewBlog.click();
			List<WebElement> options = driver.findElements(By.xpath(value));
			for(WebElement option : options) {
			    if (option.getText().equals("Blog")) {
			        option.click();
			    }
			}
			Thread.sleep(3000);
		}
		
		public static void questionsBlog(String value) throws InterruptedException{
			((JavascriptExecutor) driver).executeScript("scroll(0,1500)"); /// to scroll the page down
			/// Click On Enroll
			Thread.sleep(5000);

			driver.findElement(By.cssSelector(value)).click();
			// validating element

			Thread.sleep(3000);
		}
		
		public static void courseBlog(String value) throws InterruptedException{
			driver.findElement(By.xpath(value)).click();
			Thread.sleep(3000);
		}
		
		public static void interviewQuestions(String value) throws InterruptedException{
			driver.findElement(By.xpath(value)).click();
			Thread.sleep(3000);
		}
		
		public static void screenQuestion(String param) throws IOException, InterruptedException{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File(param));
		Thread.sleep(2000);
		}
		
		public static void closeOpenBrowser(){
			driver.close();
		}
			
		}

