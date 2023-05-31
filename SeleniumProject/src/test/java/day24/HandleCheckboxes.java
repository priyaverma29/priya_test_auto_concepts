package day24;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		// clear the values
		//driver.findElement(By.id("monday")).click();
		
		//total no of checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		
		System.out.println("total no of checkboxes"+ checkboxes.size());
		
		
		//Select all the checkboxes
		
		for(int i=0;i<checkboxes.size();i++)
		
		{
			checkboxes.get(i).click();
		}
		
		//enhanced for loop
		/*for (WebElement chkbox:checkboxes)
		
		{
			chkbox.click();
		}*/
		
		//Select last 3 chceck boxes
		//total no of checkboxes - how many chckboxes to be selected = starting index
		//7-3=4 (starting index)
		/*for(int i=4;i<checkboxes.size();i++)
			
		{
			checkboxes.get(i).click();
		}
		*/
		//select first 2 checkboxes
		for(int i=0;i<2;i++)
			
		{
			checkboxes.get(i).click();
		}
		
		/*for(int i=0;i<checkboxes.size();i++)
			
		{
			if (i<2) 
			{
				checkboxes.get(i).click();
			}
		}*/
		
	
		
		//uncheck the checkboxes
		Thread.sleep(4000);
		
		for(int i=0;i<checkboxes.size();i++)
			
		{
			if(checkboxes.get(i).isSelected())
			checkboxes.get(i).click();
		}
		
		//driver.quit();
		
	}

}
