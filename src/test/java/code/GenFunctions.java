package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GenFunctions
{
	
	@Test
	public void test1()
	{
		System.out.println("Hello World");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(df.format(now));
	}
	
	@Test
	public void readExcel() throws IOException
	{
		File src = new File("C:\\Users\\Sanjay\\Conexus Automation\\DataForTesting\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetName = wb.getSheet("uName");
		String celValue = sheetName.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel -- "+celValue);
		wb.close();
		
		
		
		
		
	}

}
