package ActionsandFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.partialLinkText("Free Access to InterviewQues")).click();
		//Creating window handles to switch parent and child windows
		Set<String> window = driver.getWindowHandles();
		//Iterator will help us to navigate different windows
		Iterator<String> it =window.iterator();
		String parentId =it.next();
		String childId =it.next();
		//moving to child window
		driver.switchTo().window(childId);
		String username=driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(username);
		//splitting the string value and getting the actual username
		String emailId =username.split("at")[1].trim().split(" ")[0];
		System.out.println(emailId);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
	}

}
