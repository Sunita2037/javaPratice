package Seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://parabank.parasoft.com/parabank/index.htm")) {
			System.out.println("test pass");
			
		}
		else {
			System.out.println("test fail");
		}
		WebElement logo = driver.findElement(By.cssSelector("img[alt='ParaBank']"));
		
		boolean logoDisplayed = logo.isDisplayed();
	
		if(logoDisplayed) {
		System.out.println("Test case pass");
	}		
		else {
			System.out.println("Test case fail");
	}
		WebElement id = driver.findElement(By.xpath("//*[@id=\"headerPanel\"]"));
		if(id.isDisplayed()) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		WebElement lt = driver.findElement(By.linkText("Admin Page"));
		if(lt.isDisplayed()) {
			
				System.out.println("test case pass");
			}
			else {
				System.out.println("test case fail");
			}
		WebElement plt = driver.findElement(By.partialLinkText("Page"));
		if(plt.isDisplayed()) {

			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		}
	}


