package data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public  String[][] readExcel(String excelName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wbook=new XSSFWorkbook("./data/"+excelName+".xlsx"); 
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		XSSFRow row = sheet.getRow(0);
		int columnCount = row.getLastCellNum();
		System.out.println(columnCount);
		String[][] data=new String[rowcount][columnCount];
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j = 0; j <columnCount; j++) {
				XSSFCell cell = row2.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
			}
		}
		wbook.close();
		return data;


	}

}
