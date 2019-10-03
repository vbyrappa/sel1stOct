package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ticket2 {

		WebDriver driver;
		JavascriptExecutor js;

		@BeforeTest
		public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

		@Test
		public void applicationSignUp() throws Exception{
		driver.findElement(By.linkText("Sign Up")).click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("sg_popup_email")).sendKeys("vijay.byrappa@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("sg_popup_phone_no")).sendKeys("9611103816");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]//button[contains(@class,'clik_btn_log btn-block signup-new-submit')]")).click();
		Thread.sleep(3000);
		String expectedLoginErrorMsg = "You are registered with us. Login to continue.";
		String actualLoginErrorMsg = driver.findElement(By.xpath("//p[contains(.,'You are registered with us. Login to continue.')]")).getText();
		System.out.println("The error is mesage as : " + actualLoginErrorMsg);

		Assert.assertEquals(actualLoginErrorMsg, expectedLoginErrorMsg);
}
}