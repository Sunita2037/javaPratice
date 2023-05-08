package test.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; //FAILED TESTCASE////NOT GOOD//
import org.testng.annotations.Test;

public class testsausedemo {
	ChromeDriver driver;

	@Test
	public void testcase1() {
		System.out.println("login");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins-*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		List<WebElement> itemNumber = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		System.out.println(itemNumber.size());
		driver.quit();
		
	}
}
