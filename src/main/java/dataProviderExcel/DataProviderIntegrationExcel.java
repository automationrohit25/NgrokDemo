package dataProviderExcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIntegrationExcel {
	
	@Test(dataProvider = "driveTest")
	public void testcaseData() {
		
	}

	
	@DataProvider(name="driveTest")
	public Object[][] getData() throws Exception{
		
//		Object[][] data = {{"hello", "text","1"},{"bye", "mesage", "143"},{"solo", "call", "453"}};
//		return data;
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rohit\\Desktop\\exceldriven .xlsx");
//		XSSFWorkbook
		return null;
		
		}
	}

