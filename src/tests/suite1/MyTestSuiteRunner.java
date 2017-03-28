package tests.suite1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//Running classes as a test suite using @Runwith and @SuiteClasses annotation

@RunWith(Suite.class)
@SuiteClasses({
	RegistrationTest.class, //adding this test class in the beginning of the test suite which is 
	//having assertion method inside this class
	LoginTest.class, 
	PasswordChangeTest.class,
	PostAddTest.class
	//you can keep add as many classes you have run as a suite or batch
	})
public class MyTestSuiteRunner {

}
