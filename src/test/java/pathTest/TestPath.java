package pathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPath {
	
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		By countryName = By.xpath("//span[text()='Financial Center']/parent::th/following-sibling::td/span");
		
		getElementName(countryName);
		getElementNm("Clock Tower Hotel");
		
		Thread.sleep(3000);
		
		driver.close();
		

	}
	
	private static void getElementNm(String compName) {
		String data = driver.findElement(By.xpath("//span[text()='"+compName+"']/parent::th/following-sibling::td/span")).getText();
		
		System.out.println(data);
		
	}

	private static void getElementName(By locator) {
		String data = driver.findElement(locator).getText();
		
		System.out.println(data);
		
	}

}
