package excel.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	public static void main(String [] args) throws IOException {
		
		FileInputStream fil = new FileInputStream("D:\\Selenium\\DataDemo.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fil);
		
		int sheet = book.getNumberOfSheets();
		for (int i = 0; i < sheet; i++) {
			if(book.getSheetName(i).equalsIgnoreCase("testdate")) {
				XSSFSheet sheets = book.getSheetAt(i);
				
				Iterator<Row> rows = sheets.iterator();
				Row firstrow = rows.next();
				
				Iterator<Cell> cell = firstrow.cellIterator();
				cell.next();
				
				
			}
		}
	}

}
