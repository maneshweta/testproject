package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkart {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.getCurrentUrl();
		driver.get("https://www.facebook.com/reg/");
		Thread.sleep(1000);
   //  driver.get("https://seller.flipkart.com/index.html#signUp/accountCreation/new?utm_source=fkwebsite&utm_medium=websitedirect");
      
     
     driver.findElement(By.xpath("//select[@title='Day']")).click();
       Thread.sleep(2000);
		
		WebElement Day =driver.findElement(By.xpath("//select[@title='Day']"));
       Select s=new Select(Day);
       s.selectByIndex(7);//list
       Thread.sleep(1000);
     
       WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
      month.click();
      Thread.sleep(2000);
       Select g=new Select(month);
       g.selectByVisibleText("Mar");
       Thread.sleep(4000);
       
       WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
      year.click();
      Thread.sleep(2000);
       Select y=new Select(year);
       y.selectByVisibleText("1999");
       Thread.sleep(2000);
      
       
   //    String url=driver.getCurrentUrl();
    //   System.out.println(url);
       
      // String exurl="https://www.facebook.com/reg/";
       
    //   if(url.equalsIgnoreCase(exurl)) {
    //	   System.out.println("url is correct");
    //   }else {
    //	   System.out.println("url is not correct");
    //   }
       
       String url=driver.getCurrentUrl();
       System.out.println(url);
       
       String exurl="https://www.facebook.com/reg/";
       
      
       
	}
}