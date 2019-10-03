package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {
	
	public static void main(String[] args) {
		//Open the Chrome Browser through Driver
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to the Application Page
		driver.get("https://facebook.com");
		//driver.findElement(By.xpath("")).sendKeys("");
		
		//Compare the Page Title with the Actual and Expected
		String expectedTitle = "Facebook – log in or sign up";
		
	    String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)){
			System.out.println("Expected Page is open : " + expectedTitle);
		}
		else
		{
			System.out.println("Expected Page is not opened : " + actualTitle);
		}
	}

}
