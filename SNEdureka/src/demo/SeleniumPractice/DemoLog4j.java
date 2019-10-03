package demo.SeleniumPractice;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLog4j {
	static WebDriver driver;
	static Logger logger = Logger
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("si_popup_email")).sendKeys("vijay.byrappa@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("P@ssword123");
		driver.findElement(By.xpath("(//*[@id=\"new_sign_up_mode\"]//button[contains(@class,'clik_btn_log btn-block')])[3]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"footauto\"]//img[contains(@class,'user_image')]")).click();
		driver.findElement(By.linkText("My Profile")).click();
	}

}
