package org.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karnan jagadeesan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get(" https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMImrmmnsa1-gIVqJpmAh25pAlxEAAYASAAEgIKn_D_BwE");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("arvin");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("aravindhan");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9876543210");
	


		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("abc@1134");
		
		WebElement dd = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s=new Select(dd);
		s.selectByIndex(3);
		WebElement dd1 = driver.findElement(By.xpath(" //select[@aria-label='Month']"));
		Select s1=new Select(dd1);
		s1.selectByIndex(6);
		WebElement dd2 = driver.findElement(By.xpath(" //select[@aria-label='Year']"));
		Select s2 =new Select(dd2);
		s2.selectByIndex(9);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
		
		
	}
	

}
