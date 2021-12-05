package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunil shinde\\Desktop\\chromedriver_win32\\chromedriver.exe");
// browse open by creating 
WebDriver driver= new ChromeDriver();
//
driver.manage().window().maximize();
//
driver.get("https://www.facebook.com/");

WebElement emailbox=driver.findElement(By.id("email"));

emailbox.sendKeys("abs@gmail.com");

WebElement password =driver.findElement(By.id("pass"));
password.sendKeys("hsdga@12334");

// step 6 login button 
//WebElement button=driver.findElement(By.xpath("//button[@name ='login']"));
//button.click();

// step 7 forgetPassword

WebElement forgetPassword=driver.findElement(By.linkText("Forgotten password?"));
forgetPassword.click();
//WebElement forgetPassword =driver .findElement(By.xpath("//*[@class='_6ltj'  ]   "));
//forgetPassword.click();

// step 8 creatAccount
//WebElement creatAccount =driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
//creatAccount.click();
// step9 forgotten password verification 
driver.findElement(By.xpath(" //input[@id= 'identify_email']"  )).sendKeys("9527601155");
driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy']")).click();
Thread.sleep(5000);
//step 9 search
driver.findElement(By.xpath("//button[@  name='reset_action']")).click();

driver.close();




	}

}