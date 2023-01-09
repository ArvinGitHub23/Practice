package org.practice.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTestprep {
	public static void main(String[] args) throws AWTException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\OneDrive\\Desktop\\Selenium\\driver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  String title = driver.getTitle();
		  System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement txusnm = driver.findElement(By.id("email"));
		txusnm.sendKeys("karnan");
		WebElement txpswd = driver.findElement(By.id("pass"));
		txpswd.sendKeys("karnan@123");
 		String attribute = txpswd.getAttribute("value");
		System.out.println(attribute);
		WebElement button = driver.findElement(By.name("login"));

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease (KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease (KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
		// WebElement element = driver.findElement(By.className("_97w4"));
		 //String text = element.getText();
		 //System.out.println(text);
		

	//	driver.quit();
	}
	

}
