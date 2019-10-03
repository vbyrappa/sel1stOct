package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbyrappa\\workspace\\SNEdureka\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://whitecircleschool.com/prompt-box/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElementByXPath("/html/body/div[1]/div/div/section[3]/div/div/div/div/div/div/div/button").click();
		
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("Vijay Kumar B");
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
