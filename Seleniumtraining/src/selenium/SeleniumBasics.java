package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		//ctrl+shift+o
		WebDriver driver = new ChromeDriver();//object created
		
		driver.manage().window().maximize();//window maximized
		//driver.get("https://www.flipkart.com");//flippcart opened
		
		driver.get("https://www.google.com");
		
		String title= driver.getTitle();// to get title of page
		System.out.println(title);
		
		String URL=driver.getCurrentUrl();//to get current url that is opened in the browser
		
		System.out.println(URL);
		driver.quit();//closed the browser window
		
	}

}
