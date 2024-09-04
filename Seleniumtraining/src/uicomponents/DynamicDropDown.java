package uicomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://selenium.qabible.in/jquery-select.php");
		
		driver.findElement(By.xpath("//*[contains(@class,'-selection--multiple')]")).sendKeys("new");
		
		List<WebElement> states = driver.findElements(By.xpath("//*[contains(@class,'-results__option')]/li"));
		
	for(int i =0;i<states.size();i++) {
		
	//System.out.println(states.get(i).getText());
			if(states.get(i).getText().equalsIgnoreCase("new jersey")) {
				states.get(i).click();
				break;//otherwise program fails as loop is not exited
		}
	}
		
		/*for(WebElement state : states) {
			if(state.getText().equalsIgnoreCase("new york")) {
				state.click();
				break;
			}
		}
		
		driver.quit();*/
		
	}

}
