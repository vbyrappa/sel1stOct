package SeleniumPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFlipkartAdd {
	
static ChromeDriver driver;
	
	public static boolean flipPresent(){
		boolean crossStatus;
		try {
			driver.findElement(By.xpath("//html//button[contains(@class, '_2AkmmA _29YdH8')]"));
			crossStatus = true;
		}catch (Exception e){
			crossStatus = false;
		}
		return crossStatus;
	}
		
	public static void main(String[] args) throws InterruptedException, IOException {
		//Initiate and Launch Browser
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		//Navigate to the Application Page
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		//driver.findElement(By.xpath("")).sendKeys("");
		
		//Compare the Page Title with the Actual and Expected
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)){
			System.out.println("Expected Page is displaying Title : " + expectedTitle);
		}
		else
		{
			System.out.println("Expected Page is not displaying the Title : " + actualTitle);
		}
		
		if(flipPresent()){
		driver.findElement(By.xpath("//html//button[contains(@class, '_2AkmmA _29YdH8')]")).click();
		}
		
		//Search the Book of Selenium
		
      WebElement search = driver.findElement(By.name("q"));          //search-inp
      search.sendKeys("Selenium");
      Thread.sleep(3000);
      search.sendKeys(Keys.DOWN, Keys.ENTER);
      Thread.sleep(2000);
    
      driver.navigate().to("https://www.flipkart.com/selenium-webdriver-1st/p/itmdwsczsh4mcrfz?pid=9789332526297&lid=LSTBOK9789332526297BWJLAW&marketplace=FLIPKART&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_0_8_na_na_pr&otracker1=AS_QueryStore_OrganicAutoSuggest_0_8_na_na_pr&fm=SEARCH&iid=2b6811b5-35b5-44df-8097-b29c2deb6c53.9789332526297.SEARCH&ppt=sp&ppn=sp&ssid=e0t97yxh8w0000001568793465891&qH=4caa39e4ca25189b");
      
      //Enter the PIN COde
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id='pincodeInputId']")).clear();
      Thread.sleep(5000);
      WebElement iField = driver.findElement(By.xpath("//*[@id='pincodeInputId']"));
      iField.sendKeys("560027");
      iField.sendKeys(Keys.ENTER);
      Thread.sleep(4000);
      driver.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/span").click();
      
      //Add to Chart
      Thread.sleep(4000);
      driver.findElementByXPath("//*[@id='container']//button[contains(@class, '_2AkmmA _2Npkh4 _2MWPVK')]").click();
      
      //click on the Place Order
      Thread.sleep(5000);
      driver.findElementByXPath("//*[@id='container']/div/div[2]/div[2]/div/div[1]/div/div[3]/div/form/button").click();
      
      //Enter the invlaid Email-id
      Thread.sleep(4000);
      driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("vijaygmail.com");
      driver.findElementByXPath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/button").click();
      String textError = driver.findElementByCssSelector("#container > div > div._1Ua1Gl > div > div._3B4tat > div:nth-child(1) > div > div > div > div > div.col.col-5-12 > div > form > div._39M2dM._2ZvOfP > span.ZAtlA- > span").getText();
      System.out.println(textError);
      
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\selenium\\flipkart.png"));
		Thread.sleep(1000);

//      driver.close();
	}
}
