package Dropdown_Concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\selinium\\driver2\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();	
while(!driver.findElement(By.cssSelector("[ div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom]  [ th.datepicker-switch]")).getText().contains("October"))	{
			
			driver.findElement(By .cssSelector("[ div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom] [th.next]")).click();
		}
		//		
//		
		
//while(!driver.findElement(By.cssSelector("class='datepicker-switch']")).getText().contains("March"))	{
//		
//		driver.findElement(By.cssSelector("[class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'] th[class='next']")).click();
//	}
//	
	
	List<WebElement> days = driver.findElements(By.className("day"));
	
	System.out.println(days.size());
	
	for(int i =1 ;i<=days.size();i++){
		
		
	String dayName =	days.get(i).getText();
	if(dayName.equalsIgnoreCase("23")){
		
		days.get(i).click();
		break;
		
		
	}
		
	}
		
System.out.println(driver.findElement(By.cssSelector("div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom")).getText());
System.out.println(driver.findElement(By.cssSelector("th.datepicker-switch")).getText());
System.out.println(driver.findElement(By.cssSelector("[class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'] ")).getText());
System.out.println(driver.findElement(By.cssSelector(" [class='datepicker-switch']")).getText());
//System.out.println(driver.findElement(By.cssSelector(" [class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'][class='datepicker-switch']")).getText());
	}
	}


