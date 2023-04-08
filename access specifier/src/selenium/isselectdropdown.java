package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isselectdropdown {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		
	WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
		Select s=new Select(day);
		s.selectByIndex(7);
		
		Thread.sleep(4000);
	WebElement Month=driver.findElement(By.xpath("//select[@title='Month']"));
	Select f=new Select(Month);
	f.selectByVisibleText("Mar");
	Thread.sleep(4000);
	WebElement Year=driver.findElement(By.xpath("//select[@title='Year']"));
	Select g=new Select(Year);
	g.selectByVisibleText("1995");
	
	 
	}

	
}
