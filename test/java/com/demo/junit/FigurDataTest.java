package com.demo.junit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.demo.data.FigurData;
import com.demo.enu.Farg;
import com.demo.enu.Kondition;
import com.demo.vo.FigurVO;

public class FigurDataTest {

	private FigurData figurData;

	@Before
	public void setUp() throws Exception
	{
		this.figurData = new FigurData();
	}
	
	@Test
	public void test_getAllDataInformation_successfull() throws Exception
	{				
		final List<FigurVO> fixtureExcepted = this.figurData.showAllDataInformation();
		
		for (FigurVO figurVO : fixtureExcepted) 
		{
			System.out.println(figurVO.getStrName()+"\t"+figurVO.getStrKondition()
			+"\t"+figurVO.getStrFarg()+"\t"+figurVO.getStrPris()
			+"\t"+figurVO.getStrAntal());		
		}	
		
		assertEquals(7, fixtureExcepted.size());
		assertEquals(13, fixtureExcepted.get(1).getStrAntal());
		assertEquals(Farg.BLA, fixtureExcepted.get(1).getStrFarg());
		assertEquals(Kondition.BEG, fixtureExcepted.get(1).getStrKondition());
		
	}

	@Test
	public void test_hamtaGrupperingAvKonditionData_successfull() throws Exception
	{
		this.figurData.getAntalFargData(new String());
	}
	
	@Test
	public void test_hamtaGrupperingAvFargData_successfull() throws Exception
	{
		this.figurData.getAntalKonditionData(new String());		
	}
	
	@Test
	public void test_displayAntalKonditionData_successfull() throws Exception
	{
		this.figurData.displayAntalKonditionData("TEST TV\n");		
		assertNotNull(this.figurData);
	}

	@After
	public void tearDown() throws Exception
	{
		this.figurData = null;
		assertNull(this.figurData);
	}
}
