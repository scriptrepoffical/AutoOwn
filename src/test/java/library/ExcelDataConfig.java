package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig
{
	public XSSFWorkbook wb;
	public XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelPath) throws IOException
	{
		try 
		{
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}
	
	
	public String getData(String SheetName,int row, int colNum)
	{
		sheet1 = wb.getSheet(SheetName);
		String data = sheet1.getRow(row).getCell(colNum).getStringCellValue();
		return data;
	}
	
	
	
	

}
