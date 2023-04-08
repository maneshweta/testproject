package selenium;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopup {

public static void main(String[]args) throws InterruptedException {
	   System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(id);
		Thread.sleep(4000);
		
		String cbadd=al.get(1);
		
		driver.switchTo().window(cbadd);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='http://bit.ly/youtube-qavbox']")).click();
		Thread.sleep(4000);
		driver.switchTo().window(al.get(0));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		
       
		
   }
}
