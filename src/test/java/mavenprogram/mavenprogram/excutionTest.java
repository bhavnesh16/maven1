package mavenprogram.mavenprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import org.automationtesting.excelreport.XL;

import overridding.DriverUpdates;
import overridding.testnglistener;

public class excutionTest 
{
@FindBy(name="") WebElement usernameText; 
//@Listeners(testnglistener.class)
@Test
public void amazon()
{
	 System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 EventFiringWebDriver eventdriver=new EventFiringWebDriver(driver);
	 DriverUpdates lister =new DriverUpdates(); 
	 eventdriver.register(lister);
	 eventdriver.manage().window().maximize();
	 eventdriver.get("https://www.amazon.in/");
	 eventdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 String actualurl=driver.getCurrentUrl();
	 String expectedurl="https://www.amazon.in/";
	 Boolean result = false;
	 SoftAssert assertion=new SoftAssert();
	 if(eventdriver.getCurrentUrl().equalsIgnoreCase(expectedurl))
	 {
		 result=true;
	 }
	 assertion.assertTrue(result,"[error - not matching actual url with expected result]");
     boolean result1=false;
         try
         {
        	 eventdriver.findElement(By.xpath("(//*[@class='nav-a nav-a-2'])[1]"));
        	  result1=true;
         }
         catch(Exception e)
         {
         }
      Assert.assertTrue(result1);
}
}
