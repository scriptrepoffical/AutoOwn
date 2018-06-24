package code;

import org.testng.annotations.Test;

public class VariableArguments
{
	
	@Test
	public void displayData()
	{
		varArgumentData("Hi");
		varArgumentData("Hello","World");
		varArgumentData("Super","Duper","Hit");
		
	}
	
	public void varArgumentData(String...str)
	{
		for(String s : str)
		{
			System.out.println("Value of s is -> "+s);
		}
		System.out.println("**********************************");
	}
	
	public void addOneMethod()
	{
		System.out.println("Aded one more method");
	}
	
	

}
