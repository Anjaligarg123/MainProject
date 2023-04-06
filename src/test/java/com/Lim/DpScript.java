package com.Lim;

import org.testng.annotations.Test;

public class DpScript {
	
	@Test(dataProviderClass =DpData.class,dataProvider = "data" )
	public void getData(String src, String dst) {
		System.out.println("from----->"+src+" to---->"+dst);
	}

}
