package ecommerce;
//program runs with the concept of Robot feature in selenium without using keyboard option.
//This works with the concept of right click option.
//Enter user name
//use double click
//Goto Emoji option in right click
//use context click



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclick_itlearn {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//configure browser
				WebDriver driver =new ChromeDriver();
				//launch url
				driver.get("https://www.itlearn360.com/wp-login.php");
				driver.manage().window().fullscreen();
				WebElement element = driver.findElement(By.id("user_login"));
				element.sendKeys("KAMATCHI11");
				
				// Keyboardfunctions using Robot
				Actions acc=new Actions(driver);
		        acc.doubleClick(element).perform();
		        acc.contextClick(element).perform();
		        
		        //highlight first option
		        Robot r = new Robot();
		        r.keyPress(KeyEvent.VK_DOWN);
		        r.keyRelease(KeyEvent.VK_DOWN);
		        Thread.sleep(2000);
		        
		        //Select first option
		        r.keyPress(KeyEvent.VK_ENTER);
		        r.keyRelease(KeyEvent.VK_ENTER);
		        Thread.sleep(2000);
		        
		        r.keyPress(KeyEvent.VK_LEFT);
		        r.keyRelease(KeyEvent.VK_LEFT);
		        
		        r.keyPress(KeyEvent.VK_ENTER);
		        r.keyRelease(KeyEvent.VK_ENTER);
		        
		        driver.quit();
		        
	     
		        
		        
	}

}
