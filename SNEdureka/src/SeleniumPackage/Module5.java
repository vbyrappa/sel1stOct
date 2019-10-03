package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Module5 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		
		
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
			
		Thread.sleep(10000);
		//Click on the Username to Goto to the PROFILE to update your details
		driver.findElement(By.xpath("//*[@id=\"footauto\"]//span[contains(@class,'user_name')]")).click();
		Thread.sleep(1000);
		driver.findElementByLinkText("My Profile").click();
		
		//Click on Profile details
		driver.findElement(By.xpath("//*[@id=\"personal_details\"]//i[contains(@class,'icon-pr-edit')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("fullname")).clear();
		driver.findElement(By.name("fullname")).sendKeys("Vijay Byrappa K");
		Thread.sleep(1000);
		driver.findElement(By.name("currentrole")).clear();
		driver.findElement(By.name("currentrole")).sendKeys("Software Quality Analyst");
		//Thread.sleep(1000);
//		Select experience = new Select(driver.findElement(By.xpath("//*[@id=\"experience\"]")));
//		experience.selectByIndex(3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='collapseOne']//button[contains(@class, 'btn btn-default pull-right verify-continue-btn')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='collapseOne']//button[contains(@class, 'btn btn-default pull-right verify-continue-btn')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='collapseOne']//button[contains(@class, 'btn btn-default pull-right verify-continue-btn')]")).click();
//		driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[4]/a")).click();
		
		//Thread.sleep(3000);
		//Click on Skip
		driver.findElement(By.linkText("Skip")).click();
		
		//Enter Professional Details
		//PROFESSIONAL DETAILS
		Thread.sleep(4000);
		driver.findElement(By.name("companyName")).clear();
		driver.findElement(By.name("companyName")).sendKeys("Conference Call Service India Pvt Ltd");
		Thread.sleep(3000);
		//driver.findElement(By.name("currentIndustry")).clear();
		Select pdSelect = new Select(driver.findElement(By.name("currentIndustry")));
		pdSelect.selectByIndex(5);
		Thread.sleep(3000);
		driver.findElement(By.name("userSkill")).clear();
		driver.findElement(By.name("userSkill")).sendKeys("System AND Funcational Testing SOAPUI");
		Select pdSelectJob = new Select(driver.findElement(By.name("currentjob")));
		pdSelectJob.selectByIndex(2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn pull-right onboarding-primary-button')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn pull-right onboarding-primary-button')]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn onboarding-primary-button pull-right')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='onboarding']//button[contains(@class, 'btn pull-right onboarding-primary-button')])[1]")).click();
		
		Thread.sleep(4000);
		//Community Button to Click
		driver.findElement(By.cssSelector("#footauto > app-root > app-profile-main > app-header > header > nav > div > div.pull-right.url_list > ul > li.dropdown.forum_blog.hidden-xs > div > button > i")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Blog")).click();
		
		driver.findElement(By.xpath("//h3[contains(.,'Software Testing')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[5]/div/article/h2/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		//Click on the Username to Goto to the PROFILE to update your details
				driver.findElement(By.xpath("(//*[@id=\"header-II\"]//span[contains(@class,'webinar-profile-name')])[1]")).click();
				driver.findElement(By.linkText("Log Out"));
				Thread.sleep(10000);
		
		driver.close();
		
	}

}
