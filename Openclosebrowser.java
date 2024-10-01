package ecommerce;

//This program open the Browser,Launch URL,Close the Browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openclosebrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//interface              //Browser
		driver.get("https://www.itlearn360.com/");//open the url
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
