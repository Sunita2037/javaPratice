package test.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testr3 {
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("This will run Before every method");	
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This will run after every method");	
		}
	@Test(priority = 2)
	public void loginTest2() {
		System.out.println("login successful two");
	}
	@Test(priority = 1)
	public void loginTest1() {
		System.out.println("login successful one");
	}
}
