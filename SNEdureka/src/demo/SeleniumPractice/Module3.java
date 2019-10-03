package demo.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Module3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"search-inp\"]"));
		search.sendKeys("Selenium");
		search.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id=\"add-training-courses\"]//span[contains(@class,'viewdetailsbtn')])[1]")));
		
		
		driver.findElement(By.xpath("(//*[@id=\"add-training-courses\"]//span[contains(@class,'viewdetailsbtn')])[1]")).click();
		
		Thread.sleep(1000);
		String expectedSelenium = "Selenium Certification Training & Course With Project - Edureka";
		String actualSelenium = driver.getTitle();
		
		if(actualSelenium.equals(expectedSelenium)){
			System.out.println("Title of the Selenium Course matches : ");
		}
		else
		{
			System.out.println("Title of the Selenium Course not matches : ");
		}
			
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[@id=\"navbar\"]//a[contains(@class,'giTrackElementHeader')])[2]")).click();
		Thread.sleep(10000);
		driver.close();
		}
}
