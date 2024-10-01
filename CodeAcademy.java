package ecommerce;
     // comment line specifies working structure of program of code Academy and its related funtionality in the page
	//Launch the Url in Edge Browser
	//Goto All courses
	//Click All courses list
	//Goto Code Academy
	//Goto Java for Beginners
	//Navigate to next Page
	//start free trial
	//monthly trial
	//Register the monthy Trial with Valid Credentials
	//Logout OF THE PAGE
	//Close the Entire Browser
	


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CodeAcademy {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//Launch the Url in Edge Browser
		driver=new EdgeDriver();
		driver.get("https://www.itlearn360.com");
		driver.manage().window().fullscreen();
		
		// Goto All courses
		Thread.sleep(3000);
		
		//Click All courses list
		WebElement element = driver.findElement(By.xpath("//a[@class='cd-dropdown-trigger desktop-navigation btn btn-primary']"));
		element.click();
		
		Thread.sleep(2000);
		// Goto Code Academy
		WebElement element2a = driver.findElement(By.xpath("//span[text()='Code Academy']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(element2a).perform();
		Thread.sleep(2000);
		
		
		//Goto Java for Beginners
		WebElement element9 = driver.findElement(By.xpath("//span[text()='Java for Beginners']"));
		acc.moveToElement(element9).perform();
		element9.click();
		Thread.sleep(2000);
		
		//Navigate to next Page
		//start free trial
		WebElement element10 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/article/div[2]/div[1]/div/div[3]/div[1]/div[1]/ul/li[6]/a/button"));
		driver.manage().window().fullscreen();
		element10.click();
		Thread.sleep(2000);
		
		//monthly trial
		WebElement element11 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/article/div[2]"
				+ "/div[1]/div/div[3]/div[2]/div[2]/div[9]/div/div[1]/div/div/div[1]/div/div[2]/div/form/div/button"));
		driver.manage().window().fullscreen();
		element11.click();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//Register the monthy Trial with Valid Credentials
		WebElement element1 = driver.findElement(By.id("user_login"));
		element1.sendKeys("KAMATCHI11");
		WebElement element2 = driver.findElement(By.id("user_pass"));
		element2.sendKeys("KAMATCHI456$");
		WebElement element3 = driver.findElement(By.name("wp-submit"));
		element3.click();
		Thread.sleep(3000);
		
		//Logout OF THE PAGE
		 WebElement element4 = driver.findElement(By.xpath("//span[text()='Logout']"));
	     element4.click();
	    
	     //Close the Entire Browser
	     driver.quit();
			
	}

}
