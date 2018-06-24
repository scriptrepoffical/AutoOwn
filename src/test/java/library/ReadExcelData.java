package library;

import java.io.IOException;

import org.testng.annotations.Test;

public class ReadExcelData 
{
	
	@Test
	public void readData() throws IOException
	{
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Sanjay\\Conexus Automation\\DataForTesting\\ExcelData.xlsx");
		
		System.out.println(excel.getData("uName", 0,1));
	}

}
