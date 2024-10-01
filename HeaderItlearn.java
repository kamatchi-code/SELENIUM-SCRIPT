package ecommerce;

//Program will chk the Header Features are working
//launch browser
//sign in with valid credentials
//Chk the See courses
//Go back to Itlearn360 logo
//Chk all the Headers
//Logout from the page
//close the Browser

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderItlearn {
	
	public static void main(String[] args) throws InterruptedException {
		//configure browser
		WebDriver driver =new ChromeDriver();
		
		//launch url
		driver.get("https://www.itlearn360.com");
		WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
		sign.click();
		driver.manage().window().fullscreen();
		WebElement element = driver.findElement(By.id("user_login"));
		element.sendKeys("KAMATCHI11");
		WebElement element2 = driver.findElement(By.id("user_pass"));
		element2.sendKeys("KAMATCHI456$");
		String a1 = element2.getAttribute("name");
		System.out.println(a1);
		String pass = element2.getAttribute("value");
		System.out.println(pass);
		WebElement element3 = driver.findElement(By.name("wp-submit"));
		element3.click();
		driver.manage().window().maximize();
		
		//see courses
		Thread.sleep(2000);
		 WebElement element4 = driver.findElement(By.className("xpro-button-text"));
		element4.click();
		driver.manage().window().fullscreen();
		
		//back to logo
		Thread.sleep(2000);
	    WebElement element5 = driver.findElement(By.xpath("//img[@fetchpriority='high']"));
	    element5.click();
		driver.manage().window().fullscreen();

		//JavascriptExecutor js=(JavascriptExecutor)driver;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,0)");
		Thread.sleep(2000);
		
		//Headers

		WebElement Blg = driver.findElement(By.xpath("//span[text()='Blog']"));
		Blg.click();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		WebElement Cntus = driver.findElement(By.xpath("//span[text()='Contact US']"));
		Cntus.click();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		WebElement DB = driver.findElement(By.xpath("//span[text()='My Dashboard']"));
		DB.click();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		 WebElement element10 = driver.findElement(By.xpath("//span[text()='Logout']"));
	     element10.click();
	     driver.manage().window().maximize();
	     driver.quit();
		
		
		
	}


}
