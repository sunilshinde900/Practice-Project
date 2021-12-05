package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil shinde\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		//Step-1
		//Browser open- by creating 
		WebDriver driver =new ChromeDriver();
		
		//Step-2
		//maximize the window
		driver.manage().window().maximize();
		
		//Step-3
		driver.get("https://www.facebook.com/");
		
		//step-4
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("abc@gmail.com");
		
		
		//Step-5
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Pass1234");

	}

}
