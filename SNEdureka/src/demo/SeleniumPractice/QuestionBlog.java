package demo.SeleniumPractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuestionBlog {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
        // Create object of HashMap Class
	//	Map<String, Object> prefs = new HashMap<String, Object>();
      
        // Set the notification setting it will override the default setting
		//prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
		//ChromeOptions options = new ChromeOptions();

        // Set the experimental option
//		options.setExperimentalOption("prefs", prefs);
		
		
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/blog/");
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//*[@id=\"wzrk_wrapper\"]/div[2]")).click();
		//driver.findElement(By.id("wzrk-confirm")).click();
		//Thread.sleep(2000);
		
		//alert_obj = driver.switchTo().alert()
		
	
		driver.findElement(By.xpath("/html/body/section[6]/div/div/div/button[3]/span")).click();
		
		//driver.switchTo().alert().accept();
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("scroll(0,1500)"); /// to scroll the page down
		/// Click On Enroll
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/section[3]/div/div/div[3]/a/div/div[2]/span[1]")).click();
		// validating element

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[contains(.,'Software Testing')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h2[contains(@class,'mb-3')])[3]")).click();
		
		//driver.findElement(By.xpath("/html/body/section[6]/div/div/div/button[3]/span"));	
//		Cancel the PUSH Notifications
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
		
	}

}
