package seleniumjava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class JetFaceBook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//chrome
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//here WebDriver is a Interface
		//driver - a reference variable
		//new allocated memory for the object to instantiate the class
		//here class is ChromeDriver
		
		
		//firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		// driver.get("https://www.spicejet.com/");//
		
		//System.out.println(driver.getTitle());
		//SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets
		
		//System.out.println(driver.getCurrentUrl());
		//https://www.spicejet.com/
		
		//driver.navigate().back();
		
		//driver.quit();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("9444256792");
		
		driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("1234LAKS");
		
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
		//Facebook
		
		System.out.println(driver.getCurrentUrl());
		//https://www.facebook.com/
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
