package wbTableTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTestPractise {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//check the alert
		
		 driver.findElement(By.xpath("//button[text()='Alert']")).click(); 
		 Alert alert = driver.switchTo().alert(); 
		 String alertMsg = alert.getText();
		 System.out.println(alertMsg);
		 alert.accept(); 
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// validate the webtable
		//String elename = driver.findElement(By.xpath("\"//table[@name='BookTable']/tbody/tr/td\"")).getText();
		 
	List<WebElement> elementsList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td"));
	for(WebElement e: elementsList) {
		String eleName = e.getText();
		
		System.out.println(eleName);
		if(eleName.equals("JAVA")) {
			//System.out.println(eleName);
			System.out.println("******checking element******");
			System.out.println("Element is found");
			break;
		}
		}
		driver.quit();

}
}
