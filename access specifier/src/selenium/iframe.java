package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
		//for unsecured connections
		
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[@allowfullscreen='true']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
	}
}
