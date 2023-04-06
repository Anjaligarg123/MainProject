package com.Lim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipleDataintoExcelTest {
	static Scanner sc;
	public static void main(String[] args) throws Throwable {
		sc=new Scanner(System.in);
		System.out.println("enter the data count");
		int n=sc.nextInt();
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\file.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	System.out.println("enter the"+n+"cell value");
	Sheet sh=wb.getSheet("Sheet2");
	for(int i=0;i<=n;i++)
	{
		String data=sc.nextLine();
		sh.createRow(i).createCell(0).setCellValue(data);
	}
	FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\file.xlsx");
	wb.write(fos);
	wb.close();

	

}
}
