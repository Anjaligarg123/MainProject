package com.Lim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\file.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int count=sh.getLastRowNum();
		for(int i=0;i<=count;i++)
		{
			String org=sh.getRow(i).getCell(0).getStringCellValue();
			String loc=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(org+" "+loc);
		}

	}

}
