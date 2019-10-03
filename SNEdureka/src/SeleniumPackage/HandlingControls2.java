package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingControls2 {

	private static final String Assert = null;
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
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
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
		driver.findElementByLinkText("Log In").click();
		
		//Verify that the Login Page is appearing to Enter the Credentials
		String loginText = driver.findElementByXPath("//*[@id=\"new_sign_up_mode\"]/div/div/div[1]/h4").getText();
		System.out.println(loginText);
		
		Thread.sleep(3000);
		
		//Enter the UserName and Password and CLick on Login Button
		driver.findElementById("si_popup_email").sendKeys("vijay.byrappa@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("P@ssword123");
		driver.findElementByCssSelector(".tr_signin_form > button:nth-child(3)").click();
		
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
		driver.findElementByLinkText("My Profile").click();
		
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

		String gtProf = driver.findElement(By.xpath("//*[@id='collapseOne']/div/div/div[2]")).getText();
		boolean gtProf1 = driver.findElement(By.xpath("//*[@id='collapseOne']/div/div/div[2]")).isDisplayed();

		System.out.println(gtProf);
		System.out.println(gtProf1);
		
		if(gtProf.equals(gtProf1)){
				System.out.println("Page is displaying as Profile Photo : ");
			}
			else {
				System.out.println("Page is not displaying as Profile Photo");
			}
				
		Thread.sleep(3000);
		//If Professional Details Page is appearing than Please click on the Previous Button
if(prevPresent()){
	driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn onboarding-previous-button hidden-xs hidden-sm')]")).click();
}else {

Thread.sleep(3000);

//Continue Enter the details of the Professional Details
driver.findElement(By.name("fullname")).clear();
driver.findElement(By.name("fullname")).sendKeys("Vijay Kumar B");
//Since the email-id is not able to identify the Element
//Thread.sleep(4000);
boolean email1 = driver.findElement(By.xpath("//div[@id = 'personaldetails']//input[contains(@name, 'email')]")).isEnabled();
boolean email = driver.findElement(By.xpath("//div[@id = 'personaldetails']//input[contains(@name, 'email')]")).isDisplayed();
System.out.println(email1 + "Email filed is Enabled");
System.out.println(email + "Email field is Displaying");
System.out.println("10");

Thread.sleep(4000);
driver.findElement(By.name("currentrole")).clear();
driver.findElement(By.name("currentrole")).sendKeys("Software Quality Assurance");

Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='collapseOne']//button[contains(@class, 'btn btn-default pull-right verify-continue-btn')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='collapseOne']//button[contains(@class, 'btn btn-default pull-right verify-continue-btn')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='collapseOne']//button[contains(@class, 'btn btn-default pull-right verify-continue-btn')]")).click();
}

//To Skip the Page
Thread.sleep(3000);
String skipHead = driver.findElement(By.xpath("//*[@id='collapseOne']/div/div/h2")).getText();
boolean skipHead1 = driver.findElement(By.xpath("//*[@id='collapseOne']/div/div/h2")).isDisplayed();
String skipHead2 = "Edureka’s Career Services";

//Verify that the Skip Page is displaying or not
System.out.println("Skip head is displaying the heading : " + skipHead);
System.out.println("Skip head is displaying : " + skipHead1);

		if(skipHead.equals(skipHead2)){
			System.out.println("Edureka Page OPens");
		}
		else {
			System.out.println("Edureka Page is not Matching");
		}

Thread.sleep(3000);
//Click on Skip
driver.findElement(By.linkText("Skip")).click();

//Verify Professional Menu
String profHead = driver.findElement(By.xpath("//*[@id='onboarding']//span[contains(@class, 'preofessional-heading')]")).getText();
boolean profHead1 = driver.findElement(By.xpath("//*[@id='onboarding']//span[contains(@class, 'preofessional-heading')]")).isDisplayed();
String profHead2 = "This information will help us create your candidate profile which will be shared with potential employers";
System.out.println("Professional Heading is displaying as : "+ profHead);
System.out.println("Professional Heading is Enabled and is : " + profHead1);
if(profHead.equals(profHead2)){
	System.out.println("Pofessional Details Page is opened");
}
else{
	System.out.println("{Professional Details page is not opened");
}

//PROFESSIONAL DETAILS
Thread.sleep(4000);
driver.findElement(By.name("companyName")).clear();
driver.findElement(By.name("companyName")).sendKeys("Conference Call Service India Pvt Ltd");
Thread.sleep(4000);
//driver.findElement(By.name("currentIndustry")).clear();
Select pdSelect = new Select(driver.findElement(By.name("currentIndustry")));
pdSelect.selectByValue("IT-Software / Software Services");
Thread.sleep(4000);
driver.findElement(By.name("userSkill")).clear();
driver.findElement(By.name("userSkill")).sendKeys("System/Funcational Testing SOAPUI");
Select pdSelectJob = new Select(driver.findElement(By.name("currentjob")));
pdSelectJob.selectByIndex(4);
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn pull-right onboarding-primary-button')]")).click();

Thread.sleep(3000);

//Verify that the Career Page is displaying 
String careerHead = driver.findElement(By.xpath("//*[@id='onboarding']//span[contains(@class,'career-interests-heading')]")).getText();
boolean careerHead1 = driver.findElement(By.xpath("//*[@id='onboarding']//span[contains(@class, 'career-interests-heading')]")).isDisplayed();
String careerHead2 = "Helps us understand what career opportunities you are looking for so that we can match open positions to your profile";
System.out.println("Career heading is displaying as: " + careerHead);
System.out.println("Career heading is enabled : " + careerHead1);
if (careerHead.equals(careerHead2)) {
	System.out.println("Career Details page are displaying");
}else{
System.out.println("Career Details Page is not displaying");
}

//Enter Details of the Career Details
Thread.sleep(3000);
Select caselect = new Select(driver.findElement(By.name("interestedJob")));
caselect.selectByIndex(5);
driver.findElement(By.xpath("//*[@id= 'onboarding']//button[contains(@class, 'btn btn-default current-place-dropdown dropdown-toggle')]")).click();
WebElement caCountry = driver.findElement(By.xpath("//*[@id='onboarding']//input[contains(@class, 'country-search')]"));
caCountry.sendKeys("INDIA");
caCountry.click();
Thread.sleep(1000);
driver.findElement(By.name("currentCity")).clear();
Thread.sleep(2000);
driver.findElement(By.name("currentCity")).sendKeys("MYSORE");
Select caType = new Select(driver.findElement(By.name("elementType")));
caType.selectByIndex(2);
Thread.sleep(2000);
Select salSelect = new Select(driver.findElement(By.name("lastDrawnSalary")));
salSelect.selectByIndex(4);
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[@id='onboarding']//span[contains(@class, 'checkmark')])[2]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='onboarding']//button[contains(@class, 'btn onboarding-primary-button pull-right')]")).click();

Thread.sleep(3000);
//Verify that the Other page is displaying
String otherHead = driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[1]/div/div/div")).getText();
boolean otherHead1 = driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[1]/div/div/div")).isDisplayed();
String otherHead2 = "Educational Details (Optional)";

System.out.println("Other Menu heading is displayed : " + otherHead);

System.out.println("Other Menu heading is Enabled : " + otherHead1);
if(otherHead.equals(otherHead2)){
	System.out.println("Other Details Page is displaying");
}else {
	System.out.println("Other Details page is not displaying");
}

//Click on the Save of the Other Details
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[@id='onboarding']//button[contains(@class, 'btn pull-right onboarding-primary-button')])[1]")).click();

Thread.sleep(3000);
//Community Button to Click
driver.findElement(By.cssSelector("#footauto > app-root > app-profile-main > app-header > header > nav > div > div.pull-right.url_list > ul > li.dropdown.forum_blog.hidden-xs > div > button > i")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Blog")).click();

Thread.sleep(5000);

//Edureka Blog
driver.navigate().to("https://www.edureka.co/blog/");
driver.manage().window().maximize();
Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id='wzrk_wrapper']/div[2]/div[1]")).getText();
//driver.findElement(By.id("wzrk-confirm")).click();
//driver.findElementByCssSelector("#wzrk-confirm").click();
//Thread.sleep(2000);

//Cnacel the PUSH Notifications
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--disable-notifications");

Thread.sleep(3000);
//Click on the Artifical Intelligence link
//driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/a/div/h3")).getText();
//driver.findElement(By.xpath("//h3[contains(text(),'Artificial Intelligence')]")
driver.findElement(By.xpath("//h3[contains(text(),'Artificial Intelligence')]")).click();

//Back to Edureka link
driver.navigate().to("https://learning.edureka.co/mycourses");

//Log out of Edureka
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='footauto']//img[contains(@class, 'user_image')]")).click();
driver.findElement(By.linkText("Log Out")).click();


Thread.sleep(6000);
	//	driver.close(); 	
		
	
	}
}
