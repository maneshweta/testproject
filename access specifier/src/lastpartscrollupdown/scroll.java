package lastpartscrollupdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", " C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	
	 driver.get("https://www.album.alexflueras.ro/index.php");
	 
	 JavascriptExecutor scroll=(JavascriptExecutor)driver;
	 scroll.executeScript("window.scrollBy(0,3000)");
	 Thread.sleep(1000);
	 
	 scroll.executeScript("window.scrollBy(0,-3000)");
	 
	 Thread.sleep(1000);
	 scroll.executeScript("window.scrollBy(3000,0)");
	 
	 Thread.sleep(1000);
	 scroll.executeScript("window.scrollBy(-3000,0)");
	}

}
