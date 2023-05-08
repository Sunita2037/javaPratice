package Seleniumnew;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream("C:\\Users\\sudik\\eclipse-workspace\\Selenium\\src\\Seleniumnew\\Test.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		
		if(browser == "chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get(prop.getProperty("baseurl"));
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudik\\Downloads\\Browsers\\chromedriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
		}
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\sudik\\eclipse-workspace\\Selenium\\src\\Seleniumnew");

	}

}
