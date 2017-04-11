package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLoginPage {
	WebDriver driver;
	public FbLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
By username = By.xpath("//*[@name='email']");
By password = By.xpath("//*[@name='pass']");
By Login = By.xpath("//*[@id='u_0_q']");

public WebElement Email()
{
	return driver.findElement(username);
}

public WebElement Password()
{
	return driver.findElement(password);
}

public WebElement Loginbutton()
{
	return driver.findElement(Login);
}

}
