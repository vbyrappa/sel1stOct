package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdurekaTagNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/"); //Edureka login page is opening
		driver.manage().window().maximize(); //Browser is Maximizing
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Wait Statement		
		
		List<WebElement> links = driver.findElementsByTagName("a");
		
		//String[] links = new String[links.]
		
		System.out.println(links.size());
		
		for (int i = 1; i<=links.size(); i=i+1)
		 {
		 System.out.println(links.get(i).getText());
		 
		 }
		
	}

}
