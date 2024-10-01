package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Differentbrowser {
	public static void main(String[] args) throws InterruptedException {
		//interface                  //browser
		WebDriver driver = new ChromeDriver();
		//launch url
		driver.get("https://www.itlearn360.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.close();
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.itlearn360.com/contact-us/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
		
	
	}

	
	}
	
	
	
	
	
	
	


