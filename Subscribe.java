package ecommerce;
// chk for subscription 
// Lost your password
// Close the browser
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Subscribe {
	public static void main(String[] args) throws InterruptedException {
		//configure browser
				WebDriver driver =new ChromeDriver();
				
		//launch url
		driver.get("https://www.itlearn360.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(3000);
		
		//Enter Email
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Provide your email']"));
		Thread.sleep(2000);
		element.sendKeys("Test@gmail.com");
		
		//subscribe
		WebElement element1 = driver.findElement(By.xpath("//span[@class='elementor-button-text']"));
		Thread.sleep(2000);
		element1.click();
		Thread.sleep(3000);
		
		//add scroll up
		
		//Home
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Home']"));
		element2.click();
		Thread.sleep(3000);
		
		//Signin
		WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
		sign.click();
		Thread.sleep(4000);
		
		//Lost your Password
		WebElement element3 = driver.findElement(By.xpath("//a[text()='Lost your password?']"));
		element3.click();
		Thread.sleep(2000);
		
		//Enter Email Address
		WebElement element4 = driver.findElement(By.id("user_login"));
		element4.sendKeys("kamsritu2010@gmail.com");
		Thread.sleep(2000);
		
		//Get New Password
		WebElement element5 = driver.findElement(By.id("wp-submit"));
		element5.click();
		Thread.sleep(2000);
		
		//Login Page
		WebElement element6 = driver.findElement(By.xpath("//a[text()='login page']"));
		Thread.sleep(3000);
		element6.click();
		
		driver.quit();
		
		
		
		
				
		
		
	}

}
