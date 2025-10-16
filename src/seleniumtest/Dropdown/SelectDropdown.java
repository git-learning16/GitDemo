package seleniumtest.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/karthicrajasekaran/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//static dropdown with select tag
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown );
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		System.out.println(staticdropdown.getAttribute("name"));//returns the attribute value of the webelement
		
		//update dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		for (int i=1; i<5; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.cssSelector("input.buttonN")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Dynamic dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		//if more than webelement is found for xpath use the index and select the specified one
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//alternate way to select using parent and child xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//Calendar box dropdown
		
		driver.findElement(By.cssSelector("a[class*='active']")).click();
		
		/*Auto Suggestive dropdown
		1.enter the text u want
		2. identify the common element which can list all the options and store it in a List
		3.Iterate it and find the exact value and then click it */
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		//Thread.sleep(10000);
		
		List<WebElement> optionlist = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for (WebElement option : optionlist) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
	}

}
