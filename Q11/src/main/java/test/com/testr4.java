package test.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testr4 {
	@Test
	public static void login() {
		System.out.println("login successful");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method will run Before");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method will run after");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest method will run before");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest method will run after");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class method will run Before");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class method will run after");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite method will run before");
	}

	@BeforeSuite
	public void afterSuite() {
		System.out.println("aftersuite method will run after");
	}
}