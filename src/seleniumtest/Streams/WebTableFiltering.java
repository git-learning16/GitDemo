package seleniumtest.Streams;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.id("search-field")).sendKeys("B");
		 List<WebElement> products = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		 products.stream().filter(s->s.getText().contains("Brinjal")).map(s->s.findElement(By.xpath("following-sibling::td[1]")).getText()).forEach(s->System.out.println(s));

	}

}
