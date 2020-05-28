package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.Base;


public class Login
{
	@FindBy(name="user_name")
	private WebElement usernameTF;
	
	@FindBy(name="user_password")
	private WebElement passwordTF;
	
	@FindBy(id="submitButton")
	private WebElement loginBTN;
	
	public Login()
	{
		PageFactory.initElements(Base.staticDriver, this);
	}

	public WebElement getUsernameTF() 
	{
		return usernameTF;
	}

	public WebElement getPasswordTF() 
	{
		return passwordTF;
	}

	public WebElement getLoginBTN() 
	{
		return loginBTN;
	}
	
	public Home loginToApp(String username, String password)
	{
		System.out.println("POM -> Login Method");
		System.out.println("Enering Username");
		usernameTF.sendKeys(username);
		System.out.println("Enering Username");
		passwordTF.sendKeys(password);
		System.out.println("CLicking on Login Button");
		loginBTN.click();
		return new Home();
	}
	
	
}
