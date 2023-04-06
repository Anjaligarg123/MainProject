package com.Lim;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidertest {
	@Test(dataProvider="data")
	public void getData(String src, String dst) {
		System.out.println("from----->"+src+" to---->"+dst);
	}
	@DataProvider	
	public Object[][] data() {
Object[][] obj=new Object[3][2];
obj[0][0]="qspider";
obj[0][1]="testyantra";

obj[1][0]="jspider";
obj[1][1]="client";

obj[2][0]="python";
obj[2][1]="data";

return obj;

}
}
