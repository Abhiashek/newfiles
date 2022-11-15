package excelfiles;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Exccelfilesprogramm1 {
	public static void main(String[] args) throws IOException {
String path = "D:\\selenium\\Screenshotfolder\\ExcelFolder\\sausedemologin.xlsx";		//file open -read
		FileInputStream file = new FileInputStream(path);  //exception1
		
		//workbook read	
		XSSFWorkbook wb = new XSSFWorkbook(file);          //exception 2
		
		//sheet read
		//XSSFSheet sht = wb.getSheet("pp");		
//		//row read
		String rw = wb.getSheet("pp").getRow(0).getCell(0).getStringCellValue(); 
//		//cell read
		//XSSFCell cl = rw.getCell(1);      //cell0
		//data read
		//Double result = cl.getNumericCellValue();
		System.out.println(rw);
		
		//numeric value for
//		double rw = wb.getSheet("pp").getRow(0).getCell(1).getNumericCellValue(); 
//		int res=(int)rw;
//		System.out.println(res);

	}

}
