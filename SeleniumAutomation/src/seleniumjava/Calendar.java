package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.spicejet.com/");
		
		//driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//Thread.sleep(3000);
		
		//System.out.println(driver.findElement(By.cssSelector(".ui-state-default")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector(".ui-state-default")).isDisplayed());
		//System.out.println(driver.findElement(By.cssSelector(".ui-state-default")).isEnabled());
		
		//driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_2']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("#MultiCityModelAlert")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
