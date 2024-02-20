package data_driven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
       
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Task_maven\\TestData\\DataSingle.xlsx");

		try {
			FileInputStream fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Workbook wk = new XSSFWorkbook(f);

		Sheet sheetAt = wk.getSheetAt(0);

		Row row = sheetAt.getRow(1);

		Cell cell = row.getCell(1);

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
