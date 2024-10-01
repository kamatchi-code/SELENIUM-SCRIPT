package ecommerce;
	//comment line This program works concept of mousehover without using keyboard and mouse features
	//Launch the Url in ChromeBrowser
	//Goto All courses
	//Perform mousehover for all the courses
	// Scroll down the page 
	// chk all the social media link
	// close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CoursesMouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		//configure browser
				WebDriver driver =new ChromeDriver();//sign in//span[contains(text(),'sign in?')]
				
				//launch url
				driver.get("https://www.itlearn360.com");
				driver.manage().window().maximize();
				
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
				
				//perform full link test for Software Testing Academy
				
						
				WebElement element7 = driver.findElement(By.xpath("//span[text()='Software Testing Academy']"));
				acc.moveToElement(element7).perform();
				Thread.sleep(2000);
				
				
				WebElement element7a = driver.findElement(By.xpath("//span[text()='Mastering Selenium WebDriver with Java']"));
				acc.moveToElement(element7a).perform();
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
				
//			    WebElement element7j = driver.findElement(By.xpath("//span[text()='SDET: Master Software Development & Testing']"));
//				acc.moveToElement(element7j).perform();
//				Thread.sleep(2000);
				
				
				
				//-----------------------
				
				WebElement element8 = driver.findElement(By.xpath("//span[text()='Code Academy']"));
				acc.moveToElement(element8).perform();
				Thread.sleep(2000);
				
				WebElement element9 = driver.findElement(By.xpath("//span[text()='Cyber Security Academy']"));
				acc.moveToElement(element9).perform();
				Thread.sleep(2000);
				
				WebElement element10 = driver.findElement(By.xpath("//span[text()='Career Guidance Academy']"));
				acc.moveToElement(element10).perform();
				Thread.sleep(2000);
				
				// Back to All courses
				Thread.sleep(3000);
				WebElement elementa1 = driver.findElement(By.xpath("//a[text()='All Courses']"));
				elementa1.click();	
				Thread.sleep(2000);
				
				//Scroll down
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,8000)");
				Thread.sleep(3000);
				
				//Social Media
								
				WebElement elements1 = driver.findElement(By.xpath("//i[@class='fab fa-facebook-f']"));
				elements1.click();
				Thread.sleep(2000);
				driver.navigate().back();
				
				Thread.sleep(1000);		
				WebElement elements1a = driver.findElement(By.xpath("//i[@class='fab fa-youtube']"));
				elements1a.click();
				Thread.sleep(2000);
				driver.navigate().back();
				
				Thread.sleep(1000);
				WebElement elements1b = driver.findElement(By.xpath("//i[@class='fab fa-linkedin']"));
				elements1b.click();
				Thread.sleep(2000);
				driver.navigate().back();
				
				Thread.sleep(1000);
				WebElement elements1c = driver.findElement(By.xpath("//i[@class='fab fa-instagram']"));
				elements1c.click();
				Thread.sleep(2000);
				driver.navigate().back();
				
				WebElement element1b = driver.findElement(By.xpath("/html/body/footer/div/section[3]/div/div[1]/div/div/div/ul/li[5]/a"));
				element1b.click();
				Thread.sleep(2000);
				driver.navigate().back();
				
				///html/body/footer/div/section[3]/div/div[1]/div/div/div/ul/li[5]/a
			
				driver.quit();			
							
							
	}

}
