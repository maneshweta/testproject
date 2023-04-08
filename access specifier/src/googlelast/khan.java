package googlelast;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class khan {
public static void main(String[]args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	
      options.addArguments("--remote-allow-origins=*");
	
		
		WebDriver driver=new ChromeDriver(options);
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.khanacademy.org/");
		

}
	
}
