package POM_DDF_I;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class parabank_register {

	
	   @FindBy(xpath="//input[@name='customer.firstName']") private WebElement firstname;
	   @FindBy(xpath="//input[@name='customer.lastName']") private WebElement lastname;
	   @FindBy(xpath="//input[@name='customer.address.street']") private WebElement address;
	   @FindBy(xpath="//input[@name='customer.address.city']") private WebElement city;
	   @FindBy(xpath="//input[@name='customer.address.state']") private WebElement state;
	   @FindBy(xpath="//input[@name='customer.address.zipCode']") private WebElement zipcode;
	   @FindBy(xpath="//input[@name='customer.phoneNumber']") private WebElement phone;
	   @FindBy(xpath="//input[@name='customer.ssn']") private WebElement ssn;
	   @FindBy(xpath="//input[@name='customer.username']") private WebElement username;
	   @FindBy(xpath="//input[@name='customer.password']") private WebElement password;
	   @FindBy(xpath="//input[@name='repeatedPassword']") private WebElement confirm;
	   @FindBy(xpath="//input[@value='Register']") private WebElement register;
	   parabank_register(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void enterfname(String fname)
	   {
		   firstname.sendKeys(fname);
	   }
	   public void enterlastname(String lname)
	   {
		   lastname.sendKeys(lname);
	   }
	   public void enteraddress(String addr)
	   {
		   address.sendKeys(addr);
	   }
	   public void entercity(String ct)
	   {
		   city.sendKeys(ct);
	   }
	   public void enterstate(String stt)
	   {
		   state.sendKeys(stt);
	   }
	   public void enterzipcoe(String zcode)
	   {
		   zipcode.sendKeys(zcode);
	   }
	   public void enterphonenumber(String phn)
	   {
		   phone.sendKeys(phn);
	   }
	   public void enterssn(String ssnn)
	   {
		   ssn.sendKeys(ssnn);
	   }
	   public void enterusername(String un)
	   {
		   username.sendKeys(un);
	   }
	   public void enterpassword(String pass)
	   {
		   password.sendKeys(pass);
	   }
	   public void confirmpassword(String cpass)
	   {
		   confirm.sendKeys(cpass);
	   }
	   public void clickregister()
	   {
		   register.click();
	   }
	   
	   
	   
}
