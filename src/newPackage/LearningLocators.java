package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningLocators {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		driver.findElement(By.id(""));
	}
	
}
