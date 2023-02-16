package testNgPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {

	
	//"priority" keyword is used to maintain / control the execution sequence of the test method
	
	@Test 
	public void test1() {
		System.out.println("Test-1");
		
	}
	
	
	@Test 
	public void test2() {
		System.out.println("Test-2");
	}

	
	@Test (timeOut = 3000)
	public void test3 () {
		System.out.println("Test-3");
	}
	
	
	
	@Test (priority =1)
	public void test4() {
		System.out.println("Test-4");
	}
	
	
	
	
	
	
	
	
	
	
	
}
