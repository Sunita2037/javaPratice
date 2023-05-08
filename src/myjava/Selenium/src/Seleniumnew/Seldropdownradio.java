package Seleniumnew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seldropdownradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		
		// radio button 
//		
//			WebElement e = driver.findElement(By.cssSelector("input[value='green']"));
//			WebElement e2 = driver.findElement(By.cssSelector("input[value='blue']"));
//			e.click();
//			if(e.isSelected() && !(e2.isSelected())) {
//				System.out.println("Testcase pass");
//			}
//			
//			List<WebElement> rr = driver.findElements(By.cssSelector("input[name='color']"));
//			for(int i = 0 ; i < rr.size() ; i++) {
//					rr.get(i).click();
//					if(rr.get(i).isSelected()) {
//						System.out.println("Testcase pass");
//					}
//			}
//			driver.quit();
			
			
		
		// check box 
		
//		List<WebElement> cc = driver.findElements(By.cssSelector("input[type='checkbox']"));
//		for(int i = 0 ; i < cc.size() ; i++) {
//			if(i != 2) {
//				cc.get(i).click();
//				if(cc.get(i).isSelected()) {
//					System.out.println("Testcase pass");
//				}
//			}
//		
//		}
//		for(int i = 0 ; i < cc.size() ; i++) {
//			if(i != 2) {
//				cc.get(i).click();
//				if(! cc.get(i).isSelected()) {
//					System.out.println("Testcase pass");
//				}
//			}
//			
//		}

		
		// dropdown 
		// Select 
		
		WebElement e = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		//WebElement ee = driver.findElement(By.cssSelector("#dropdowm-menu-2"));
		Select ss = new Select(e);
				// ss.selectByValue("python");
		 //ss.selectByVisibleText("Python");
		

//		Select dd = new Select(ee);
//		 dd.selectByVisibleText("Eclipse");
		//ss.selectByIndex(2);
		
		ss.selectByIndex(3);
//		if(driver.findElement(By.cssSelector("option[value='python']")).isSelected()) {
//			System.out.println(" Test case pass");
//		}
		if(driver.findElement(By.cssSelector("option[value='sql']")).isSelected()) {
			System.out.println("sql is selected");
		}
		
		
//		if(driver.findElement(By.cssSelector("option[value='eclipse']")).isSelected()) {
//			System.out.println("Eclipse is selected");
//		}
		//driver.quit();
		
		
		
		
		
		
		
		
		
		// enabled not enabled isSelected

	}

}
