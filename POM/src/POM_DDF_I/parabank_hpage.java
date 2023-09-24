package POM_DDF_I;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class parabank_hpage {

	     @FindBy(xpath="//a[text()='Register']") private WebElement registerbutton;
	     
	     parabank_hpage(WebDriver driver)
	     {
	    	 PageFactory.initElements(driver, this);
	     }
	     public void  clickregister()
	     {
	    	 registerbutton.click();
	     }
	     
}
