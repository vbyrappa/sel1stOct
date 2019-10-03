package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PersonalDetails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //Browser is Maximizing
		driver.get("https://www.edureka.co/"); //Edureka login page is opening
		
Thread.sleep(5000);
		
//CLick on Login to OPen the Window
		driver.findElementByLinkText("Log In").click();
		
		//Verify that the Login Page is appearing to Enter the Credentials
		String loginText = driver.findElementByXPath("//*[@id=\"new_sign_up_mode\"]/div/div/div[1]/h4").getText();
		System.out.println(loginText);
		
		Thread.sleep(3000);
		
		//Enter the UserName and Password and CLick on Login Button
		driver.findElementById("si_popup_email").sendKeys("vijay.byrappa@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("P@ssword123");
		driver.findElementByCssSelector(".tr_signin_form > button:nth-child(3)").click();
		
		driver.get("https://learning.edureka.co/onboarding/personaldetails"); //Edureka login page is opening
		Thread.sleep(5000);

	}

}
