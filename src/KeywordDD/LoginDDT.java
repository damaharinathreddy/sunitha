package KeywordDD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginDDT {
@Test
	public void test() throws IOException, InterruptedException
	{
		LoginKeywords keys = new LoginKeywords();
		FileInputStream fi = new FileInputStream("D:\\aditya\\Selenium\\src\\Excelinputfiles\\New Microsoft Office Excel Worksheet.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r = row.next();
			String action = r.getCell(3).getStringCellValue();
			if(action.equals("launtchBrowser"))
			{
				keys.LauntcBrowser();
			}
			else if (action.equals("navigate"))
			{
				keys.Navigate();
			}
			else if(action.equals("enterUserName"))
			{
				keys.EnterUserName();
			}
			else if(action.equals("clicknext"))
			{
				keys.Clicknext();
			}
			else if(action.equals("enterpassword"))
			{
				keys.EnterPassword();
			}
			else if(action.equals("clicklogin"))
			{
				keys.ClickiLogin();
			}
			
		}
		
	}
}
