package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ctest {

	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://accounts.google.com/signin");
		 driver.findElement(By.id("identifierId")).clear();
		    driver.findElement(By.id("identifierId")).sendKeys("swethakrish60");
		    driver.findElement(By.cssSelector("content.CwaK9")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("9676600270");
		    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		    driver.findElement(By.cssSelector("span.gb_7a.gbii")).click();
		    driver.findElement(By.id("gb_71")).click();
		   
	}
}
