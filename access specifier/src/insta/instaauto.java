package insta;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class instaauto{
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		
   	options.addArguments("--remote-allow-origins=*");
		
			
			WebDriver driver=new ChromeDriver(options);
		
		
	//	WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		//WebElement 
	//	driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("shweta abhiman mane");
      
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		for(int i=0;i<=links.size();i++) {
			System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
		}
	}
}