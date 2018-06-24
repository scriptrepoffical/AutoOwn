package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadAllExcelData
{
	
	@Test
	public void readAllData() throws IOException
	{
		File src = new File("C:\\Users\\Sanjay\\Conexus Automation\\DataForTesting\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetName = wb.getSheet("uName");
		int rowCount = sheetName.getLastRowNum();
		System.out.println("Total Count is --> "+rowCount);
		
		for (int i=0;i<=rowCount;i++)
		{
			String data0 = sheetName.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test Data from excel is --> "+data0);
		}
		
		wb.close();
		
	}

}
