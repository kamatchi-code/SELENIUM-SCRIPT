package ecommerce;
//program runs with the concept of Robot feature in selenium without using keyboard option.
//This works with the concept of right click option.
//Enter user name
//Chk the feature of Cut and padte function for username

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclick_Username {
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
		        
		        Robot r = new Robot();
		        // highlight Second Option option
		        for (int i = 0; i < 2; i++) {
		        	r.keyPress(KeyEvent.VK_DOWN);
			        r.keyRelease(KeyEvent.VK_DOWN);
			        Thread.sleep(2000);
				}
		    		        	        
		        //Select second option
		        r.keyPress(KeyEvent.VK_ENTER);
		        r.keyRelease(KeyEvent.VK_ENTER);
		        Thread.sleep(2000);
		        
		        //paste  using keyboard shortcut
		        r.keyPress(KeyEvent.VK_CONTROL);
		        r.keyPress(KeyEvent.VK_V);
		        
		        r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_V);

        
		        
	}
	              
}
