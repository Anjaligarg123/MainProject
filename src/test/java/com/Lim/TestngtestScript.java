package com.Lim;

import org.testng.annotations.Test;

public class TestngtestScript {
	@Test(invocationCount=3,dependsOnMethods ={"write","delete"},priority = -1)
	public void create()
	{
		System.out.println("-------create--------");
	}
	
	@Test
	public void write() {
		System.out.println("-------write--------");
	}
	@Test(priority=-1)
	public void delete() {
		System.out.println("------delete------");
	}

}
