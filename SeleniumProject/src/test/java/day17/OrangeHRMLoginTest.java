package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 1- Launch browser
 2- Open url: https://opensource-demo.orangehrmlive.com/
 3- Provide username - Aadmin
 4- Provide password -admin123
 5- Click on login button
 6- Verify the title of Dashboard page
 	Exp title: OrangeHRM
 7- Close Browser
 
 */
public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//1- Launch Browser
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver(); or
		
		WebDriver driver = new ChromeDriver();
		
		//2- Oepn the url on browser
		driver.get("https://opensource-demo.orangehrmlive.com/" );
		driver.manage().window().maximize();// maximize the window chaining methods
		Thread.sleep(5000);
		
		
		//3- Provide username - Admin
		//WebElement txtUsername = driver.findElement(By.name("username"));
		//txtUsername.sendKeys("Admin"); or
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4- Provide password - admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//5- click on login button
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]")).click();
		
		//6- verify the title of dashboard page
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		if (act_title.equals(exp_title)) 
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
			
		//7- close browser
		//driver.close();or 
		driver.quit();
	}

}
