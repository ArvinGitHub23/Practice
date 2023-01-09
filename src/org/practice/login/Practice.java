package org.practice.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Practice {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\OneDrive\\Desktop\\Selenium\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	
	 driver.get(" http://adactinhotelapp.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));	
	  driver.findElement(By.xpath("//a[@href='Register.php']")).click();
	  
	  WebElement Txsrc = driver.findElement(By.id("username"));
	  Txsrc.sendKeys("ashok");
	  
	  
	  WebElement txpswd = driver.findElement(By.id("password"));
	  txpswd.sendKeys("abc@123");
	  WebElement txem = driver.findElement(By.id("password"));
	  txem.sendKeys("abc@gmail");
	  WebElement txfm = driver.findElement(By.id("full_name"));
	  txfm.sendKeys("ashokkumar");
	  WebElement txadd = driver.findElement(By.id("email_add"));
	  txadd.sendKeys("bdbdsbsajd");
	  String attribute = Txsrc.getAttribute("value");
	  System.out.println(attribute);
	  
}
}