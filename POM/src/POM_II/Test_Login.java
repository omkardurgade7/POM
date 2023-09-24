package POM_II;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_Login {

	//https://practicetestautomation.com/practice-test-login/
	 //POM Class-1
		//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation

	  @FindBy(xpath="//input[@name='uname']") private WebElement UN;
	  @FindBy(xpath="//input[@name='pass']") private WebElement PASS;
	  @FindBy(xpath="(//input[@type='submit'])[1]")  private WebElement LOGBTN;
	    
	//2. Initialize within a constructor with access level public using PageFactory Class
	  
	  Test_Login(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	//3. Utilize within a method with access level public
	  
	  public void enterusername()
	  {
       UN.sendKeys("test");
	  }
	  public void enterpassword()
	  {
		  PASS.sendKeys("test");
	  }
	  public void clickloginbtn()
	  {
          LOGBTN.click();
	  }
}
