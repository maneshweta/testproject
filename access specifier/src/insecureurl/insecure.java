package insecureurl;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class insecure {

	//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	 DesiredCapabilities desiredcap =DesiredCapabilities.chrome();
	  desiredcap.AcceptInsecureCerts;
	desiredcap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
	
	desiredcap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
	ChromeOptions options=new ChromeOptions();
	
	options.merge(desiredcap);
	
	webdrivermanager.chromedriver().setup();
	
	
	WebDriver driver=new ChromeDriver(options);
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.khanacademy.org/");
	//driver.manage().window().maximize();
}
