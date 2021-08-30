package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_DropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///Users/girishg/git/repository8/Sathya_Selenium/src/main/java/Drop_Down/Multi_DropDown.html");
		
		
		
		WebElement testDropDown = driver.findElement(By.id("cars"));

		
		Select dropdown = new Select(testDropDown);
		
		dropdown.selectByIndex(0);
		Thread.sleep(3000);

		dropdown.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		
		dropdown.deselectByIndex(0);
		
		Thread.sleep(3000);

		dropdown.deselectByVisibleText("Audi");
		
		Thread.sleep(3000);

		dropdown.selectByIndex(0);
		dropdown.selectByVisibleText("Audi");
	
		Thread.sleep(3000);

		dropdown.deselectAll();
	}

}
