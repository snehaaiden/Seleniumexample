package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Basics2 {

	public static void main(String[] args) {
		
		String browserName="Edge";
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
				}
		else if(browserName.equalsIgnoreCase("Edge")){
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")){
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Please choose correct browser");
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.close();// is used to close current window of browser
		//driver.quit();//close entire browser

	}

}
