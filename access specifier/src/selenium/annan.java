package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class annan {
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Shweta");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shwetamane998@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shweta12345@#");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@value='1']")).click();

}
}
