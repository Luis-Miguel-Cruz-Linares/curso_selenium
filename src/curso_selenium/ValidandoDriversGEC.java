package curso_selenium;

import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 


public class ValidandoDriversGEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Validando Chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luis Miguel\\eclipse-workspace\\drivers\\chromedriver\\chromedriver.exe");
			WebDriver driver_chrome = new ChromeDriver();
			driver_chrome.get("https://www.google.com");
			
		// Validando geckodrive
		//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Luis Miguel\\eclipse-workspace\\drivers\\geckodriver\\geckodriver.exe");
		//	WebDriver driver_firefox = new FirefoxDriver();
		//	driver_firefox.get("https://www.google.com");
			
		// Validando edgedriver
		//	System.setProperty("webdriver.edge.driver", "C:\\Users\\Luis Miguel\\eclipse-workspace\\drivers\\edgedriver\\msedgedriver.exe");
		//	WebDriver driver_edge = new EdgeDriver();
		//	driver_edge.get("https://www.google.com");
			
			
	}

}
