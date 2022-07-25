package Project.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {

	public static Object[][] excelRead(String path, String Sheetname) throws IOException, InvalidFormatException {
		Object[][] data;

		FileInputStream inputstream = new FileInputStream(new File(path));
		Workbook wb = WorkbookFactory.create(inputstream);
		Sheet s = wb.getSheet(Sheetname);

		int rowcount = s.getLastRowNum();

		int colcount = s.getRow(0).getLastCellNum();

		data = new Object[rowcount][colcount];

		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j <= colcount - 1; j++) {
				if (!getCellValue(s, 0, j).equals("")) {
					data[i - 1][j] = getCellValue(s, i, j);
				}
			}

		}
		return data;

	}

	private static String getCellValue(Sheet s, int row, int col) {

		String value = "";
		if (s.getRow(row).getCell(col) == null) {
			value = "";
		} else if (s.getRow(row).getCell(col).getCellType() == Cell.CELL_TYPE_STRING) {
			value = s.getRow(row).getCell(col).getStringCellValue();
		}

		else

		{
			s.getRow(row).getCell(col).setCellType(Cell.CELL_TYPE_STRING);
			value = s.getRow(row).getCell(col).getStringCellValue();
		}
		return value;

	}

}
