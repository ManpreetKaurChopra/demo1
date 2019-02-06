import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class djworking {

	public static WebDriver driver;

	public static  void main(String[] args) {
		
		
		String regex = "^[0-9]{3}-[0-9]{3}-[0-9]{4}-?$";
		Pattern pattern = Pattern.compile(regex);
		
		
		String regexEmail ="^([.a-zA-Z0-9_]+)@([.a-zA-Z0-9_-]+).([a-zA-Z]{2,5})$";
		Pattern pattern12 = Pattern.compile(regex);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\selinium\\driver2\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		 
		
	    driver.get("https://www.desjardinsgeneralinsurance.com/?mca=D&lng=EN&prv=ON");
	    driver.findElement(By.xpath("//input[@id='q_codePostalAuto']")).sendKeys("L4T1H5");
	    driver.findElement(By.xpath("//input[@id='Soumission_GO']")).click();
	    //Your Vehicle
	    //Make
	    WebElement VehMake= driver.findElement(By.id("vehicle_make_1"));
	    Select sceMake = new Select(VehMake);
	    sceMake.selectByVisibleText("FORD");;
	    //Year
	    WebElement VehYear= driver.findElement(By.id("vehicle_year_1"));
	    Select scYear = new Select(VehYear);
	    scYear.selectByVisibleText("2019");
	    
	    //Model
	    WebElement VehModel = driver.findElement(By.id("vehicle_model_1"));
	    Select scModel = new Select(VehModel);
	    scModel.selectByValue("329000");
	    
	    
	    driver.findElement(By.id("annual_km_1")).sendKeys("30,000");
	    driver.findElement(By.id("street_number")).sendKeys("34");
	    //Your Information
	    driver.findElement(By.id("street_name1")).click();
	    Boolean StreetOne =  driver.findElement(By.id("street_name_other")).isDisplayed();
	    System.out.println(StreetOne);
	    driver.findElement(By.id("street_name0")).click();
	    Boolean StreetZero =  driver.findElement(By.id("street_name_other")).isDisplayed();
	    System.out.println(StreetZero );
	    WebElement Patternj =  driver.findElement(By.id("phone_number"));	
        Patternj.sendKeys("437-771-5853");
	    System.out.println(Patternj.getAttribute("value"));
	    if (Patternj.getAttribute("value").matches(regex)) {
		
		  System.out.println("Valid");
	   } else {
          System.out.println("InValid");
	   }
	  WebElement EmailValidCheck =  driver.findElement(By.id("email"));
	   
	  EmailValidCheck.sendKeys("chopra.sahil7@outlook.com");
	  System.out.println( EmailValidCheck.getAttribute("value"));
	  if (EmailValidCheck.getAttribute("value").matches(regexEmail)) {
			
	  System.out.println("Valid");
	  } else {
      System.out.println("InValid");
	  }
	  
	  
//	 ?? Check Radio Button
	Boolean radoCheck =  driver.findElement(By.cssSelector("#email_consent1")).isSelected();
	System.out.println("Not Selected" + radoCheck );
	driver.findElement(By.cssSelector("#email_consent1")).click();
	Boolean rado1Check =  driver.findElement(By.cssSelector("#email_consent1")).isSelected();
	System.out.println("Is Selected" + rado1Check );
	
	
//	WebDriverWait wait = new WebDriverWait(driver, 40);
//    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Get your premium']")));
//	
	
	Boolean GenderCheck  =   driver.findElement(By.id("gender_11")).isSelected();
	System.out.println("Not Selected" + GenderCheck );
	driver.findElement(By.id("gender_11")).click();
	Boolean GenderCheck2  =   driver.findElement(By.id("gender_11")).isSelected(); 
	System.out.println("Not Selected" + GenderCheck2 );
	
	
    WebElement	userName = driver.findElement(By.id("first_name_1"));
    Actions a = new Actions(driver);
    a.sendKeys(userName, "Sahil").build().perform();
    
    WebElement lastName = driver.findElement(By.id("last_name_1"));
	Actions b = new Actions(driver);
	b.sendKeys(lastName, "chopra").build().perform();
	
	
	
	WebElement month = driver.findElement(By.xpath("//select[@id='dob_month_1']"));
    Select select = new Select(month);
    select.selectByValue("08");
    
    
    WebElement	DateOfBorn = driver.findElement(By.id("dob_day_1"));
    Actions ab = new Actions(driver);
    ab.sendKeys(DateOfBorn, "20").build().perform();
    
    WebElement DateOfYear = driver.findElement(By.id("dob_year_1"));
	Actions bc = new Actions(driver);
	bc.sendKeys(DateOfYear, "1984").build().perform();
    
    WebElement maritalStatus =   driver.findElement(By.id("marital_status_1"));
    Select dc = new Select(maritalStatus);
    dc.selectByValue("Single");
	
    
    WebElement LType =   driver.findElement(By.id("license_type_1"));
    Select dcm = new Select(LType);
    dcm.selectByValue("G2");
	
	
    
    WebElement	LAge = driver.findElement(By.xpath("//input[@id='licence_age_1']"));
    Actions la = new Actions(driver);
    la.sendKeys(LAge, "26").build().perform();
    
    
	WebElement DriverYear = driver.findElement(By.id("years_as_principal_driver_1"));
    Select select12 = new Select(DriverYear);
    select12.selectByValue("30");
    
    
	WebElement InsuranceYear = driver.findElement(By.id("loyalty_1"));
    Select select13 = new Select(InsuranceYear );
    select13.selectByValue("3");
    
          
    
    driver.findElement(By.xpath("//input[@value='Get your premium']")).submit();
    
    
    
    
	}

//	private static void FileHandler(File source, File file) throws IOException {
//		 TakesScreenshot ts = ( TakesScreenshot) driver;
//		 File source1  =  ts.getScreenshotAs(OutputType.FILE);
//		 FileHandler.copy( source1 , new File("C:\\Users\\Owner\\workspace12\\Selinium\\src\\CaptureScreenshot"));
//		   
//		
//		
//		
//		// TODO Auto-generated method stub
//		
//	}
	

		
		
		}

