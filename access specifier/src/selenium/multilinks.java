package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multilinks {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	
	System.out.println(links.size());
	for(int i=0;i<=links.size();i++) {
		System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
	}
	}

}
