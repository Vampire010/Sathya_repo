package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_ex {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver(); 
        driver.get("http://mykidsbank.org/");
        
        
        WebElement sel = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input")); 
       
       
       
       boolean Before_isSel = sel.isSelected();
       
       System.out.println(Before_isSel);

       sel.click();
       
       
       boolean After_isSel = sel.isSelected();
       
       System.out.println(After_isSel);

       
       
       Thread.sleep(2000);
       
       driver.quit();
	}

}
