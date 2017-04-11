package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPagePageFactory {
	
	WebDriver driver;
	public FbLoginPagePageFactory(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
/*By username = By.xpath("//input[@name='email']");
By password = By.xpath("//input[@name='pass']");
By Login = By.xpath("//input[@value='Log In']");*/
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement password;
	
	@FindBy(xpath="input[@value='Log In']")
	WebElement Login;

public WebElement Email()
{
	return username;
}

public WebElement Password()
{
	return password;
}

public WebElement Loginbutton()
{
	return Login;
}

}
