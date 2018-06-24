package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class UExcel 
{
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static FileInputStream fis;
		
	
	@Test
	public void readExcel() throws IOException
	{
		File src = new File("C:\\Users\\Sanjay\\Conexus Automation\\DataForTesting\\ExcelData.xlsx");
		fis = new FileInputStream(src);
		/*
		String data1_1 = getCellData(1,1);
		System.out.println(data1_1);
		
		String data0_0 = getCellData(0,0);
		System.out.println(data0_0);
		
		String setCellData = setCellData(0,0);
		System.out.println(setCellData);
		*/
	}
	
	public void getLastRowNum(String excelPath,String sheetName)
	{
		
		
	}
	
	public String getCellData(String excelPath,String sheetName,int rowNum, int colNum) throws IOException
	{
		File src = new File(excelPath);
		fis = new FileInputStream(src);
		
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(sheetName);
		
		return ws.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
	
	public String setCellData(int rowNum, int colNum) throws IOException
	{
		File src = new File("C:\\Users\\Sanjay\\Conexus Automation\\DataForTesting\\ExcelData.xlsx");
		fis = new FileInputStream(src);
		
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet("uName");
		ws.getRow(rowNum).getCell(colNum).setCellValue("From Excel");
		
		return ws.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
	
}
