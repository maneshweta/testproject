package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
      
		
		String title=driver.getTitle();
		System.out.println(title);
		
       String exptitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        if(title.equalsIgnoreCase(exptitle)) {
        	System.out.println("navigate to correct page");
        }else {
        	System.out.println("navigate to invalid page");
        }
        
        driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
       driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.manage().window().minimize();
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com/");
       Thread.sleep(4000);
        driver.close();
        
        driver.manage().window().minimize();
        
        driver.navigate().forward();
      Thread.sleep(2000);
       driver.navigate().refresh();
      driver.navigate().back();
       Thread.sleep(2000);
        driver.close();
        driver.quit();
        
       Dimension d=new Dimension(200,200);
       driver.manage().window().setSize(d);
       
       Point p=new Point(100,200);
       driver.manage().window().setPosition(p);
        
        
        
        
	}

}
