package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module2 {
	
	public static void main(String[] args) throws InterruptedException{
		
//		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"search-inp\"]")); // Your element
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object aa=executor.executeScript("var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;", element);
		System.out.println("Attributes are as below \n : " + aa.toString());
		driver.findElement(By.linkText("Log In")).click();
		//driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
