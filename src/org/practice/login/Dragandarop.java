package org.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandarop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	WebElement banksrc = driver.findElement(By.id("credit2"));
	WebElement bankdes = driver.findElement(By.id("bank"));
	a.dragAndDrop(banksrc, bankdes).perform();
	 WebElement amsrc = driver.findElement(By.id("fourth"));
	 WebElement amdes = driver.findElement(By.id("amt7"));
	a.dragAndDrop(amsrc, amdes).perform();
	WebElement banksrc1 = driver.findElement(By.id("credit1"));
	WebElement bankdes1 = driver.findElement(By.id("loan"));
	a.dragAndDrop(banksrc1, bankdes1).perform();
	WebElement amsrc1 = driver.findElement(By.id("fourth"));
	 WebElement amdes1 = driver.findElement(By.id("amt8"));
	 a.dragAndDrop(amsrc1, amdes1).perform();
	 
	 WebElement text = driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
	 String text2 = text.getText();
	 
	 if (text2.equals("Perfect!")) {
		System.out.println("success");
	} else {
	System.out.println("not success");

	}
	
	
}
}
