package POM_DDF_II;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class parabank_login {
   
	
	 @FindBy(xpath="//input[@name='username']") WebElement username;
	 @FindBy(xpath="//input[@name='password']") WebElement password;
	 @FindBy(xpath="//input[@value='Log In']") WebElement loginbtn;
	 
	 parabank_login(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void enterusername(String un)
	 {
		 username.sendKeys(un);
	 }
	 public void enterpassword(String pass)
	 {
		 password.sendKeys(pass);
	 }
	 public void clicklogin()
	 {
		 loginbtn.click();
	 }
}
