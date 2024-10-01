package ecommerce;
// This program Test all the courses are integrated and navigate to particular page
//Test the mousehover feature for All Courses

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SoftwareTestingAcademy {
	
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
		
		WebElement element5 = driver.findElement(By.xpath("//span[text()='Cloud Academy']"));
		Thread.sleep(2000);
		Actions acc = new Actions(driver);
		acc.moveToElement(element5).perform();
		Thread.sleep(2000);
		
		WebElement element6 = driver.findElement(By.xpath("//span[text()='Devops Academy']"));
		acc.moveToElement(element6).perform();
		Thread.sleep(2000);
				
				
		WebElement element7 = driver.findElement(By.xpath("//span[text()='Software Testing Academy']"));
		acc.moveToElement(element7).perform();
		Thread.sleep(2000);
		
		
		WebElement element7b = driver.findElement(By.xpath("//span[text()='Mastering Manual Testing Fundamentals']"));
		acc.moveToElement(element7b).perform();
    	Thread.sleep(2000);
		
		
		WebElement element7c = driver.findElement(By.xpath("//span[text()='Automation Testing with TestNG']"));
		acc.moveToElement(element7c).perform();
		Thread.sleep(2000);
				
		
		WebElement element7d = driver.findElement(By.xpath("//span[text()='Learn Git – Version Control']"));
		acc.moveToElement(element7d).perform();
		Thread.sleep(2000);
		

		WebElement element7e = driver.findElement(By.xpath("//span[text()='Database SQL Testing for Software Testers']"));
		acc.moveToElement(element7e).perform();
		Thread.sleep(2000);
		
		
		WebElement element7f = driver.findElement(By.xpath("//span[text()='Agile Methodology for Software Testers']"));
		acc.moveToElement(element7f).perform();
		Thread.sleep(2000);
		
		//Learning Programs
		
		WebElement element7g = driver.findElement(By.xpath("//span[text()='Master of Software Testing']"));
		acc.moveToElement(element7g).perform();
		Thread.sleep(2000);
		
		WebElement element7h = driver.findElement(By.xpath("//span[text()='Master of Manual Testing']"));
		acc.moveToElement(element7h).perform();
		Thread.sleep(2000);
	
		WebElement element7i = driver.findElement(By.xpath("//span[text()='Master of Automation Testing']"));
		acc.moveToElement(element7i).perform();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}
	

}
