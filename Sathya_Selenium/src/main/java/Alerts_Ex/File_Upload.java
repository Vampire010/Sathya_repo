package Alerts_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException 
	{
		String Url = "https://cgi-lib.berkeley.edu/ex/fup.html";
		

		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("/Users/girishg/git/repository8/Sathya_Selenium/src/main/java/Alerts_Ex/prompt_ex.html");
	}

}
