package SeleniumPackage;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbyrappa\\workspace\\SNEdureka\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		
		Thread.sleep(3000);
		
		//driver.findElementByXPath("//*[@id='iframeResult']");
		driver.switchTo().frame("iframeResult");
				
		//driver.findElementByXPath("/html/body/button").click();
		driver.findElementByCssSelector("body > button").click();
				
		driver.switchTo().alert().accept();
	
	}

}
