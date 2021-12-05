package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandeling {

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
		// step 2 
		WebElement alert =driver.findElement(By.xpath("//input[@id='alertbtn' or @value='alert']"));
		alert.click();
		Thread.sleep(1000);
		
	//step3 alerthandeling
		driver.switchTo().alert().accept();
		//step4 
		String name="sachin";
		WebElement Textname= driver.findElement(By.id("name"));
		Textname.sendKeys(name);
		// step 5 click on confirm button
		//step 5
		WebElement confirm =driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirm.click();
		
		//step 6 textget compare 
		
		String details=driver.switchTo().alert().getText();
		
		System.out.println(details);
		
		if (details.contains(name)) {
			
			driver.switchTo().alert().accept();
		}
		
		else {
			driver.switchTo().alert().dismiss();
		}
		
		
	
		
		Thread.sleep(3000);
		driver.close();
		
		
				
		}

	}
