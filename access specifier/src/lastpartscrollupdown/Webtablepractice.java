package lastpartscrollupdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablepractice {
	public static void main(String[]args) {
		// System.setProperty("Webdriver.chrome.driver", " C:\\Users\\shree\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	//	System.out.println(noofrows.size());
		
	//	List<WebElement> noofcells = driver.findElements(By.xpath("//table[@class='table1'][1]//tr//td"));
	//	System.out.println(noofcells.size());
		
		for(int i=0;i<noofrows.size();i++) {
			List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			for(int j=0;j<noofcells.size();j++) {
				System.out.print(noofcells.get(j).getText()+"      ");
			}
			System.out.println();
			
		}
		 
	}

}
