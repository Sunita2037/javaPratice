package Seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpr3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//ERROR MESSAGE  //
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type= 'submit']"));
//		username.sendKeys("Admin");
//		password.sendKeys("admin123");
//		loginButton.click();
		
		
//		Thread.sleep(5000);
//		WebElement logo = driver.findElement(By.cssSelector("img[alt='company-branding']"));
//		boolean logoDisplayed = logo.isDisplayed();
//		if(logoDisplayed) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//			
//		}
		//driver.close();
		
	
	username.sendKeys("A");
	password.sendKeys("adm123");
	loginButton.click();
	
	
	Thread.sleep(5000);
	
	WebElement errorMsg = driver.findElement(By.cssSelector("i[ class=\"oxd-icon bi-exclamation-circle oxd-alert-content-icon\"]"));
	boolean error = errorMsg.isDisplayed();
	if(error) {
	System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	driver.close();
	}
	}


