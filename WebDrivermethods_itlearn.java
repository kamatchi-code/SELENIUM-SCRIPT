package ecommerce;
//Program chk all the webdriver methods are working
//program opens the URL
//get the title for URL
//get name of current url
// get size,position for url
// navigate to login page
// navigate to get started page
//Refresh the page and the chk for navigate methods
//get page source
//Delete the cookies
//close the browser

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivermethods_itlearn {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.itlearn360.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		driver.navigate().to("https://www.itlearn360.com/wp-login.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("https://www.itlearn360.com/get-started/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.getPageSource();
		driver.manage().deleteAllCookies();
		driver.quit();
			
		
	}
	

	
		
	}

