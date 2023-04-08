package automate;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class flipkart {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\shree\\Downloads\\geckodriver-v0.26.0-win64 (2)\\geckodriver-v0.26.0-win64 (2).exe");
	//	ChromeOptions options=new ChromeOptions();
		
//		options.addArguments("--remote-allow-origins=*");
		
			
//			WebDriver driver=new ChromeDriver(options);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[contains(@class,'_2IX')]")).sendKeys("shwetamane998@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'2Kp')]")).click();
		
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='xtXmba']")).click();
	 //   Thread.sleep(2000);
	 //   driver.findElement(By.xpath("//input[@class='_166SQN']")).sendKeys("413003");
	    
	}

}
