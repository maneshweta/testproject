package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
     
	WebElement text=driver.findElement(By.xpath("//form[@method='post']"));//to find whole page text
	String result=text.getText();
	 System.out.println(result);
	 
//	Thread.sleep(4000);
//WebElement	ele= driver.findElement(By.xpath("//div[@class='pvl _52lp']"));
	// String attribute=ele.getAttribute("autocomplete");
	 //System.out.println(attribute);
	}

}
