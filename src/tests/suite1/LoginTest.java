package tests.suite1;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import tests.TestBase;
import util.TestUtil;

public class LoginTest extends TestBase{
	//Initialize application	
	@Before
	public void beforeTest() throws IOException{
		initialize();
	}
	
	//testing login feature
	@Test
	public void loginTest() throws InterruptedException
	{
		//selenium code
		driver.get(CONFIG.getProperty("testSiteName"));
		// login
		TestUtil.doLogin("mswathi.ms@gmail.com", "welcom@123");
		//later on we can pass reading valued from excel sheet
		if(!isLoggedIn){
			//report error
			System.out.println("invlaid user name and password");
		}
	
	}
	

}
