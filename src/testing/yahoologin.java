package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoologin {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://in.yahoo.com/?p=us");
	    driver.findElement(By.id("uh-signin")).click();
	    driver.findElement(By.id("login-username")).clear();
	    driver.findElement(By.id("login-username")).sendKeys("swethamunni11@yahoo.com");
	    driver.findElement(By.id("login-signin")).click();
	    driver.findElement(By.id("login-passwd")).clear();
	    driver.findElement(By.id("login-passwd")).sendKeys("mummydady");
	    driver.findElement(By.id("login-signin")).click();
}
}