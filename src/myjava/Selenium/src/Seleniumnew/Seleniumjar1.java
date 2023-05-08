package Seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumjar1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

// java project, add the class with main

		// "C:\Users\sudik\Downloads\selenium-server-4.8.2 (1).jar"

		// https://www.selenium.dev/downloads/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
        Thread.sleep(5000);
        
        // Test case One
		
        // Action
        
       

        
		WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type= 'submit']"));
		
		// valid credentials
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
		
		Thread.sleep(5000);
		
		WebElement logo = driver.findElement(By.cssSelector("img[alt= 'client brand banner']"));
		
		
		
//		// Assertion(expected result)
//		
		boolean logoDisplayed = logo.isDisplayed();
		
		if(logoDisplayed) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver.close();
//		
//        // WebElement methods we used are
//		// sendkeys
//		// click
//		//displayed
//		
//		// Test case Two
//		
		// Action 
		
//		username.sendKeys("admin");
//		password.sendKeys("admin1234");
//		loginButton.click();
//		
//		// Assertion
//        Thread.sleep(5000);
//		WebElement errorMsg = driver.findElement(By.cssSelector("i[ class=\"oxd-icon bi-exclamation-circle oxd-alert-content-icon\"]"));
//		boolean error = errorMsg.isDisplayed();
//		if(error) {
//			System.out.println("Test case pass");
//			}
//		else {
//			System.out.println("Test case fail");
//		}
//		driver.close();
		
		
	}

}
