package POM_III;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Listbox_Test {
      
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions DO=new ChromeOptions();
		WebDriver driver=new ChromeDriver(DO);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(1000);
		
		listbox_page listbox=new listbox_page(driver);
		Thread.sleep(1000);
		listbox.clicklistbox();
		Thread.sleep(2000);
		driver.close();
	}
}
