package ActionsandFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksandTitles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Getting the list of all links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		// creating web element for the footer and then get the links of the footer
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		// creating one more child for the specific coupon block and getting all the
		// links
		WebElement coupons = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coupons.findElements(By.tagName("a")).size());

		// iterating and click on all links and opening in separate tab
		for (int i = 1; i < coupons.findElements(By.tagName("a")).size(); i++) {

			// coupons.findElements(By.tagName("a")).get(i).click();
			String clickoption = Keys.chord(Keys.COMMAND, Keys.ENTER);
			coupons.findElements(By.tagName("a")).get(i).sendKeys(clickoption);
			Thread.sleep(2000L);

		}

		// getting the title of each tab opened and printing it
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
