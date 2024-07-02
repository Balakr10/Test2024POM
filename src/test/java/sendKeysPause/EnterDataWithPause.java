package sendKeysPause;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterDataWithPause {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		
		WebElement search = driver.findElement(By.name("search"));
		
		String s1 = "automationtest";
		
		char val[] = s1.toCharArray();
		
		for(char c : val) {
			act.sendKeys(search, String.valueOf(c)).pause(500).build().perform();

		}
	}
}
