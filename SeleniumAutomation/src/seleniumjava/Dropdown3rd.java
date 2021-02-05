package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown3rd 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.trivago.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[@class='flex'])[3]")).click();
		
		
		for(int i=2; i<5; i++)
		{
			driver.findElement(By.cssSelector("button[data-role='addAdult']")).click();			
		}
		
		for(int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("//button[@data-role='addChild']")).click();
		}
		
		for(int i=1; i<3; i++)
		{
			driver.findElement(By.xpath("//button[@data-role='addRoom']")).click();
			
		}
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[data-role='applyConfigBtn']")).click();
		System.out.println(driver.findElement(By.xpath("(//span[@class='flex'])[3]")).getText());		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
