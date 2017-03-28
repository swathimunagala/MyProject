package tests.suite1;

import org.junit.After;
/*
 * you can also generate html reports using junit and Ant
 * @Ignore means ignore this test/method
 * create a new class classed secondTestCase and run as Junit test only this class is executed in the report
 * If i want to run the first test case and secondTestCase tests followed by i need
 * to create new third class called "MyTestSuiteRunner.java" 
 * give two annotations: @Runwith(it takes the class name called (suite.class)
 * and specify the class names which you want to run.it is a case sensitive 
 * like: @s
 */
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase {
	@Before
	public void printOpenBrowser(){
		System.out.println("Open browser");
	}
	@Test
	//add Test word to the method name to run it in order and it is 
	//also as a naming convention 
	public void printNumebrsTest(){
		System.out.println("Printing NUMBER");	
	}
	@Test	
	public void addNumberTest(){
		System.out.println("Adding  NUMBER");	
	}
	@Ignore
	public void printCharTest(){
		System.out.println("Printing CHAR");
	}
	@After 
	public void closeBrowser(){
		System.out.println("Closing browser");
	}
}
