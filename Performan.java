import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Performan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub44
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\selinium\\driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	driver.get("https://www.globallogic.com/");
	
	
	WebElement mainDev = driver.findElement(By.id("menu-item-17627"));
	Actions a = new Actions(driver);
	a.moveToElement(mainDev).perform();
	Thread.sleep(5);
	WebElement subDev = driver.findElement(By.linkText("Services Offerings"));
	a.moveToElement(subDev);
	a.click();
	a.perform();

	}

}
