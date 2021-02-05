package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\programms\\selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		System.out.print("Family and Friend: ");
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		System.out.print("Senior citizen: ");
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		System.out.print("Armed forces: ");
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		System.out.print("Student: ");
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).isSelected());
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
		System.out.print("Unaccompanied Minor: ");
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());
		
		driver.quit();
		

	




	}

}
