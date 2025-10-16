package ActionsandFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		//Moving to a specific WebElement
		WebElement signin = driver.findElement(By.cssSelector("[id ='nav-link-accountList']"));
		a.moveToElement(signin).build().perform();
		WebElement searchbar =driver.findElement(By.className("nav-searchbar"));
		//Using Keyboard Shift key and sending values in Caps
		a.moveToElement(searchbar).click().keyDown(Keys.SHIFT).sendKeys("Hi Amazon").build().perform();
		//right clicking on the sign in button
		a.moveToElement(signin).contextClick().build().perform();


	}

}
