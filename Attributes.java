package ecommerce;
//comment line This program works concept of mousehover without using keyboard and mouse features
//Launch the Url in ChromeBrowser
//Display the Heading title from the Front page 
//close the Browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributes {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//launch url
		driver.get("https://www.itlearn360.com");
		WebElement element = driver.findElement(By.xpath("//h2[@class='xpro-heading-title']"));
		String text = element.getText();
		System.out.println(text);
		//tagname[contains(text(),'text value')]
		driver.quit();
	}

}
