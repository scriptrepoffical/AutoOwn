package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDriving
{
	
	@Test
	public void createNewConexion() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanjay\\FinalCad Testing\\ConexusStatus\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smartxconnect.azurewebsites.net/");
		driver.findElement(By.cssSelector("a[href='/Account/Login']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("Conexus.user3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Conexus123$");
		driver.findElement(By.cssSelector("input[value='Sign In']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[title='Conexion']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[title='New Conexion']")).click();
		Thread.sleep(2000);
		
		Xls_Reader xlRead = new Xls_Reader("C:\\Users\\Sanjay\\Conexus Automation\\DataForTesting\\ExcelData.xlsx");
		int count = xlRead.getRowCount("uName");
		System.out.println("Total Number of rows is --> "+count);
		
		System.out.println("Column count is --> "+xlRead.getColumnCount("uName"));
		
		for(int rowCount=2;rowCount<=count;rowCount++)
		{
			String fName = xlRead.getCellData("uName", "FirstName", rowCount);
			System.out.println(fName);
			
			String lName = xlRead.getCellData("uName", "LastName", rowCount);
			System.out.println(lName);
			
			String mName = xlRead.getCellData("uName", "MiddleName", rowCount);
			System.out.println(mName);
			
			System.out.println("\n***********************\n");
			
			driver.findElement(By.id("FirstName")).clear();
			driver.findElement(By.id("FirstName")).sendKeys(fName);
			Thread.sleep(1000);
			
			driver.findElement(By.id("MiddleName")).clear();
			driver.findElement(By.id("MiddleName")).sendKeys(lName);
			Thread.sleep(1000);
			
			driver.findElement(By.id("Name")).clear();
			driver.findElement(By.id("Name")).sendKeys(mName);
			Thread.sleep(1000);
			
		}
		
		
		
		
	}

}
