package Ecart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		String date ="15";
		String month ="09";
		String year ="2027";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("div[class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month) -1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		String actualdate =driver.findElement(By.cssSelector(".react-date-picker__inputGroup input[name='date']")).getAttribute("value");
		System.out.println(actualdate);
		Assert.assertEquals(actualdate ,year+"-"+month+"-"+date);
		System.out.println("Matched");
		
		driver.close();
		
	}
	

}
