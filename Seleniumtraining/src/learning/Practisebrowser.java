package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisebrowser {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://selenium.qabible.in/jquery-select.php");
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		
		//driver.findElement(By.xpath("//*[@id='select2-upn8-container']")).sendKeys("Hawaii");
		
		driver.findElement(By.xpath("//*[@class='form-check-input']")).click();
		List<WebElement> checklist=driver.findElements(By.xpath("//*[@class='check-box-list']"));
			
				for(WebElement element :checklist ) {
					element.click();
			}
		

	}

}
