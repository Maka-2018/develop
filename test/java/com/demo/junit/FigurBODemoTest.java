package com.demo.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.demo.run.FigurBODemo;

@SuppressWarnings("static-access")
public class FigurBODemoTest {
	
	private FigurBODemo FigurBODemo;
	
	@Before
	public void setUp() throws Exception
	{
		FigurBODemo = new FigurBODemo();
	}
	
	@Test
	public void test_main_successfull() throws Exception
	{
		final String[] exceptedString = new String[] {"",""};
		FigurBODemo.main(exceptedString);
		
		Assert.assertNotNull(FigurBODemo);
	}
	
	@Test
	public void test_displayAllDataFromList_successfull() throws Exception
	{
		final String exceptedString = "Test data";
		FigurBODemo.displayAllDataFromList(exceptedString);		
	}
	
	@After
	public void tearDown() throws Exception
	{
		FigurBODemo = null;
		Assert.assertNull(FigurBODemo);
	}
}
