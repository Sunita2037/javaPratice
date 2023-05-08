package Seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniump2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sudik/Desktop/html/Session2/indexa.html");

		driver.manage().window().minimize();
		
		WebElement p1 = driver.findElement(By.id("one"));
		if(p1.getText().contains("Ram")) {
			System.out.println("Test case Pass 1");
		}
		else {
			System.out.println("Test case fail 1");
		}
		WebElement P2 = driver.findElement(By.className("two"));
		if(P2.getText().contains("Sita")) {
			System.out.println("Test case Pass 2");
		}
		else {
			System.out.println("Test case fail 2");
		}
		WebElement P3 = driver.findElement(By.name("Selenium"));
		if(P3.getText().contains("Practicing JavaScript")) {
			System.out.println("Test case Pass 3");
		}
		else {
			System.out.println("Test case fail 3");
		}
		WebElement P4 = driver.findElement(By.linkText("twitter"));
		if(P4.isDisplayed()) {
		System.out.println("Test case Pass 4");
	}
	else{
		System.out.println("Test case fail 4");
	}
		WebElement P5 = driver.findElement(By.partialLinkText("twi"));
		if(P5.isDisplayed()) {
			System.out.println("Test case Pass 5");	
		}
		else{
			System.out.println("Test case fail 5");
		}
		WebElement P6 = driver.findElement(By.cssSelector("p[id='one']"));
		if(P6.isDisplayed()) {
			System.out.println("Test case Pass 6");	
		}
		else{
			System.out.println("Test case fail 6");
		}
		WebElement P7 = driver.findElement(By.xpath("html/body/h1"));
		if(P7.isDisplayed()) {
			System.out.println("Test case Pass 7");	
		}
		else{
			System.out.println("Test case fail 7");
		}
		WebElement P8 = driver.findElement(By.tagName("h1"));
		
		if(P8.isDisplayed()) {
			System.out.println("Test case Pass 8");	
		}
		else{
			System.out.println("Test case fail 8");
		}
		driver.close();
	}
}
