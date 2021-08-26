package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
	//	driver.get("https://www.softwaretestingexperts.com");
		
		
		
		//navigate method

		driver.navigate().to("https://www.softwaretestingexperts.com");
		
		
		
		//click
		driver.findElement(By.xpath("//*[@id=\"app\"]/main/header/nav/ul/li[3]/div/a")).click();
		
		driver.manage().window().fullscreen();

		//sendkeys

		driver.findElement(By.xpath("//*[@id=\"00pDBnuK54kQ-0KB2lwgy\"]/div[2]/div/form/div[1]/div[1]/div/div/div/input")).sendKeys("Girish");
		Thread.sleep(2000);

		
		
		//sendkeys
		driver.findElement(By.xpath("//*[@id=\"00pDBnuK54kQ-0KB2lwgy\"]/div[2]/div/form/div[1]/div[2]/div/div/div/input")).sendKeys("Ram");
		Thread.sleep(2000);

		
		//clear text
		driver.findElement(By.xpath("//*[@id=\"00pDBnuK54kQ-0KB2lwgy\"]/div[2]/div/form/div[1]/div[1]/div/div/div/input")).clear();
		Thread.sleep(2000);

		
		
		//navigate backward
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		//navigate forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		
		//navigate refresh page
		driver.navigate().refresh();
		
		
		//navigate backward
				driver.navigate().back();
				Thread.sleep(2000);
				

		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"NB0m05H3w\"]/p")).getText());
		
		
		//manage
		
		driver.manage().window().maximize();
		
		
		
		
		//driver.close();
		driver.quit();
		

	}

}
