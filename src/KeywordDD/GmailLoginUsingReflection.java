package KeywordDD;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GmailLoginUsingReflection {

	LoginKeywords keys = new LoginKeywords();
	Method[] methods =keys.getClass().getMethods();
	@Test
	public void LoginTest() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		//LoginKeywords keys = new LoginKeywords();
		FileInputStream fi = new FileInputStream("D:\\aditya\\Selenium\\src\\Excelinputfiles\\New Microsoft Office Excel Worksheet.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r = row.next();
			String action =r.getCell(3).getStringCellValue();
			ExecuteMethods(action);
		}
	}
		public void ExecuteMethods(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException 
		{
			
		
			
			for (int i = 0; i < methods.length; i++)
			{
			 if (action.equals(methods[i].getName())) 
			 {
				methods[i].invoke(keys);
				break;
			 }	
			}
	}
		
		
}
