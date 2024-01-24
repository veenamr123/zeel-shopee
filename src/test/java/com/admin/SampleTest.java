package com.admin;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups="smoke")
	public void demo1Test()
	{
		System.out.println("----a1--");
	}
	
	@Test(groups= {"smoke","regression"})
	public void demo2Test()
	{
		System.out.println("----a2----");
	}

}
