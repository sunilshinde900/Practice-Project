package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownScrolling {

	public static void main(String[] args) throws InterruptedException  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil shinde\\Desktop\\chromedriver_win32\\chromedriver.exe");
	// step1
	WebDriver driver =new ChromeDriver();
	
	//step2
	driver.navigate().to("https://vctcpune.com/selenium/practice.html#");
	//step3
	driver.manage().window().maximize();
	//Step-4
			//scrolling webpage-we require to use javascriptexecutor
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//scrolling down
		js.executeScript("window.scrollBy(0,500)");
		
		//step-5
				//Handling of dropdown
				
				//a-finding dropdown element
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select sel= new Select(dropdown);
		//sel.selectByIndex(2);
	//sel.selectByVisibleText("Option3");
		
List<WebElement> list =sel.getOptions();
System.out.println(list);
//each LOOP
		
for (WebElement ele:list) { 
	
	System.out.println("Different drop down text " + ele.getText());
	 
	if (ele.getText().equals("Option2")) {
	    
		System.out.println("Value of dropdown is "+ ele.getText());
		
		sel.selectByVisibleText(ele.getText());
		
				
	}
}
			
		
Thread.sleep(5000);
		driver.close();
		
		

	}

}

