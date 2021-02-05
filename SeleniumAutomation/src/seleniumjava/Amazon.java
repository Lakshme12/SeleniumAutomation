package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getTitle());
		//Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
		
		System.out.println(driver.getCurrentUrl());
		//https://www.amazon.com/
		
		//System.out.println(driver.getPageSource());
		
		driver.get("https://www.google.com/");
		
		driver.navigate().back();
		
		driver.quit();
		
		//Ie
				//System.setProperty("webdriver.ie.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\IEDriverServer.exe");
				//WebDriver driver = new InternetExplorerDriver();

	}

}
