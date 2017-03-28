package tests.suite1;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.TestBase;

public class RegistrationTest extends TestBase{
	@Before
	public void beforeTest() throws IOException{
		initialize();
	}
	@Test
	public void registerTest(){
		driver.get(CONFIG.getProperty("testSiteURL"));
		getObject("registerLink").click();
		getObject("register_name_input").sendKeys("samplename");
		getObject("register_id_input").sendKeys("sampleusr");
		//like this we have to write a code for all the fields in the 
		//register page
		//this is the place where you come across buttons, readio button, check box
		//dropbox and text boxes
		//after register we need to validate the text appers in welcome page for validation purpose
		getObject("registration_button").click();
		WebElement thankYouText = driver.findElement(By.xpath(OR.getProperty("registraion-success_text")));
		WebElement thankYouText1 =getObject("registration_success_text");
		if(thankYouText!=null){
			//report error if test data was positive
			System.out.println("ERROR");
			//proceed further
		}
		
	}

}
