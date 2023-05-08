package Seleniumnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome driver","\"C:\\Users\\sudik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// why we required wait 
		// client -- request --- server and create element from reponse
		// If response is delayed elements are not created
		// So we have wait for element to be created 
		
		
		// 1) Implicit wait - dynamic in nature
		// 2) Explicit wait - dynamic in nature
		// 3) Thread.sleep() - static in nature
		// 4) Fluent wait() - dynamic in nature
		
		
		// Static 
		// Thread.sleep(5000) --- 3
		
		
		// Dynamic  - 5 seconds
		// Element in 3 second ---- continue execution
		
		
		// Implicit
	
		
		
		// e1 - 20
		
		// e2 - 3
		
		// e3 -4

		
		// e4- 2
		
		// e5 -5
		
		// e6 - 3
		
		// Explicit wait ----  on one particular element 
		
		WebElement e = driver.findElement(By.id("contact-us"));
		WebDriverWait  waitE = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebDriverWait  waitF = new WebDriverWait(driver,Duration.ofSeconds(3));
		
		waitE.until(ExpectedConditions.visibilityOf(e));
		waitE.until(ExpectedConditions.elementToBeClickable(e));
		
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()
		
	}

}
