package org.practice.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.netty.handler.codec.http.multipart.FileUpload;

public class Print {
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com");
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   //Thread.sleep(3000);
	   WebElement srctext = driver.findElement(By.xpath("//input[@type='text']"));
	srctext.sendKeys("iphone x");
	WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));			 
	btn.click();
	Thread.sleep(3000);
	TakesScreenshot t = (TakesScreenshot)driver;
	File sorce = t.getScreenshotAs(OutputType.FILE);
	File des=new File( "E:\\screenshots\\ASASAS\\.ab.jpg");
	FileUtils.copyFile(sorce, des);
		}
			}
		
           
		

		  
		  
		  
	
	

