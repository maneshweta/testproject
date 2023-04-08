package lastpartscrollupdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webtable {
	public static void main(String[]args) {
		 System.setProperty("Webdriver.chrome.driver", " C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://cosmocode.io/automation-practice-webtable/");
           List<WebElement> noofRows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
       //  System.out.println(noofRows.size());
         
	for(int i=1;i<noofRows.size();i++) {
		 List<WebElement> noofCells = driver.findElements(By.xpath("//table[@id='countries']//tr//td"));
	    //   System.out.println(noofCells.size());
		 	 for(int j=0;j<noofCells.size();j++) {
			System.out.print(noofCells.get(j).getText()+"    ");
		}System.out.println();
	}
	}

}
