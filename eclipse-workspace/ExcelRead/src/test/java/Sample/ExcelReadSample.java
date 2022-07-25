package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadSample {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Users\\admin\\Desktop\\Book1.xlsx";
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		
		int colcount=sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<colcount;j++)
			{
				String value=row.getCell(j).toString();
				System.out.print("  "+value);
			}
			System.out.println();
		}
	}

}
