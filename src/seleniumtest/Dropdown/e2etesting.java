package seleniumtest.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2etesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/karthicrajasekaran/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		
		driver.findElement(By.cssSelector("a[class*='active']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		for (int i=1; i<4; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("input.buttonN")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		

	}

}
