package Sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static XSSFSheet sh;
	public static  FileInputStream f;
	public static XSSFWorkbook w;
	public static void main(String[] args)throws IOException
	{
		f=new FileInputStream("C:\\Users\\admin\\Desktop\\Book11.xlsx");
		w=new XSSFWorkbook(f);
		
		sh=w.getSheet("Sheet1");
		Row r=sh.getRow(0);
		Cell c=r.getCell(1);
		System.out.println(c);
		
		
		for(Row ro:sh)
		{
			for(Cell co:ro)
			{
				System.out.print(co+ " ");
			}
			System.out.println("   ");
		}
		
		}

}
