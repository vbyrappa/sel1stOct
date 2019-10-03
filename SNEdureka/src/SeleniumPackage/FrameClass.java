package SeleniumPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbyrappa\\workspace\\SNEdureka\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("classFrame");
		WebElement bigFrame = driver.findElementByXPath("/html/frameset/frame");
		driver.switchTo().frame(bigFrame);
	
		
		driver.findElementByCssSelector("body > div.topNav > ul > li:nth-child(5)").click();
		
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame("packageFrame");
		WebElement smallFrame = driver.findElementByXPath("/html/frameset/frameset/frame[2]");
		driver.switchTo().frame(smallFrame);
		
		Thread.sleep(1000);
		
		//driver.findElementByCssSelector("body > div > ul > li:nth-child(19) > a").click();
		driver.findElementByLinkText("AddFindsChildByCss").click();
		
		driver.switchTo().defaultContent();
				
		//driver.switchTo().frame("packageListFrame");
		WebElement thirdFrame = driver.findElementByXPath("/html/frameset/frameset/frame[1]");
		driver.switchTo().frame(thirdFrame);
		
		driver.findElementByLinkText("com.thoughtworks.selenium").click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
