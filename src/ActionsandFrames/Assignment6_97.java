package ActionsandFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6_97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("[for='benz'] input ")).click();
		String options = driver.findElement(By.cssSelector("[for='benz'] ")).getText();
		WebElement select = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(select);
		dropdown.selectByVisibleText(options);
		driver.findElement(By.id("name")).sendKeys(options);
		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(options)) {
			System.out.println("Value is present");
		}

		else {
			System.out.println("Not available");
		}
		String expected = text.split(",")[0].split(" ")[1].trim();
		// System.out.println(driver.switchTo().alert().getText().split(",")[0].split("
		// ")[1].trim());
		Assert.assertEquals(options, expected);
		driver.switchTo().alert().accept();

	}

}
