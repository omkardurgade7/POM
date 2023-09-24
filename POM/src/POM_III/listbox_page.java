package POM_III;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class listbox_page {
     
	
	@FindBy(xpath="//select") private WebElement listbox;
	
	listbox_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicklistbox()
	{
		listbox.click();
		Select ss=new Select(listbox);
		
		ss.selectByVisibleText("India");
	}
	
	
	
}
