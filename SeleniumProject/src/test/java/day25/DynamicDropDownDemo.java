package day25;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		
		
		
		
		List<WebElement> suggestionlist=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//span"));
		
		//for iphone only
		WebElement one_elt= driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div/div/div[not(span)]"));
		String one_elt_text= one_elt.getText();
		
		System.out.println("single element: " + one_elt_text);
		System.out.println("number os suggestions: " + suggestionlist.size());
		
		
		for (WebElement suggestion:suggestionlist)
			{
				String text =suggestion.getText();
				
				if ( text.equals("iphone case"))
				{
					suggestion.click();
					break;
				}
				else if (one_elt_text.equals("iphone"))
				{
					one_elt.click();
			
				}
			}
		
		
	}
}

