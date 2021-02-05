package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".select_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("((//a[@value='MAA'])[2])")).click();
		/*
		WebElement element = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		Select s = new Select(element);
		//s.selectByIndex(5);		
		//s.selectByValue("USD");
		s.selectByVisibleText("BDT");
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		driver.quit();
*/
	}
}

