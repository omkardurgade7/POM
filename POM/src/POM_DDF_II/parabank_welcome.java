package POM_DDF_II;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class parabank_welcome {

	    @FindBy(xpath="//b[text()='$50000.00']") private WebElement balance;
	    @FindBy(xpath="//a[text()='Log Out']") private WebElement logout;
	    
	    parabank_welcome(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    public void verifyusername(String expectedamount)
	    {
	    	String actualamount=balance.getText();
	    	
	    	if(expectedamount.equals(actualamount))
	    	{
	    		System.out.println("PASS");
	    	}
	    	else
	    	{
	    		System.out.println("FAIL");
	    	}
	    }
	    public void clickloginbutton()
	    {
	    	logout.click();
	    }
}
