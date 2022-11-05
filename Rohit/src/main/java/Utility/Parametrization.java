package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

public static String getsheetdata(String Sheet, int cell, int row) throws EncryptedDocumentException, IOException {
FileInputStream file = new FileInputStream("C:\\Users\\Rohit Ombase\\Desktop\\Workspace\\Rohit\\src\\test\\resources\\testingData.xlsx");
String Value = WorkbookFactory.create(file).getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
return Value;
}
}
