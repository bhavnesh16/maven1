package mavenprogram.mavenprogram;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class exceldataTest 
{
@Test
public void getCellData() throws IOException
{
	FileInputStream ExcelFile = new FileInputStream("C:\\Users\\bhakumar\\Desktop\\dataprovider.xlsx");
	XSSFWorkbook ExcelWBook=new XSSFWorkbook(ExcelFile);
	//FileOutputStream fo=new FileOutputStream("C:\\Users\\bhakumar\\Desktop\\dataprovider.xlsx");
	//FileWriter fw=new FileWriter(ExcelFile);
	XSSFSheet ExcelWSheet=ExcelWBook.getSheetAt(0);
	XSSFRow row; 
	XSSFCell cell;
	int totalRows = ExcelWSheet.getPhysicalNumberOfRows();
	for(int i=0;i<totalRows;i++)
	{
		row=ExcelWSheet.getRow(i);
		int c=row.getPhysicalNumberOfCells();
		for(int j=0;j<c;j++)
		{
			cell=row.getCell(j);
			if(cell.getCellType()==1)
			{
			System.out.print(cell.getStringCellValue()+ "   ");
			}
			else if(cell.getCellType()==0)
			{
			System.out.print(cell.getNumericCellValue()+ "   ");
			}
			else if(cell.getCellType()==4)
			{
			System.out.print(cell.getBooleanCellValue()+ "   ");
			}
		}
		System.out.println();
	}
}
@Test
public void putCellData() throws IOException
{
	FileOutputStream fo=new FileOutputStream("C:\\Users\\bhakumar\\Desktop\\dataprovider.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet s1=wb.getSheet("Sheet1");
	XSSFRow r1=s1.getRow(0);
	XSSFCell c1=r1.getCell(4);
	c1.setCellValue("Pass");
	wb.write(fo);
	wb.close();
}
}
 