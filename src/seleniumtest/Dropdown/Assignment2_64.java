package seleniumtest.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Karthic");
		driver.findElement(By.name("email")).sendKeys("karthic@abc.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("test123");
		driver.findElement(By.className("form-check-input")).click();
		driver.findElement(By.xpath("//select[@class='form-control']/option[1]")).click();
		driver.findElement(By.name("inlineRadioOptions")).click();
		driver.findElement(By.name("bday")).sendKeys("16/10/1991");
		driver.findElement(By.className("btn-success")).submit();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
