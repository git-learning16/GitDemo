package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/karthicrajasekaran/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//FireFox
		System.setProperty("webdriver.gecko.driver", "/Users/karthicrajasekaran/Documents/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		
		//Chrome
		System.setProperty("webdriver.edge.driver", "/Users/karthicrajasekaran/Documents/msedgedriver");
		WebDriver driver2 = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		//Thread.sleep(10);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		
		

	}

}
