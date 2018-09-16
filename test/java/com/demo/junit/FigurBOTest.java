package com.demo.junit;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.demo.bo.FigurBO;
import com.demo.data.FigurData;
import com.demo.enu.Farg;
import com.demo.vo.FigurVO;


public class FigurBOTest {
	
	private FigurBO figurBO;

	@Before
	public void setUp() throws Exception
	{
		this.figurBO = new FigurBO();
	}
	
	@Test
	public void test_getListaFigurVO_successfull() throws Exception
	{
		final List<FigurVO> fixtureExcepted = this.figurBO.getListaFigurVO();
		assertEquals(0, fixtureExcepted.size());
	}
	
	@Test
	public void test_setListaFigurVO_successfull() throws Exception
	{
		final List<FigurVO> fixtureExcepted = new LinkedList<FigurVO>();
		this.figurBO.setListaFigurVO(fixtureExcepted);
		assertNotNull(this.figurBO);
	}
	
	@Test
	public void test_getAllDataInformation_successfull() throws Exception
	{
		final FigurData figurData = new FigurData();
		
		final List<FigurVO> fixtureExcepted = this.figurBO.getAllDataInformation(figurData);
		
		for (FigurVO figurVO : fixtureExcepted) 
		{
			System.out.println(figurVO.getStrName()+ "\t"+figurVO.getStrKondition()
			+"\t"+figurVO.getStrFarg()+"\t"+figurVO.getStrPris()
			+"\t"+figurVO.getStrAntal());		
		}	
		
		assertEquals(7, fixtureExcepted.size());
		assertEquals(13, fixtureExcepted.get(1).getStrAntal());
		assertEquals(Farg.BLA, fixtureExcepted.get(1).getStrFarg());
		
		List<FigurVO> fixtureActual = this.figurBO.getAllDataInformation(new FigurData());
		
		assertEquals(13, fixtureActual.get(1).getStrAntal());
		assertEquals(Farg.GRON, fixtureActual.get(4).getStrFarg());		
		assertEquals(fixtureExcepted.get(1).getStrAntal(), fixtureActual.get(1).getStrAntal());
		
	}

	@Test
	public void test_hamtaGrupperingAvKonditionData_successfull() throws Exception
	{
		this.figurBO.hamtaGrupperingAvKonditionData("\nKondition");
		assertNotNull(this.figurBO);
	}
	
	@Test
	public void test_hamtaGrupperingAvFargData_successfull() throws Exception
	{
		this.figurBO.hamtaGrupperingAvFargData("\nFargstyp");
		assertNotNull(this.figurBO);
	}

	@After
	public void tearDown() throws Exception
	{
		this.figurBO = null;
		assertNull(this.figurBO);
	}
}


