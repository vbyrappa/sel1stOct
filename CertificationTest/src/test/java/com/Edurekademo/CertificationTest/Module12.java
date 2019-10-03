package com.Edurekademo.CertificationTest;

	import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

	public class Module12 {
		
		//static PhantomJSDriver driver;
		static WebDriver driver;
		static Logger logger = LogManager.getLogger(Module12.class);
		
		public static void main(String[] args) throws IOException {
			logger.info("Define the Path of the phantomjs");
			File file = new File("C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe");
			logger.info("Set the System Property of the Phantomjs");
	        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
	        logger.info("Initialize the Phantomjs Driver");
	        WebDriver driver = new PhantomJSDriver();	
	        logger.info("Open the Application Browser");
	        driver.get("http://www.google.com"); 
	        logger.info("Element of the Google Search");
	        WebElement element = driver.findElement(By.name("q"));
	        logger.info("Enter Edureka to Search");
	        element.sendKeys("edureka");
	        logger.info("Click on the Search of Google Button");
	        element.submit();
	        logger.info("Page Title Expected");
	        String expectedTitle = "edureka - Google Search";
	        logger.info("Actual Page Title");
	        String actualTitle= driver.getTitle();
	        logger.info("COmpare the Actual and Expected and Display the result if it is matching");
	        if(expectedTitle.equals(actualTitle)){
	        	System.out.println("Actual Edureka Title is matching : ");
	        }
	        else{
	        	System.out.println("Actual Edureka Title is not matching : ");
	        }
	        logger.info("Take the Screenshot");
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        logger.info("Output the Format of the Captured file");
	        File source=ts.getScreenshotAs(OutputType.FILE);   
	        logger.info("Path of the Captured file");
	        FileHandler.copy(source,new File("D:\\Selenium\\Edureka.JPG"));

	        logger.info("Display the Output of the file");
	        System.out.println("Page title is : " + driver.getTitle());
	        logger.info("Close the Application Browser");
	        driver.close();			
		}	
	}