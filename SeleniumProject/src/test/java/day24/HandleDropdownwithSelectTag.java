package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownwithSelectTag {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states");
		driver.manage().window().maximize();
		
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
		
		Select drpCountry= new Select(drpCountryEle);
		
		//1) Selecting an option from the dropdown
		//drpCountry.selectByVisibleText("USA");
		
		//drpCountry.selectByValue("4");//@value attribute of Option tag if its avilable
		//drpCountry.selectByIndex(3);//France
		
		
		//2) total no options in drop down
		List<WebElement> options=drpCountry.getOptions();
		System.out.println("total Options no are: "+ options.size());
	
		
		//3) Print Options in console window
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}*/
		
		//using enhanced for loop
		for (WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
	}

}
