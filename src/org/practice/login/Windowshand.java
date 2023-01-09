package org.practice.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshand {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\OneDrive\\Desktop\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		 WebElement txsr = driver.findElement(By.name("keyword"));
		 txsr.sendKeys("resist eyewear",Keys.ENTER);
		 WebElement glass = driver.findElement(By.xpath("(//p[@class='product-title '])[1]"));
		 glass.click();
		 String win1 = driver.getWindowHandle();
		 System.out.println(win1);
		 Set<String> win2 = driver.getWindowHandles();
		 System.out.println(win2);
		 for (String eachid : win2) {
			 if (!eachid.equals(win1)) {
				 driver.switchTo().window(eachid);
			 } 
			 }
				WebElement btnlog = driver.findElement(By.xpath("(//span[@class='intialtext'])[1]"));
				btnlog.click();
				WebElement price = driver.findElement(By.xpath("(//span[text()='Rs. 999'])[2]"));
				String text = price.getText();
				System.out.println(text);
			}
			
		
		 
	
	
	}
	
	
	


