package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {


			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				/*
				driver.get("https://www.spicejet.com/");
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
				
				Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).isSelected());
				Assert.assertTrue(true);
				
				driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
				
				Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).isSelected());
				Assert.assertFalse(false);
				*/
				
				driver.get("https://www.trivago.in/");
				
				driver.findElement(By.xpath("(//span[@class='flex'])[3]")).click();
				
				int i=0;
				while(i<7)
				{
					driver.findElement(By.xpath("//button[@data-role='addChild']")).click();
					i++;
				}
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				Thread.sleep(10000);
				
				driver.findElement(By.cssSelector("button[data-role='applyConfigBtn']")).click();
				Assert.assertEquals(driver.findElement(By.cssSelector("span.dealform-button__label")).getText(), "9 Guests");			
				Thread.sleep(5000);
				
				driver.quit();
			}

		}
	


