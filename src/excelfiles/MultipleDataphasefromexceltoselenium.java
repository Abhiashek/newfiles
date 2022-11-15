package excelfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleDataphasefromexceltoselenium {
	public static void main(String[]args) throws IOException
	{
	String path="D:\\selenium\\Screenshotfolder\\ExcelFolder\\Multipledata.xlsx";
	FileInputStream file = new FileInputStream(path);
	XSSFWorkbook web = new XSSFWorkbook(file);
	XSSFSheet sht  = web.getSheet("md");
	//sht.getLastRowNum();
	
	for(int i=0;i<=3;i++)
	{
		
		for(int j=0;j<=1;j++)
		{
			XSSFRow rw	=sht.getRow(i);
			XSSFCell cl=rw.getCell(j);
			String result=cl.getStringCellValue();
			System.out.println(result);
			}
	}
//	for(int i=0;i<=sht.getLastRowNum();i++)
//	{
//		XSSFRow rw	=sht.getRow(i);
//		for(int j=0;j<=rw.getLastCellNum();j++)
//		{
//			XSSFCell cl=rw.getCell(j);
//			String result=cl.getStringCellValue();
//			System.out.println(result);
//			}
//	}
	}

}
