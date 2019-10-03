package testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkartExample {
	
		ChromeDriver driver;
		@BeforeTest
		public void openBrowserWindow(){
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");		
			driver = new ChromeDriver();
			
			//Navigate to the Application Page
			driver.manage().window().maximize();
			driver.get("https://flipkart.com");
			}
		
		@Test
		public void titleVerification(){
			String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		
		//This is for clicking the Login Pop-up Window
		@Test
		public void loginWindow() throws InterruptedException {
		System.out.println("1");
			Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		System.out.println("2");
			}  
		
		@Test
		public void searchSeleniumBook() throws InterruptedException{
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium WebDriver");
		Thread.sleep(3000);
		search.sendKeys(Keys.DOWN, Keys.ENTER);
		Thread.sleep(5000);
		}
		
		@Test
		public void searchBookOpen() {
		      driver.navigate().to("https://www.flipkart.com/selenium-webdriver-1st/p/itmdwsczsh4mcrfz?pid=9789332526297&lid=LSTBOK9789332526297BWJLAW&marketplace=FLIPKART&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_0_8_na_na_pr&otracker1=AS_QueryStore_OrganicAutoSuggest_0_8_na_na_pr&fm=SEARCH&iid=2b6811b5-35b5-44df-8097-b29c2deb6c53.9789332526297.SEARCH&ppt=sp&ppn=sp&ssid=e0t97yxh8w0000001568793465891&qH=4caa39e4ca25189b");
		}
	
	      //Enter the PIN COde
		@Test
		public void pinCode() throws InterruptedException{
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id='pincodeInputId']")).clear();
	      Thread.sleep(3000);
	      driver.findElement(By.cssSelector("#pincodeInputId")).sendKeys("560027");
	      Thread.sleep(4000);
	      driver.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/span").click();
		}
		
		//Add to Cart
		@Test
		//Add to Chart
	    public void addCart() throws InterruptedException {  
		Thread.sleep(4000);
	    driver.findElementByXPath("//*[@id='container']//button[contains(@class, '_2AkmmA _2Npkh4 _2MWPVK')]").click();
		}
		
		//click on the Place Order
		@Test
		public void placeOrder() throws InterruptedException{
	      Thread.sleep(5000);
	      driver.findElementByXPath("//*[@id='container']/div/div[2]/div[2]/div/div[1]/div/div[3]/div/form/button").click();
		}
		
	    //Enter the invlaid Email-id
		@Test
		public void invalidEmail() throws InterruptedException{
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("vijaygmail.com");
	      driver.findElementByXPath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/button").click();
	      String textError = driver.findElementByCssSelector("#container > div > div._1Ua1Gl > div > div._3B4tat > div:nth-child(1) > div > div > div > div > div.col.col-5-12 > div > form > div._39M2dM._2ZvOfP > span.ZAtlA- > span").getText();
	      System.out.println(textError);
		}
		
		@AfterTest
		public void closeBrowser(){
			driver.close();
		}
}
