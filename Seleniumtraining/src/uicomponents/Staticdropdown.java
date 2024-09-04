package uicomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/select-input.php");
		
		/**
		 * This technique is applied for only select dropdown
		 * 	1. Make a select class object for dropdown
		 *  2. Call appropriate method to select from dropdown
		 * 
		 */
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
					//dropdown is a variable
	/*	Select staticDropdown= new Select(dropdown);//webelement dropdown is passed as argument in constructor
		staticDropdown.selectByVisibleText("Green");
		
		Thread.sleep(1000);
		staticDropdown.selectByValue("Yellow");//object...
		
		Thread.sleep(1000);
		
		staticDropdown.selectByIndex(1);
		
		driver.quit();*/

	}

}
