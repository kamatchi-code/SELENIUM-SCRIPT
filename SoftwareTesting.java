package ecommerce;

//Program runs to chk modules of Mastering Selenium WebDriver with Java in Software testing academy
//sign in
//All courses
//chk modules of Mastering Selenium WebDriver with Java in Software testing academy
//Chk for overview,curriculum,instructor led page
//Logout
//close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SoftwareTesting {

	public static void main(String[] args) throws InterruptedException {
		//configure browser
		WebDriver driver =new ChromeDriver();//sign in//span[contains(text(),'sign in?')]
		
		//launch url
		driver.get("https://www.itlearn360.com");
		driver.manage().window().maximize();
		
		
		//user sign in
		WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
		sign.click();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
	
		WebElement element = driver.findElement(By.id("user_login"));
		element.sendKeys("KAMATCHI11");
		WebElement element2 = driver.findElement(By.id("user_pass"));
		element2.sendKeys("KAMATCHI456$");
		WebElement element3 = driver.findElement(By.name("wp-submit"));
		element3.click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//All courses
		Thread.sleep(3000);
		WebElement element4 = driver.findElement(By.xpath("//a[@class='cd-dropdown-trigger desktop-navigation btn btn-primary']"));
		element4.click();
		
		//perform full link test for Software Testing Academy
		
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Software Testing Academy']"));
		Thread.sleep(2000);
		Actions acc = new Actions(driver);
		acc.moveToElement(element1).perform();		
		Thread.sleep(2000);
		
		
		WebElement element1a = driver.findElement(By.xpath("//span[text()='Mastering Selenium WebDriver with Java']"));
		element1a.click();
		
		//Scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		WebElement element7a1 = driver.findElement(By.xpath("//a[text()='Overview']"));
		element7a1.click();
		Thread.sleep(2000);
		
		WebElement element7a2 = driver.findElement(By.xpath("//a[text()='Curriculum']"));
		element7a2.click();
		Thread.sleep(2000);
		
		WebElement element7a3 = driver.findElement(By.xpath("//a[text()='Instructor led classes']"));
		element7a3.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
//		//All courses
		Thread.sleep(3000);
		WebElement element41 = driver.findElement(By.xpath("//a[@class='cd-dropdown-trigger desktop-navigation btn btn-primary']"));
		element41.click();
		
		driver.quit();
	}
	}
		
		
		
		
		
