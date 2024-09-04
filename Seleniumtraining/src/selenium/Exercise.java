package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);//interrupted exception will b present

		driver.findElement(By.linkText("About")).click();
		driver.navigate().back();

		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("Log")).click();

		driver.close();

		
		}

}
