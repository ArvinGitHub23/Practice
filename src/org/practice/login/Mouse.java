package org.practice.login;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\OneDrive\\Desktop\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/java-training-in-chennai.html");
		driver.manage().window().maximize();
		WebElement textcourse = driver.findElement(By.xpath("//div[@class='browse-wrapper-greens']"));
		Actions a =new Actions(driver);
		a.moveToElement(textcourse).perform();
		 WebElement txsub = driver.findElement(By.xpath("//div[@title='Software Testing']"));
	a.moveToElement(txsub).perform();
	WebElement txtsub1 = driver.findElement(By.xpath("//span[text()='ISTQB Certification']"));
a.moveToElement(txtsub1).perform();
txtsub1.click(); 
	}
	

}
