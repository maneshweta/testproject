package insta;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class creenshot {
 public static void main(String[]args) throws IOException {
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://www.shaadi.com/reg/");
	 
	 for(int i=1;i<=5;i++) {
	 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String random=RandomString.make(2);
	 File Destination=new File("C:\\Users\\shree\\Desktop\\screenshot.jpg");
	 
	 FileHandler.copy(source, Destination);
 
	 }
     }
	 }