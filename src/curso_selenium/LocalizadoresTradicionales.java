package curso_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

public class LocalizadoresTradicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Luis Miguel\\eclipse-workspace\\drivers\\edgedriver\\msedgedriver.exe");
			WebDriver driver_edge = new EdgeDriver();
			driver_edge.get("https://www.google.com");  // abre la pagina requerida
			driver_edge.findElement(By.id("APjFqb"));	// encontrando elemento por id
			driver_edge.findElement(By.className("gNO89b"));	// encontrar elemento por classname
			driver_edge.findElement(By.name("btnI"));			// encontrar elemento por name
			driver_edge.findElement(By.linkText("Sobre Google"));			// encontrar elemento por linktext
			driver_edge.findElement(By.partialLinkText("Sobre"));			// encontrar elemento por parcial linktext
			driver_edge.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/a[3]"));			// encontrar elemento por textpath completo
			
			driver_edge.quit();		//cierra el navegador y la sesión
			
			
	}

}
