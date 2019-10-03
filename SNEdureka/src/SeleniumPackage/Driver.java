package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	}
}
