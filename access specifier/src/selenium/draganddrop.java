package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class draganddrop {
     public static void main(String[]args) {
    	 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
    	 
    	driver.get("https://demo.guru99.com/test/drag_drop.html");
 WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
   WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
    
   Actions act=new Actions(driver);
 //  act.dragAndDrop(source, destination).perform();
     act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
     }
}
