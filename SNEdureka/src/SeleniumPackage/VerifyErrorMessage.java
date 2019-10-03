package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("batsman556677@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password123");
		driver.findElement(By.id("loginbutton")).click();
		
		//Compare the Error message with the expected and Actual
		String expectedMessage = "The email address that you've entered doesn't match any account. Sign up for an account.";
		String actualMessage = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
		
		if (expectedMessage.equals(actualMessage)){
			System.out.println("The Error message is displaying properly : " + expectedMessage);
		}
		else
		{
			System.out.println("The Error message is mnot displaying the proper message : " + actualMessage);
		}
		driver.close();
	}	
}
