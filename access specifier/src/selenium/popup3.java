package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup3 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(1000);
	WebElement alt=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		alt.click();
		
	Thread.sleep(2000);
		//driver.switchTo().alert().getText();
     driver.switchTo().alert().sendKeys("no");
  //   Thread.sleep(4000);
    
}
}