package Locaters_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_Up 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		  driver.get("https://parabank.parasoft.com/");
	        
	        
	        
	        //link text
	       // driver.findElement(By.linkText("Register")).click();
	        
	        
	        //partial link text
	        driver.findElement(By.partialLinkText("Regis")).click();


	        //By ID
	        driver.findElement(By.id("customer.firstName")).sendKeys("Jacob");
	        driver.findElement(By.id("customer.lastName")).sendKeys("Jones");
	        driver.findElement(By.id("customer.address.street")).sendKeys("Temple Street, DownTown ");

	        //By Name
	        driver.findElement(By.name("customer.address.city")).sendKeys("NewYork");
	        driver.findElement(By.name("customer.address.state")).sendKeys("Albama");
	        driver.findElement(By.name("customer.address.zipCode")).sendKeys("542178");


	        
	        //cssSelector
	        driver.findElement(By.cssSelector("#customer\\.phoneNumber")).sendKeys("5623189211");
	        driver.findElement(By.cssSelector("#customer\\.ssn")).sendKeys("5435188");
	        
	        
	        //By Relative Xpath
	        driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("jony1");
	        driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("jony1234");

	        
	        //By Native or Absalute xapth
	        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[12]/td[2]/input")).sendKeys("jony1234");
	        
	        
	        //cssSelector
	        driver.findElement(By.cssSelector("#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
