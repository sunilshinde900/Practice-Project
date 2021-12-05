package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		//step 1
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil shinde\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		/*driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		*/
	//step1
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		//step2
		WebElement newwindow =driver.findElement(By.xpath("//button[@id='windowButton']"));
		newwindow.click();
		Thread.sleep(5000);
		//step3
		//String childwindow=driver.getWindowHandle();
		//System.out.println(childwindow);
		//step4
		Set<String> allwindow =driver.getWindowHandles();
		System.out.println(allwindow);
	//String title=driver.getTitle();
	//System.out.println(title);
		//step5
		for(String id: allwindow) {
			System.out.println(id);
			if(!parentWindow.equalsIgnoreCase(id)) { // id having 2 window information thats why it will go down
				driver.switchTo().window(id);
				driver.manage().window().maximize();
				Thread.sleep(1000);
				
			}
		}
		
	
	Thread.sleep(1000);
	driver.quit();
	}

}
