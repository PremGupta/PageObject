package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.FbLoginPage;

public class LoginAppllication {

 @Test
 public void Login()
 {
	   System.setProperty("webdriver.chrome.driver", "E:\\Mee\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
				FbLoginPage fbpdriver=new FbLoginPage(driver);
				fbpdriver.Email().sendKeys("prem2604@gmail.com");
				fbpdriver.Password().sendKeys("divya20792");
			    fbpdriver.Loginbutton().click();
 }

}
