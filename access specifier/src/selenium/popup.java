package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import aann.chromedriver;

public class popup {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("Webdriver.gecko.driver", "C:\\Users\\shree\\Downloads\\New Folder\\geckodriver.exe");
		
	//	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
	//	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		//Thread.sleep(1000);
//	7888172792
	driver.get("https://www.google.com/");
//
	}

}
