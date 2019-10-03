package testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgVerifyTitle {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void openBrowserWindow(){
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");		
	driver = new ChromeDriver();
	
	//Navigate to the Application Page
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	}
	
	@Test
	public void titleVerification(){
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
		
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}

}
