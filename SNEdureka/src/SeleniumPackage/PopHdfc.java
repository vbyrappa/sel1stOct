package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHdfc {
	static ChromeDriver driver;
	
	public static boolean advtPresent() {
		boolean advtstatus;
		try {
			driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img"));
			advtstatus = true;
		}
		catch (Exception e){
			advtstatus = false;
		}
		return advtstatus;
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		//driver.findElement(By.linkText(" Visit old Website ")).click();
		
		if(advtPresent()){
		driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img")).click();
		}
		Thread.sleep(5000);
		driver.close();
	}
}
	
