package ecommerce;
//Program chk for all the Learning Program Courses from software test academy
//Goto Master of Manual Testing
// Each courses  in manual testing are navigating to related page
//Close the Browser

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningPrograms {
	
	public static void main(String[] args) throws InterruptedException {

		//configure browser
		WebDriver driver =new EdgeDriver();//sign in//span[contains(text(),'sign in?')]
		
		//launch url
		driver.get("https://www.itlearn360.com");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		

		//All courses
		Thread.sleep(3000);
		 WebElement element = driver.findElement(By.xpath("//a[@class='cd-dropdown-trigger desktop-navigation btn btn-primary']"));
		element.click();
		
		
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Software Testing Academy']"));
		Thread.sleep(2000);
		Actions acc = new Actions(driver);
		acc.moveToElement(element2).perform();
		Thread.sleep(2000);
		
		//Learning Programs
		
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Master of Manual Testing']"));
		element3.click();
		//acc.moveToElement(element7h).perform();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement element4 = driver.findElement(By.xpath("//button[text()='Learning Courses']"));
		Thread.sleep(3000);
		element4.click();
		
		WebElement element5 = driver.findElement(By.xpath("//h3[text()='Mastering Manual Testing Fundamentals']"));
		Thread.sleep(3000);
		element5.click();
		
		driver.navigate().back();
		
		WebElement element6 = driver.findElement(By.xpath("//h3[text()='JIRA for Software Testers: Bug Tracking Course']"));
		Thread.sleep(3000);
		element6.click();
		
		driver.navigate().back();
		
		WebElement element7 = driver.findElement(By.xpath("//h3[text()='Agile Methodology for Software Testers']"));
		Thread.sleep(3000);
		element7.click();
		
		driver.navigate().back();
		
		WebElement element8 = driver.findElement(By.xpath("//h3[text()='Database SQL Testing for Software Testers']"));
		Thread.sleep(3000);
		element8.click();
		
		driver.navigate().back();
		driver.quit();
		
		
		
		
		
	
		
		
	}

}
