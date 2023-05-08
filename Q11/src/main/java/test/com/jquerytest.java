package test.com;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jquerytest {
	ChromeDriver driver;

	@Test
	public void verifyTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Droppable | jQuery UI");
		driver.quit();
}
	
		// Verify current Url
//		  @Test
//		  public void urlTest() {
//		    String expectedUrl = "https://jqueryui.com/droppable/";
//		    String actualUrl = driver.getCurrentUrl();
//		    Assert.assertEquals(expectedUrl, actualUrl);
//		  }
		  @Test
		  public void draganddrop() {
			 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://jqueryui.com/droppable/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
				WebElement sourceElement = driver.findElement(By.cssSelector("div[id='draggable']"));
				WebElement targetElement = driver.findElement(By.cssSelector("div[id='droppable']"));
				String expectedText = "dropped!";
				String actualText = targetElement.getText();
				Assert.assertEquals(actualText,expectedText);
		  }
	
		
	}
