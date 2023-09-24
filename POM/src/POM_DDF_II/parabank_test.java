package POM_DDF_II;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class parabank_test {
 
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		 ChromeOptions CO=new ChromeOptions();
		 WebDriver driver=new ChromeDriver(CO);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		 Thread.sleep(1000);
		 
		 FileInputStream file=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");;
		 Sheet sh=WorkbookFactory.create(file).getSheet("Sheet8");
		 
		 parabank_login login=new parabank_login(driver);
		 String un=sh.getRow(0).getCell(0).getStringCellValue();
		 login.enterusername(un);
		 Thread.sleep(2000);
		 
		 String pass=sh.getRow(1).getCell(0).getStringCellValue();
		 login.enterpassword(pass);
		 Thread.sleep(2000);
		 
		 login.clicklogin();
		 Thread.sleep(2000);
		 
		 parabank_welcome verify=new parabank_welcome(driver);
		 String expectedamount=sh.getRow(2).getCell(0).getStringCellValue();
		 verify.verifyusername(expectedamount);
		 Thread.sleep(2000);
		 verify.clickloginbutton();
		 Thread.sleep(2000);
		 
		 driver.quit();
		 
		 
		 
	
}

}