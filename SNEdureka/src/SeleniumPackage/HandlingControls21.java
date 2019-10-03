package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingControls21 {

	static ChromeDriver driver;
	public static boolean prevPresent() {
		boolean prevstatus;
		try {
			driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn onboarding-previous-button hidden-xs hidden-sm')]"));
			prevstatus = true;
		}
		catch (Exception e){
			prevstatus = false;
		}
		return prevstatus;
	}

	public static void main(String[] args) throws InterruptedException {
		//Initiate the Browser
		 System.setProperty( "webdriver.chrome.driver", "driver\\Chromedriver.exe");
	     driver = new ChromeDriver();
		driver.manage().window().maximize(); //Browser is Maximizing
		driver.get("https://www.edureka.co/"); //Edureka login page is opening
		Thread.sleep(1000);

//		Login Page Title Compare
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka"; //Login Page Title
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)){
			System.out.println("Page tiltle is matching : ");
		}
		else{
			System.out.println("Page Title is not matching : ");
		}
		
		//CLick on Login to OPen the Window
		driver.findElement(By.linkText("Log In")).click();
		
		//Verify that the Login Page is appearing to Enter the Credentials
		String loginText = driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[1]/h4")).getText();
		System.out.println(loginText);
		
		Thread.sleep(3000);
		
		//Enter the UserName and Password and CLick on Login Button
		driver.findElement(By.id("si_popup_email")).sendKeys("vijay.byrappa@gmail.com");
	driver.findElement(By.id("si_popup_passwd")).sendKeys("P@ssword123");
		driver.findElement(By.cssSelector(".tr_signin_form > button:nth-child(3)")).click();
		
		Thread.sleep(3000);
		
		//Verify once the Home is displaying 
		String hexpectedTitle = "My Classroom | Edureka";
		String hactualTitle = driver.getTitle();
		
		//Compare the Title 
		if(hexpectedTitle.equals(hactualTitle)){
			System.out.println("Home Page Title is matching : ");
		}
		else {
			System.out.println("Home Page title is not matching : ");
		}
		
		Thread.sleep(2000);
		//Click on the Username to Goto to the PROFILE to update your details
		driver.findElement(By.cssSelector("#footauto > app-root > app-mycourse-main > section > app-header > header > nav > div > div.pull-right.url_list > ul > li.dropdown.user_drop > div > button > img")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Profile")).click();
		
		//Verify that the Profile page is loaded and it is appearing and matching
		String pExpectedPage = "My Profile | Edureka";
		String pActualPage = driver.getTitle();
		
		if(pExpectedPage.equals(pActualPage)){
			System.out.println("Profile Title Page is matching : ");
		}
		else 
		{
			System.out.println("Profile Title Page is not matching : ");
		}
		
		//Click on Edit button
		driver.findElement(By.cssSelector("#professional_details > i")).click();
		
		Thread.sleep(3000);
		//If Professional Details Page is appearing than Please click on the Previous Button
if(prevPresent()){
	driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn onboarding-previous-button hidden-xs hidden-sm')]")).click();
}else {

Thread.sleep(3000);

//Continue Enter the details of the Professional Details
driver.findElement(By.name("fullname")).clear();
driver.findElement(By.name("fullname")).sendKeys("Vijay Kumar B");
System.out.println("1");

//Since the email-id is not able to identify the Element
Thread.sleep(4000);
/*email field is not interactable*/

//driver.findElement(By.xpath("//div[@id = 'personaldetails']//input[contains(@name, 'email')]")).clear();
//driver.findElement(By.xpath("//div[@id = 'personaldetails']//input[contains(@name, 'email')]")).sendKeys("vijay.byrappa@gmail.com");
//System.out.println("1");

//Thread.sleep(3000);
//I have not entering this field because it asks for the OTP
//driver.findElement(By.name("phone_number")).clear();
//driver.findElement(By.name("phone_number")).sendKeys("9611103816");
Thread.sleep(3000);
driver.findElement(By.name("currentrole")).clear();
driver.findElement(By.name("currentrole")).sendKeys("Software Quality Assurance");
Thread.sleep(2000);

System.out.println("2");

Select oselect = new Select(driver.findElement(By.id("experience")));
oselect.selectByIndex(1);
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/button")).click();
System.out.println("3");

Thread.sleep(5000);

}

driver.findElement(By.xpath("//*[@id=\"onboarding\"]//a[contains(text(),'Professional Details')]")).click();

Thread.sleep(2000);
//PROFESSIONAL DETAILS
driver.findElement(By.name("companyName")).clear();
driver.findElement(By.name("companyName")).sendKeys("Conference Call Service India Pvt Ltd");
Thread.sleep(2000);

//driver.findElement(By.name("currentIndustry")).clear();
Select pdSelect = new Select(driver.findElement(By.xpath("//select[@name='currentIndustry']")));
pdSelect.selectByValue("IT-Software / Software Services");

driver.findElement(By.name("userSkill")).clear();
driver.findElement(By.name("userSkill")).sendKeys("System/Funcational Testing SOAPUI");

Select pdSelectJob = new Select(driver.findElement(By.name("currentjob")));
pdSelectJob.selectByIndex(4);
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn pull-right onboarding-primary-button')]")).click();

		//Thread.sleep(5000);
		//driver.close();	
	}
}