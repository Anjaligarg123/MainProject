package com.Lim;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	SoftAssert sa=new SoftAssert();
	@Test
	public void test() {
		
		
		System.out.println("------testscript-01----");
		System.out.println("------testscript-02----");
		 sa.assertEquals("testyantra","qspider");
		System.out.println("------testscript-03----");
		sa.assertAll();
	}
	@Test
	public void test1() {
		//SoftAssert s=new SoftAssert();
		int a=10;
		System.out.println("------testscript-04----");
		System.out.println("------testscript-05----");
		sa.assertNull(a);
		System.out.println("------testscript-06----");
		sa.assertAll();
	}

}
