package com.Lim;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataFromExcelTest {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\file.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row row=sh.getRow(1);
		Cell cel=row.getCell(0);
		String value=cel.getStringCellValue();
		System.out.println(value);
		

	}

}
