package seleniumtest.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name ="karthic";
		//String password ="rahulshettyacademy";
		
		System.setProperty("webdriver.chrome.driver", "/Users/karthicrajasekaran/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		String password =getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Implicit wait
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		//Using tagName locator
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		//Using the text value from the button and passing it in Xpath
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		System.out.println("Logged Out of the Application");
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String [] passwordArray =passwordText.split("'");
		//System.out.println(passwordArray[0]);
		//System.out.println(passwordArray[1]);
		return passwordArray[1];
	}

}
