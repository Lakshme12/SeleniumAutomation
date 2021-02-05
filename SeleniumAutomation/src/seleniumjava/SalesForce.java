package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesForce 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
				
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("seledemo");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("seledemo");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.navigate().back();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
		//driver.findElement(By.linkText(" Salesforce for Small Business")).click();
			
	}

}
