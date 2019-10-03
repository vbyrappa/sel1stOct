package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/"); //Edureka login page is opening
		driver.manage().window().maximize(); //Browser is Maximizing
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Wait Statement or 
		Thread.sleep(1000);

//		Login Page Title Compare
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka"; //Login Page Title
		String actualTitle = driver.getTitle();
				
		System.out.println("Title is as : " + actualTitle); //Displaying what is stored in the Actual Title
		
		//Compare the Title for Actual and Expected
		if(expectedTitle.equals(actualTitle)){
			System.out.println("Login of Edureka Title is Matching and is verified");
		}
		else
		{
			System.out.println("Login of Edureka Title is not Matching and it is failed");
		}		
		
//		WebElement Attribute of the Programming & Frameworks 
		WebElement courseid = driver.findElement(By.id("programming-and-frameworks-certification-courses"));
		System.out.println(courseid.getAttribute("id"));
		WebElement courseclass = driver.findElement(By.id("programming-and-frameworks-certification-courses"));
		System.out.println(courseclass.getAttribute("class"));
		WebElement coursehref = driver.findElement(By.id("programming-and-frameworks-certification-courses"));
		System.out.println(coursehref.getAttribute("href"));
	
		WebElement search=driver.findElement(By.xpath("//input[@id='search-inp']"));           //search-inp
        search.sendKeys("Selenium");
        Thread.sleep(3000);
        search.sendKeys(Keys.DOWN, Keys.ENTER);
        Thread.sleep(2000);
		
		//Get the Links present in the Login Page of Edureka just 2i have considered
//		Get the Link Text for the Link "Big Data Hadoop Certification Training"
		String Llogin = driver.findElement(By.linkText("Big Data Hadoop Certification Training")).getText(); 
		System.out.println("Login Edureka LinkText is displaying as : " + Llogin);
		
//		Get the Partial Link Text for the Link "Post-Graduate Program in Artificial Intelligence & Machine Learning"
		String Plogin = driver.findElement(By.partialLinkText("Post-Graduate Program")).getText();
		System.out.println("Login Edureka PartialLink Text is displaying as : " + Plogin);
			
		//Get the CssSelector for the Edureka Logo
		String Edulogo = 
		driver.findElement(By.xpath("//header[@id='header-II']/section//a/i[@class='icon-logo edu-logo-style']")).getText();
		System.out.println(Edulogo); //It is not displaying in the System OutPut 
								
		//Login Button identifying using the CSSSelector
	    driver.findElementByXPath("//div//a[contains(text(), 'Log In')]").click();
	    Thread.sleep(1000);
		driver.findElement(By.id("si_popup_email")).sendKeys("vijay.byrappa@gmail.com"); //Username through the id
		driver.findElement(By.id("si_popup_passwd")).sendKeys("P@ssword123"); //Password through the id
		driver.findElementByXPath("//div//button[contains(text(), 'Login')]").click();
		
		Thread.sleep(3000); 
	
		//Enter the Course to Search
		WebElement hsearch = driver.findElement(By.xpath("//input[contains(@class, 'dropdown-toggle search_input')]"));
		hsearch.sendKeys("Selenium Certification Training");
		Thread.sleep(2000);
		hsearch.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		//		Compare the Title
		
		String expectedTitle1 = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String actualTitle1 = driver.getTitle();
				
		System.out.println("Edurekla Home Page Title is displayig as : " + actualTitle1);
		
		if (expectedTitle1.equals(actualTitle1))
		{
			System.out.println("Title is matching and is verified");
		}
		else
		{
			System.out.println("Title is not matching and it failed the verification : ");
		} 
	
		Thread.sleep(3000);
		//Logout was selected
		//driver.findElementByXPath("(//header//section//span[contains(@class, 'webinar-profile-name')])[1]").click();
		driver.findElement(By.cssSelector("#footauto > app-root > app-mycourse-main > section > app-header > header > nav > div > div.pull-right.url_list > ul > li.dropdown.user_drop > div > button > img")).click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Log Out").click();
		Thread.sleep(4000);
		
		driver.close(); 
		}
}
