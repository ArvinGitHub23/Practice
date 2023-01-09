package org.practice.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\OneDrive\\Desktop\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	driver.get(" https://www.flipkart.com/");
	 WebElement txusnm = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
JavascriptExecutor j=(JavascriptExecutor) driver;
j.executeScript("arguments[0].setAttribute('value','9998887770')",txusnm);
WebElement txpswd = driver.findElement(By.xpath("//input[@type='password']"));
j.executeScript("arguments[0].setAttribute('value','abcd@123')",txpswd);
Object username = j.executeScript("return arguments[0].getAttribute('value')", txusnm);
 System.out.println(username);
 
 Object password = j.executeScript("return arguments[0].getAttribute('value')", txpswd);
System.out.println(password);
WebElement btnlg = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
j.executeScript("arguments[0].click()",btnlg);
}
}
