package mavenprogram.mavenprogram;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonTest
{
 @Test
 public void amazon()
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     ResourceBundle rb=	 ResourceBundle.getBundle("ResourceObject");
     driver.findElement(By.xpath(rb.getString("sigin"))).click();
 }
}
