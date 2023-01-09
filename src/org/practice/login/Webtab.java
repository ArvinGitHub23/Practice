package org.practice.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/html/html-tables.asp");
		WebElement tables = driver.findElement(By.id("customers"));
		 List<WebElement> tRows = tables.findElements(By.tagName("tr"));
		 for (int i = 0; i <tRows.size(); i++) {
			 WebElement element = tRows.get(i);
			 String text = element.getText();
			 System.out.println(text);
			
		}
		
	}

}
