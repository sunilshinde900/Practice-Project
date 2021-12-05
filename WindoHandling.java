package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil shinde\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://vctcpune.com/selenium/practice.html#");
		driver.manage().window().maximize();
		//String s=driver.getTitle();
		//System.out.println(s);
	
		//step 1 scrolling
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		//step-5
		String parentwindow =driver.getWindowHandle();
		System.out.println(parentwindow);
	
		// step6 handling window
		driver.findElement(By.xpath("//*[@id='opentab']")).click();
		Thread.sleep(2000);
		
		//step7 scroll down
		String title=driver.getTitle();
		System.out.println(title);
		//step8
		String childwindow=driver.getWindowHandle();
		System.out.println(childwindow);
		
		//step9 switching to parent window
		driver.switchTo().window(parentwindow);
		Thread.sleep(7000);
		//step10 switching to child window
		driver.switchTo().window(childwindow);
		
	Set<String> setwindow =driver.getWindowHandles();
	System.out.println(setwindow);
		Thread.sleep(7000);
		//driver.close();
	}

}
