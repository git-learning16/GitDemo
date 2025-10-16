package seleniumtest.RelativeLocators;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class OpenNewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//New feature from Selenium 4.0 where it can switch to new tab and do the operations
		driver.switchTo().newWindow(WindowType.TAB);
		//using window handles getting child and parent window details and switching
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		//Get the first course name
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(course);
		//Switched back to parent and entered the course name
		driver.switchTo().window(parentwindow);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(course);
		//Take screenshots at WebElement level
		File src = name.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("testfile.png"));
		 //Getting height and width of Webelement
		WebElement tutorial = driver.findElement(By.className("jumbotron"));
		System.out.println(tutorial.getRect().getDimension().getHeight());
		System.out.println(tutorial.getRect().getDimension().getWidth());
		

	}

}
