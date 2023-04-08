package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup2 {
	
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");//launch the browser
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();//click on box
	
	Thread.sleep(1000);//delay for 1 second
	driver.switchTo().alert().accept();//accept popup 
}
}