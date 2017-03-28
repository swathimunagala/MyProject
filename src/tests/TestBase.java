package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class TestBase {
	
	//global variable declaration
	//initializing the property file 
	public static Properties CONFIG =null;
	public static Properties OR =null;
	public static WebDriver dr =null;
	public static EventFiringWebDriver driver =null;
	public static boolean isLoggedIn=false;//this will tell wheter user logged in application or not
	
	
	public void initialize() throws IOException{
		if(driver ==null){//we no need to initialize this method in every class
			//Initialize the config file
			CONFIG = new Properties();
			FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+ "//src//config//config.properties");
			CONFIG.load(fn);
			//OR Properties
			fn = new FileInputStream(System.getProperty("user.dir")+ "//src//config//OR.properties");
			//Initialize the webdriver and EvenFiring WebDriver
			if(CONFIG.getProperty("browser").equals("Firefox"))
			{
				dr = new FirefoxDriver();
			}else if(CONFIG.getProperty("browser").equals("IE")){
				System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Selenium_Pack\\Webdrivers\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
				dr = new InternetExplorerDriver();
			}
			//with the help of eventfiringwebdriver function liserners and mouse move over methods 
			driver = new EventFiringWebDriver(dr);
			//wait till the next page to load completely
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			}
	}
	//1. Test Login Functionality
	//this fuction will except the xpath and it returns the webelement
	public static WebElement getObject(String xpathKey){
		try{
			return driver.findElement(By.xpath(OR.getProperty(xpathKey)));
		}catch(Throwable t){
			return null;//we can write hear if we wont find object in page
		}		
	}
}


