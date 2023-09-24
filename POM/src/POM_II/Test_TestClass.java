package POM_II;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_TestClass {


    public static void main(String[] args) throws InterruptedException {
    	//open browser
		ChromeOptions DO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(DO);
		
		driver.manage().window().maximize();
		//open the application
		driver.get("http://testphp.vulnweb.com/login.php");
		
		//create a object of POM class-1
		Test_Login login=new Test_Login(driver);
		
		login.enterusername();
		Thread.sleep(1000);
		login.enterpassword();
		Thread.sleep(2000);
		login.clickloginbtn();
		Thread.sleep(2000);
		
		 //Create Object of POM Class-II
		Test_Welcome verify=new Test_Welcome(driver);
	   
		verify.verifyusername();
	  Thread.sleep(1000);
		driver.close();
}
}