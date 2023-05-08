package test.com;

import org.testng.annotations.Test;

public class testr5 {
@Test(priority = 2)
public void alpha() {
	System.out.println("alpha executed");
}
@Test(priority = 1)
public void beta() {
	System.out.println("beta executed");
}
@Test(priority = 0)
public void ca() {
	System.out.println("ca executed");
}
@Test(priority = -1)
public void da() {
	System.out.println("da executed");
}
}
