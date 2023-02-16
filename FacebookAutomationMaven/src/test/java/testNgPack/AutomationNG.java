package testNgPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationNG {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - AutomationNG");
	}
	
	@BeforeTest
	public void beforeTest () {
		System.out.println("Before Test - AutomationNG");
	}
	
	@BeforeClass
	public void beforeClass () {
		System.out.println("Before Class - AutomationNG");
	}
	
	@BeforeMethod
	public void beforeMethod () {
		System.out.println("Before Method - AutomationNG");
	}
	@Test
	public void testA () {
		System.out.println("Test-A - AutomationNG");
	}
	
	@Test
	public void testB () {
		System.out.println("Test-B - AutomationNG");
	}
	
	@Test
	public void testC () {
		System.out.println("Test-C - AutomationNG");
	}
	
	@Test
	public void testD () {
		System.out.println("Test-D - AutomationNG");
	}
	
	@Test
	public void test1 () {
		System.out.println("Test-1 - Automation2");
	}
	
	@Test
	public void test2 () {
		System.out.println("Test-2 - Automation2");
	}
	
	@Test
	public void test3 () {
		System.out.println("Test-3 - Automation2");
	}
	
	@Test
	public void test4 () {
		System.out.println("Test-4 - Automation2");
	}
	
	
	@AfterMethod
	public void afterMethod () {
		System.out.println("After Method - AutomationNG");
	}
	
	@AfterClass
	public void afterClass () {
		System.out.println("After Class- AutomationNG");
	}
	
	@AfterTest
	public void afterTest () {
		System.out.println("After Test - AutomationNG");
	}
	
	@AfterSuite
	public void afterSuite () {
		System.out.println("After Suite - AutomationNG");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
