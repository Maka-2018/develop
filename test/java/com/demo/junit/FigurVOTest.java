package com.demo.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.demo.enu.Farg;
import com.demo.enu.Kondition;
import com.demo.vo.FigurVO;

public class FigurVOTest {

	private FigurVO figurVO;

	@Before
	public void setUp() throws Exception
	{
		this.figurVO = new FigurVO("DATOR", Kondition.BEG, 
				Farg.BLA, 236.20, 15);
	}
	
	@Test
	public void test_getStrKondition_successfull() throws Exception
	{
		final Kondition fixtureKondition = this.figurVO.getStrKondition();
		Assert.assertEquals(fixtureKondition, Kondition.BEG);
	}
	
	@Test
	public void test_setStrKondition_successfull() throws Exception
	{
		this.figurVO.setStrKondition(Kondition.NY);
	}
	
	@Test
	public void test_getStrFarg_successfull() throws Exception
	{
		Farg fixtureFarg = this.figurVO.getStrFarg();
		Assert.assertEquals(fixtureFarg, Farg.BLA);
	}
	
	@Test
	public void test_setStrFarg_successfull() throws Exception
	{
		this.figurVO.setStrFarg(Farg.GRON);
	}
	
	@Test
	public void test_getStrPris_successfull() throws Exception
	{
		this.figurVO.getStrPris();
	}
	
	@Test
	public void test_setStrPris_successfull() throws Exception
	{
		this.figurVO.setStrPris(235.10);
	}
	
	@Test
	public void test_getStrAntal_successfull() throws Exception
	{
		this.figurVO.getStrAntal();
	}
	
	@Test
	public void test_setStrAntal_successfull() throws Exception
	{
		this.figurVO.setStrAntal(5);
	}
	
	@Test
	public void test_getStrName_successfull() throws Exception
	{
		this.figurVO.getStrName();
	}
	
	@Test
	public void test_setStrName_successfull() throws Exception
	{
		this.figurVO.setStrName("STRING");
	}
}
