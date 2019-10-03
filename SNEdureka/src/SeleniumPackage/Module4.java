package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Module4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();		
		driver.get("https://www.goindigo.in/?linkNav=home_header");

		Thread.sleep(5000);
		
		WebElement enterPlace = driver.findElement(By.name("or-dest"));
		enterPlace.sendKeys("Lucknow");
		enterPlace.sendKeys(Keys.ENTER);
	
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.cssSelector("#bookFlightTab > form > div.or-tab-content.trip-tab-content > div.row.justify-content-around.ie-justify-dest > div.col-sm-5.col-5.padd-right > div > input")));
        driver.findElement
                (By.cssSelector("#bookFlightTab > form > div.or-tab-content.trip-tab-content > div.row.justify-content-around.ie-justify-dest > div.col-sm-5.col-5.padd-right > div > input")).click();
        driver.findElement(By.xpath("(//a[contains(@class,'ui-state-default')])[32]")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("#bookFlightTab > form > div.row.justify-content-around.ie-justify-pass-cur > div.col-sm-5.col-5.padd-left.pax-selection-container > div.ig-input-group.field-float > input")).click();
        
        WebElement increase = driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]"));
        increase.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement increase1 = driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]"));
        increase1.sendKeys(Keys.ENTER);
        increase1.sendKeys(Keys.ENTER);
        increase1.sendKeys(Keys.ENTER);
	
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/div/button")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[7]/div[6]/button/span[1]")).click();
        Thread.sleep(6000);
        
        driver.findElement(By.xpath("//*[@id=\"bookingWidgetContainer\"]/div/div/div/div[2]/div[1]/div/div[2]/div[1]/button/div[1]/i")).click();
	}
}
