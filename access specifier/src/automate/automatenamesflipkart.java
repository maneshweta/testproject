package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatenamesflipkart {
 public static void main(String[]args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://m.facebook.com");
	System.out.println(driver.getTitle());
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shwetamane998@gmail.com");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='text']")).clear();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shwetamane998@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shweta12345@#");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(4000);
	//driver.quit();
	
 }
}