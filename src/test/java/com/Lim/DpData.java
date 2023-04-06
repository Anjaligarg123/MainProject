package com.Lim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.IPathConstants;

public class DpData {
	
	@DataProvider	
	public Object[][] data() throws Throwable {
ExcelUtility el=new ExcelUtility();

 Object[][] data1 = el.readdataproviderfromexcel("dataprovider");
 return data1;

}
}
