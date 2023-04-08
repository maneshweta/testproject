package googlelast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class google {
		public static void main(String[]args) throws InterruptedException {
		//	System.setProperty("Webdriver.gecko.driver", "C:\\Users\\shree\\Downloads\\geckodriver-v0.26.0-win64 (2)\\geckodriver.exe");
	

			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			
		options.addArguments("--remote-allow-origins=*");
			
				
				WebDriver driver=new ChromeDriver(options);
			
		//	WebDriver driver=new FirefoxDriver(options);
			
			driver.get("https://www.Google.com/");

}
		}