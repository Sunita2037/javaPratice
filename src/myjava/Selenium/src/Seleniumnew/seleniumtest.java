package Seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();

		// Thread.sleep(5000);

		WebElement firstname = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
		WebElement lastname = driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
		WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		WebElement comments = driver.findElement(By.cssSelector("textarea[placeholder=\"Comments\"]"));

		WebElement submit = driver.findElement(By.cssSelector("input[type=\"submit\"]"));

//		Thread.sleep(5000);
//
//		firstname.sendKeys("Sunita");
//		lastname.sendKeys("Dhungel");
//		email.sendKeys("sunita.dhungel@yahoo.com");
//		comments.sendKeys("hello sir");
//		submit.click();
//
//		Thread.sleep(2000);
//
//		WebElement submitPage = driver.findElement(By.cssSelector("div[id=\"contact_reply\"]"));
//
//		if (submitPage.isDisplayed()) {
//			System.out.println("Testcase is pass 1");
//		} else {
//			System.out.println("Test case is fail 1");
//
//		}
		
		// 2nd Test case
		
		firstname.sendKeys("sunita");
		lastname.sendKeys("dhungel");
		email.sendKeys("");
		comments.sendKeys("hi");
		submit.click();
		
		Thread.sleep(2000);
		
		WebElement error = driver.findElement(By.cssSelector("body"));
		boolean err = error.isDisplayed();
		if(err) {
			System.out.println("Testcase is pass 2");
		}
		else {
			System.out.println("Test case is fail 2");

		}
		driver.close();

	}

}
