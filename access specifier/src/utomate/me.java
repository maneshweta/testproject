package utomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class me {
	public static void main(String[]args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/login.php");
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath(""//input(@name="))
		
		
		
	}

}
