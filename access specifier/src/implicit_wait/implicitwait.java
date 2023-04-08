package implicit_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitwait {

	public static void main(String[]args) throws InterruptedException {
               WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//input[contains(@class,'_2IX')]")).sendKeys("shwetamane998@gmail.com");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'2Kp')]"))).click();
		//driver.findElement(By.xpath("//button[contains(@class,'2Kp')]")).click();
		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='xtXmba']")).click();
	 //   Thread.sleep(2000);
	
	
	}
	}