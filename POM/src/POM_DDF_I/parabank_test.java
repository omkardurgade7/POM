package POM_DDF_I;

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
		
    	ChromeOptions co=new ChromeOptions();
    	WebDriver driver=new ChromeDriver(co);
    	
    	driver.manage().window().maximize();
    	Thread.sleep(1000);
    	
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Thread.sleep(1000);
        
        parabank_hpage link=new parabank_hpage(driver);
        link.clickregister();
        
        FileInputStream file=new FileInputStream("D:\\Selenium Excel Sheet\\newwww.xlsx");
        Sheet sh=WorkbookFactory.create(file).getSheet("Sheet7");
        Thread.sleep(1000);
        
        parabank_register reg=new parabank_register(driver);
        String fname=sh.getRow(0).getCell(0).getStringCellValue();
        reg.enterfname(fname);
        Thread.sleep(1000);
        
        String lname=sh.getRow(1).getCell(0).getStringCellValue();
        reg.enterlastname(lname);
        Thread.sleep(1000);
        
        String addr=sh.getRow(2).getCell(0).getStringCellValue();
        reg.enteraddress(addr);
        Thread.sleep(1000);
        
        String ct=sh.getRow(3).getCell(0).getStringCellValue();
        reg.entercity(ct);
        Thread.sleep(1000);
        
    	String stt=sh.getRow(4).getCell(0).getStringCellValue();
    	reg.enterstate(stt);
    	Thread.sleep(1000);
    	
    	String zcode=sh.getRow(5).getCell(0).getStringCellValue();
    	reg.enterzipcoe(zcode);
    	Thread.sleep(1000);
    	
    	String phn=sh.getRow(6).getCell(0).getStringCellValue();
    	reg.enterphonenumber(phn);
    	Thread.sleep(1000);
    	
    	String ssnn=sh.getRow(7).getCell(0).getStringCellValue();
    	reg.enterssn(ssnn);
    	Thread.sleep(1000);
    	
    	String un=sh.getRow(8).getCell(0).getStringCellValue();
    	reg.enterusername(un);
    	Thread.sleep(1000);
    	
    	String pass=sh.getRow(9).getCell(0).getStringCellValue();
    	reg.enterpassword(pass);
    	Thread.sleep(1000);
    	
    	String cpass=sh.getRow(10).getCell(0).getStringCellValue();
    	reg.confirmpassword(cpass);
    	Thread.sleep(1000);
    	
    	reg.clickregister();
    	Thread.sleep(1000);
    	
    	driver.quit();
    	
	}
}
