package seleniumtest.WindowScroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_103 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("Uni");
		Thread.sleep(3000);
		List<WebElement> countries = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		System.out.println(countries.size());

		for (WebElement country : countries) {
			if (country.getText().equalsIgnoreCase("United Arab Emirates")) {
				country.click();
				break;
			}
		}

	}

}
