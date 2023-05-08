package Seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumalert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//ALERT//
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//	    driver.findElement(By.id("button1")).click();
//	    driver.switchTo().alert().accept();
//	  
//	    Thread. sleep (5000);
	    
	    // COMFIRM//
//	    
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
	    driver.findElement(By.id("button4")).click();
	    driver.switchTo().alert().accept();
		String textaccept = driver.findElement(By.id("confirm-alert-text")).getText();
		System.out.println(textaccept);
	}
}
