package com.admin;

import org.testng.annotations.Test;

public class SampleTest {
	


	@Test(groups= {"smoke","regression"})
	public void sampleTest()
	{
		System.out.println("----a2----");
	}
	
	@Test(groups= {"smoke","regression"})
	public void sample2Test()
	{
		System.out.println("----a4----");
	}

	
}
