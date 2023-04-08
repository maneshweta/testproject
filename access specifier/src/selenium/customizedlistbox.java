package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class customizedlistbox {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("Wedriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("(//button['_2KpZ61 _2doB4z'])[2]")).click();
		Thread.sleep(4000);
		
		WebElement login = driver.findElement(By.xpath("(//a[@class='_1_3w1N'])"));
	    Actions act=new Actions(driver);
	    act.moveToElement(login).perform();
		Thread.sleep(4000);
	     
		WebElement myprofile = driver.findElement(By.xpath("//div[@class='_3vhnxf']"));
	
		Thread.sleep(4000);
		
		
		
	//	act.click(myprofile).perform();
		
		act.contextClick(login).perform();
		
	}
}
