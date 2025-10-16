package seleniumtest.Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/karthicrajasekaran/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Implicit wait
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("karthic");//id
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");//name
		driver.findElement(By.className("signInBtn")).click();//className
		//Thread.sleep(1000);
		//driver.quit();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//tagname.classname
		driver.findElement(By.linkText("Forgot your password?")).click();//linkText
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("karthic");// //tagname[@attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sample.com"); // tagname[attribute='value']
		//using xpath and cssSelector with index defined
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("test@gmail.com");
		// xpath and cssSelector using parent and child tags
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("4545623679");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // parenttagname childtagname
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("karthic"); //tagname#idvalue
		// xpath and cssSelector using regular expression
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		System.out.println("Successfully Logged in");
	}

}
