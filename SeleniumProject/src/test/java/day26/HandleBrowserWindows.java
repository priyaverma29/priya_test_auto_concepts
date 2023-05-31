package day26;

import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		
		
		//Capture ids for browser windows
	
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		
		//Approach1
		//convert Set into List collection so that we can retrive the values by get method
		List <String> windowidsList = new ArrayList<String>(windowIDs);


		String parentWindowID=windowidsList.get(0);
		String childWindowID=windowidsList.get(1);
		
		//Switch driver focus to child window
		driver.switchTo().window(childWindowID);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[2]//a[1]")).click();
		
		
		//Switch driver focus to child window
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
		//Approach 2
		//check the title of pages by grtTitle() and then compare their titles
		
		for(String winid:windowIDs)
		{
			
		}
		
		
		
		
	}


}
