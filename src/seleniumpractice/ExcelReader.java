package seleniumpractice;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReader {
	public static ArrayList  getData(String filepath) {
		ArrayList data = new ArrayList();
		DataFormatter df = new DataFormatter();
		try {
			FileInputStream fis = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while (itr.hasNext()) {
				Row row =itr.next();
				Iterator<Cell> cellitr = row.iterator();
				while (cellitr.hasNext()) {
					Cell cell = cellitr.next();
					data.add(df.formatCellValue(cell));
				}
			}
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}