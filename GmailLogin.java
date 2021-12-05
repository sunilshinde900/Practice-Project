package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil shinde\\Desktop\\chromedriver_win32\\chromedriver.exe");
		// browse open by creating 
		WebDriver driver= new ChromeDriver();
		//
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
WebElement email =driver.findElement(By.name("identifier"));
email.sendKeys("sunilshinde900@gmail.com");
WebElement next=driver.findElement(By.tagName("VfPpkd-vQzf8d"));
next.click();


	}

}
