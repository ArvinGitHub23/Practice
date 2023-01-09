package org.practice.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\OneDrive\\Desktop\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com.test/guru99home");
}
}
