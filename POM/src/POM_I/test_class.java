package POM_I;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test_class {

	     public static void main(String[] args) throws InterruptedException {
			
	    	 ChromeOptions CO=new ChromeOptions();
	    	 WebDriver driver=new ChromeDriver(CO);
	    	 
	    	 driver.manage().window().maximize();
	    	 Thread.sleep(1000);
		
	         driver.get("https://www.saucedemo.com/");
	         Thread.sleep(1000);
	         
	         login_page login=new login_page(driver);
	         login.enterusername();
	         Thread.sleep(1000);
	         login.enterpassword();
	         Thread.sleep(1000);
	         login.clickloginbutton();
	         Thread.sleep(1000);
	         
	         account_page account=new account_page(driver);
	         account.verifylogo();
	         Thread.sleep(1000);
	         account.clickmenu();
	         Thread.sleep(1000);
	         account.clicklogout();
	         Thread.sleep(1000);
	         driver.close();
	     
	     }
}
