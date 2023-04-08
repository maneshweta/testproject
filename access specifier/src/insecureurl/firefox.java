package insecureurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class firefox {
	public static void main(String[]args) {

	FirefoxOptions foptions =new FirefoxOptions();
	
	FirefoxProfile profile=new FirefoxProfile();
	
	profile.setAcceptUntrustedCertificates(true);
	
	foptions.setProfile(profile);
	
	
	
	  
	//WebDrivermanager.firefoxdriver().setup();
	
	
	WebDriver driver=new FirefoxDriver(foptions);
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.khanacademy.org/");
	//driver.manage().window().maximize();
}

}
