package array;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class autosuggestiongoogle {
 public static void main(String[]args) throws InterruptedException {
	 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1));
		driver.get("https://www.Google.com/");
		
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("oneplus");	
		Thread.sleep(1000);
	List<WebElement> options = driver.findElements(By.xpath("//div[@class='aajZCb']"));
	//	for(WebElement Eachoption:options) { //advance for loop
		//	System.out.println(Eachoption.getText());
	//	}
	
	for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
	}
	
		
 }
}
