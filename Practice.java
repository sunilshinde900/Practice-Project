package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil shinde\\Desktop\\chromedriver_win32\\chromedriver.exe");
		// step1
		WebDriver driver =new ChromeDriver();
		
		//step2
		driver.navigate().to("https://vctcpune.com/selenium/practice.html#");
		//step3
		driver.manage().window().maximize();
		//step4 scroll down the window 
	JavascriptExecutor  js= (JavascriptExecutor )driver;
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(2000);
//Step 5
WebElement dropdown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
Thread.sleep(2000);
//step6 select class 
Select sel=new Select (dropdown);
//sel.selectByIndex(2);
sel.selectByVisibleText("Option3");


// step7
List <WebElement> listcount =sel.getOptions();
//System.out.println("nuber of list in dropdown "+listcount.size());
//step8
for(WebElement ele: listcount) {
	System.out.println(ele.getText());
	if(ele.getText().equals("Option1")){
		System.out.println("print op1 ="+ele.getText());
		sel.selectByVisibleText(ele.getText());
	}
	
}

		
		
		Thread.sleep(1000);
		driver.close();
	}

}
