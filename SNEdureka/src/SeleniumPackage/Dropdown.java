package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //Browser is Maximizing
		driver.get("https://www.facebook.com/"); //Edureka login page is opening
		
		WebElement monthDropDown = driver.findElementById("month");
		Select select = new Select(monthDropDown);
		//select.selectByVisibleText("Mar");
		//select.selectByValue("9");
		//select.selectByIndex(10);
		
		List<WebElement> months = select.getOptions();
		
		for(WebElement t :  months){
			System.out.println(t.getText());
		}
		
		System.out.println("Is the Month September is present : " + months.contains("September"));
	}

}
