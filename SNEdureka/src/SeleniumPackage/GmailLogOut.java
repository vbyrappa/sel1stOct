package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogOut {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		Thread.sleep(4000);
		
		//Login with Valid Credentials
		driver.findElement(By.id("identifierId")).sendKeys("v7kumar197@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > span")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("V@run123");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]//span[contains(@class,'RveJvd snByac')]")).click();
		Thread.sleep(5000);

		//Enter the Details to compose the mail and send
		driver.findElement(By.xpath("//*[@id=\":k1\"]//div[contains(@class,'T-I J-J5-Ji T-I-KE L3')]")).click();
		driver.findElement(By.name("to")).sendKeys("vbyrappa@rediffmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("TestMail");
		driver.findElement(By.xpath("/html/body//div[contains(@class,'Am Al editable LW-avf tS-tW')]")).sendKeys("This is a Test Mail from Kumar");
		driver.findElement(By.xpath("/html/body//div[contains(@class,'T-I J-J5-Ji aoO v7 T-I-atl L3')]")).click();
		Thread.sleep(3000);

		//CLick on the Signout of gmail
		driver.findElement(By.xpath("//*[@id=\"gb\"]//span[contains(@class,'gb_xa gbii')]")).click();
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	
		Thread.sleep(3000);
		driver.close();
	}

}
