package data_driven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTest {
	public static void main(String[] args) throws InvalidFormatException, IOException {

		File f = new File("C:\\Users\\user\\eclipse-workspace\\Task_maven\\DataSingle\\Testcase.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

		Sheet sheetAt = wb.getSheetAt(0);

		int lastRowNum = sheetAt.getLastRowNum();

		for (int i = 1; i <= lastRowNum; i++) {
			Row row = sheetAt.getRow(i);
			short cellNum = row.getLastCellNum();

			for (int j = 1; j <= cellNum; j++) {
				Cell cell = row.getCell(j);
				org.apache.poi.ss.usermodel.CellType cellType;

				if (cell != null) {

					cellType = cell.getCellType();

					if (cellType.equals(CellType.NUMERIC)) {

						int numericCellValue = (int) cell.getNumericCellValue();
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

	}

}
