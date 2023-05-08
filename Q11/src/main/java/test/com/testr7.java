package test.com;

import org.testng.annotations.Test;

public class testr7 {

	@Test(groups = ("login"))
	public void testcase1() {
		System.out.println("Test case 1");
	}

	@Test(groups = ("logout"))
	public void testcase2() {
		System.out.println("Test case 2");
	}

	@Test(groups = ("portfolio"))
	public void testcase3() {
		System.out.println("Test case 3");
	}

	@Test(groups = ("login"))
	public void testcase4() {
		System.out.println("Test case 4");
	}

	@Test(groups = ("logout"))
	public void testcase5() {
		System.out.println("Test case 5");
	}

	@Test(groups = ("portfolio"))
	public void testcase6() {
		System.out.println("Test case 6");
	}
}
