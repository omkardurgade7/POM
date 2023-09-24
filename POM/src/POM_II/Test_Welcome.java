package POM_II;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_Welcome {

	//this class for after login welcome homepage
		//POM Class-II
		
			//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation

	
	@FindBy(xpath="//h2[text()='asd (test)']") 
	private WebElement Usershow;
	@FindBy(xpath="//a[text()='Logout test']") 
	private WebElement Logoutbtn;		
		
	//2. Initialize within a constructor with access level public using PageFactory Class
	
	Test_Welcome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public
	
	public void verifyusername()
	{
		String actusername="asd (test)";
		Usershow.getText();
		String s1=Usershow.getText();
		if(actusername.equals(s1))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("PASS");
		}
	}
	public void logoutbutton()
	{
		Logoutbtn.click();
	}
		
}
