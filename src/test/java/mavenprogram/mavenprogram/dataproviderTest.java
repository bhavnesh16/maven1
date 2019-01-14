package mavenprogram.mavenprogram;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.excelutill;
public class dataproviderTest<XSSFWorkbook> 
{
	WebDriver driver ;
	@Test(dataProvider="SearchProvider")
	public void dataprovide1(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='nav-a nav-a-2'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys(username);;
        driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
        driver.findElement(By.xpath("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys(password);
        driver.findElement(By.xpath("(//*[@class='a-button-input'])[1]")).click();
	}
	 @DataProvider(name="SearchProvider")
	    public Object[][] getDataFromDataprovider() throws Exception
	 {
		 Object[][] testObjArray=excelutill.getTableArray("C:\\Users\\bhakumar\\Desktop\\dataprovider.xlsx","Sheet1");
		 return (testObjArray);
	 } 	
	 /*XSSFSheet ExcelWSheet;
	 XSSFWorkbook ExcelWBook;
	 XSSFCell Cell;
	 XSSFRow Row;
	 
	   public void excel1() throws Exception
	 {
		FileInputStream inputStream = new FileInputStream("C:\\Users\\bhakumar\\Desktop\\dataprovider.xlsx");
		ExcelWBook = new XSSFWorkbook(inputStream);
		//ExcelWSheet = ExcelWBook.getSheet(SheetName);

		
	 }*/
}
