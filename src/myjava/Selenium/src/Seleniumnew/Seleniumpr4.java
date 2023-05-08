package Seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement greenelement = driver.findElement(By.cssSelector("input[value='green']"));
		WebElement blueelement= driver.findElement(By.cssSelector("input[value='blue']"));
		WebElement yellowelement=driver.findElement(By.cssSelector("input[value='yellow']"));
		WebElement orangeelement=driver.findElement(By.cssSelector("input[value='orange']"));
		WebElement purpleelement=driver.findElement(By.cssSelector("input[value='purple']"));
		
		greenelement.click();
		if(greenelement.isSelected()) {
			System.out.println("Test case pass");
			if(! blueelement.isSelected()) {
				System.out.println("Test case 2 pass");
			}
			else {
				System.out.println("Test case fail");
			}
		}
	 
		blueelement.click();
		if(blueelement.isSelected()) {
			System.out.println("blueelement click Test case pass");
			if(! yellowelement.isSelected()) {
				System.out.println("Test case 3 pass");
			}
			else {
				System.out.println("Test case 3 fail");
			}
			yellowelement.click();
			if(yellowelement.isSelected()) {
				System.out.println("yellowelement click Test case pass");
				if(! orangeelement.isSelected()) {
					System.out.println("Test case 4 pass");
				}
				else {
					System.out.println("Test case 4 fail");
				}
				orangeelement.click();
				if(orangeelement.isSelected()) {
					System.out.println(" orangeelement click Test case pass");
					if(! purpleelement.isSelected()) {
						System.out.println("Test case 5 pass");
					}
					else {
						System.out.println("Test case 5 fail");
				
		}
					purpleelement.click();
					

					
					if(purpleelement.isSelected()) {
						System.out.println(" purpleelement click Test case pass");
						if(! purpleelement.isSelected()) {
							System.out.println("Test case 6 pass");
						}
						else {
							System.out.println("Test case 6 fail");
						}
			}
				}
			}
	}
	}
}
