package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnbasic {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//*[@class='navbar-nav']/li[1]")).click();//for home page
		//1.simple form demo
		/*driver.findElement(By.xpath("//*[@class='list-group list-group-flush']/li[1]")).click();
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("sneha");
		driver.findElement(By.xpath("//*[@id='button-one']")).click();
		
		driver.findElement(By.linkText("select-input.php")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).click();
		//2.CHECKBOX DEMO
		//driver.findElement(By.xpath("//*[@class='list-group list-group-flush']/li[2]")).click();//checkbox demo

		driver.findElement(By.xpath("//*[@class='form-check-input']")).click();
		List<WebElement> checklist=driver.findElements(By.xpath("//*[@class='check-box-list']"));
			
				for(WebElement element :checklist ) {
					element.click();
			}*/
		//driver.findElement(By.xpath("//*[@class='list-group list-group-flush']/li[2]")).click();//checkbox demo
		
	
	}


}
