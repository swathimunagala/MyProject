package util;

import org.openqa.selenium.By;

import tests.TestBase;

public class TestUtil extends TestBase{
	public static void doLogin(String username, String password) throws InterruptedException{
		if(isLoggedIn){//if user is already logged in simply return
			//return;
			logout();
		}
		//call getObject method
		//if we use get object method to get xpath we no need to write try catch and try catch for 
		//every line of code, insted of we can write that in testbase class once
		
		/*getObject("//*[@id='wrapperAll']/div[1]/div[2]/div/div/a[1]").click();
		getObject("html/body/div[1]/div/form/div[1]/input").sendKeys(username);
		getObject("html/body/div[1]/div/form/div[2]/input").sendKeys(password);*/
		////this xpth have to be read form OR.properties file
		//this helps to buold roboust framework, we no need to depend 
		/*getObject(OR.getProperty("signin_link")).click();
		getObject(OR.getProperty("Email")).sendKeys(username);
		getObject(OR.getProperty("password_input")).sendKeys(username);*/
		//to aviod writing OR.properties again and again
		
		getObject("signin_link").click();
		getObject("username_signin_input").sendKeys(username);
		getObject("password_input").sendKeys(password);
		getObject("signin_button").click();
		//we just have to send the key value and this function will get the respective value from OR file
		//we will write input_button at the end of the xpath key so other will understand
		
		//we need to validate whether usered name is displaying after login or not
		Thread.sleep(5000L);
		try{
			String displayedUserName=getObject("username_top_link").getText();
			if(displayedUserName.equals(username)){
				isLoggedIn=true;
				
			}else{
				isLoggedIn = false;
			}
		}catch(Throwable t){
			isLoggedIn=false;
		}
		//how we report error if the user login file
		//i dont want to report error if my login files
		//if the user is not logged in we have to go and click on sign in button
		
		//get the sign in button xpath
		driver.findElement(By.xpath("//*[@id='wrapperAll']/div[1]/div[2]/div/div/a[1]")).click();
		//if i am not going to find sign in link report me an error
		//so use try catch block around this if condition
		driver.findElement(By.xpath("html/body/div[1]/div/form/div[1]/input")).sendKeys(username);
		//instead of out try catch block around everyline of code
		//i create new function called getObject
	}
	public static void logout(){
		if(isLoggedIn){
			getObject("signOUt_link").click();
		}
	}
}
