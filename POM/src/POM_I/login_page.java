package POM_I;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	
	   @FindBy(xpath="//input[@id='user-name']") private WebElement username;
	   @FindBy(xpath="//input[@id='password']") private WebElement password;
	   @FindBy(xpath="//input[@id='login-button']") private WebElement login;
	   
	   login_page(WebDriver driver)
	   {
		  PageFactory.initElements(driver, this); 
	   }
	   
	   public void enterusername()
	   {
		   username.sendKeys("standard_user");
	   }
	   public void enterpassword()
	   {
		   password.sendKeys("secret_sauce");
	   }
	   public void clickloginbutton()
	   {
		   login.click();
	   }
}
