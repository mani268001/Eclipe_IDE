package data_driven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Colum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\user\\eclipse-workspace\\Task_maven\\DataSingle\\Testcase.xlsx");

		FileInputStream fi = new FileInputStream(f);		

		Workbook wk = new XSSFWorkbook(fi);

		Sheet sheetAt = wk.getSheetAt(0);

		int lastRowNum = sheetAt.getLastRowNum();

		for (int i = 1; i <= lastRowNum; i++) {

			Row row = sheetAt.getRow(i);

			Cell cell = row.getCell(7);

			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();
				System.out.println(numericCellValue);

			} else if (cellType.equals(CellType.STRING)) {

				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			}
			{

			}

		}

		
		
		
		
		
		
		
		
	}

}
