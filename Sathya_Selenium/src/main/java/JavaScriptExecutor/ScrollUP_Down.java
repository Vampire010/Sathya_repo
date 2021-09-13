package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ScrollUP_Down {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new SafariDriver();
		driver.get("https://news.yahoo.com/");
		
		 
		  //Creating the JavascriptExecutor interface object by Typecasting
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	      
	        //Vertical scroll down by 500  pixels
	        js.executeScript("window.scrollBy(0,500)");

	        Thread.sleep(2000);
	        js.executeScript("window.scrollBy(500,0)");


	}

}
