package POM_I;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class account_page {

	
	@FindBy(xpath="//div[text()='Swag Labs']")private WebElement verifytext;
    @FindBy(xpath="//button[text()='Open Menu']")private WebElement menu;
    @FindBy(xpath="//a[text()='Logout']")private WebElement logout;
	  account_page(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void verifylogo()
	  {
		  String expectedtext="Swag Labs";
		  String s1=verifytext.getText();
		  if(expectedtext.equals(s1))
		  {
			  System.out.println("PASS");
		  }
	  }
	  public void clickmenu()
	  {
		  menu.click();
	  }
	  public void clicklogout()
	  {
		  logout.click();
	  }
	   
}
