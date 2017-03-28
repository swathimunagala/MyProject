package tests.suite1;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class UnderstandingAssertions {
	//ErrorCollector is an inbuild method in JAVA
	@Rule
	public ErrorCollector errorCollector = new ErrorCollector();

@Test
public void testFriendslistFB(){
	int actual_total_friends = 100;//comes form selenium
	int expected_total_friends = 101; //comes form xlsx
	/*if(actual_total_friends ==  expected_total_friends)
	{
		System.out.println("Pass");		
	}
	else
	{
		System.out.println("Fail");serte
		//report the errors
	}*/
	//If the if else statement is failing but it is not reporting in Jnuit reports
	//that is why we use assertions
	//Assert is an inbuild method in the Junit library
	//assertEquals is the static function inside the Assert method
	//there is a draw back with this assertion 
	//advantage is we are able to report the error in Junit reports
	System.out.println("A");
	try{
		Assert.assertEquals(actual_total_friends, expected_total_friends);
		System.out.println("assertion is commented");
	}	
	catch(Throwable t)
	{
		System.out.println("ERROR ENCOUNTERED");
		//but the disadvantage is it wont report error in junit reprots
		//write a java code to report an error
		// we can use error collector class 
		errorCollector.addError(t);
	}
	
	System.out.println("B");
	//Result: A line will execute and assertion fails then the rest of the code won't execute
	//put a try catch block around this
	
	//again i can use this assert method for other test and round them with try catch
	//if two assers are failed those two will be reported in junit using this error collector
	//try - catch block & error collector // assertions //annotations // 
}
}
