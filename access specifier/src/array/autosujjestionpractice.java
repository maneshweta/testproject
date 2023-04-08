package array;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosujjestionpractice {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("ladies sandals");
    driver.navigate().refresh();
    
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='gLFyf']"))).sendKeys("sandals");

	Thread.sleep(1000);
	List<WebElement> options = driver.findElements(By.xpath("//div[@class='aajZCb']"));
 
	wait.until(ExpectedConditions.visibilityOfAllElements(options));
	for(WebElement Eachoption:options) {// itadvanceforloop
		System.out.println(Eachoption.getText());
	}

}
	
}
