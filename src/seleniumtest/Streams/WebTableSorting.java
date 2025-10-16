package seleniumtest.Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("th[aria-sort='descending']")).click();
		List<WebElement> names = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> orignialnames = names.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortednames = orignialnames.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(orignialnames.equals(sortednames));
		// Assert.assertEquals(orignialnames, sortednames);

		// filter the Beans vegetable and then get the price of it
		names.stream().filter(s -> s.getText().contains("Beans"))
				.map(s -> s.findElement(By.xpath("following-sibling::td[1]")).getText())
				.forEach(s -> System.out.println(s));
		

		// filter the value Rice in the 4th page and then print the price of it
		List<String> price;

		do {
			List<WebElement> newnames = driver.findElements(By.xpath("//tbody/tr/td[1]"));

			price = newnames.stream().filter(s -> s.getText().contains("Tomato"))
					.map(s -> s.findElement(By.xpath("following-sibling::td[1]")).getText())
					.collect(Collectors.toList());

			price.forEach(s -> System.out.println(s));
			//using pagination  to go to next page
			if (price.size() < 1) {

				driver.findElement(By.cssSelector("[aria-label ='Next']")).click();

			}

		} while (price.size() < 1);

	}

}
