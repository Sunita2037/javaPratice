package Seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver","\"C:\\Users\\sudik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sudik/Desktop/html/Session2/idex.html");

		// Locator By id

		WebElement p1 = driver.findElement(By.id("One"));
		if (p1.getText().contains("Para")) {
			System.out.println("Test case pass 1");
		}
		
		WebElement p2 = driver.findElement(By.className("Two"));
		if (p2.getText().contains("Para")) {
			System.out.println("Test case pass 2");
		}
		
		// By name

		WebElement p3 = driver.findElement(By.name("nm"));
		if (p3.isDisplayed()) {
			System.out.println("Test case pass 3");
		}
		// linkText
		
		WebElement p4 = driver.findElement(By.linkText("Facebook"));
		if(p4.isDisplayed()) {
			System.out.println("Test case pass 4");
		}
		
		// Partial linkText
		
		WebElement p5 = driver.findElement(By.partialLinkText("book"));
		if(p5.isDisplayed()) {
			System.out.println("Test case pass 5");
		}
		
		// By Tag name
		
		WebElement p6 = driver.findElement(By.tagName("h1"));
		if(p6.isDisplayed()) {
			System.out.println("Test case pass 6");

	}
		// by xpath
		
		WebElement p7 = driver.findElement(By.xpath("/html/body/h1"));
		if(p7.isDisplayed()) {
			System.out.println("Test case pass 7");

	}
		// by css
		
		WebElement p8 = driver.findElement(By.cssSelector("p[id = 'One']"));
		if(p8.isDisplayed()) {
			System.out.println("Test case pass 8");

	}
		driver.close();
		
	}
}
