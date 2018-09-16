package com.demo.bo;

import java.util.LinkedList;
import java.util.List;

import com.demo.dao.FigurDao;
import com.demo.data.FigurData;
import com.demo.vo.FigurVO;

public class FigurBO implements FigurDao{

	private List<FigurVO> listFigurVO;

	public FigurBO()
	{
		this.listFigurVO = new LinkedList<FigurVO>();
	}
	
	public List<FigurVO> getListaFigurVO()
	{
		return this.listFigurVO;
	}
	public void setListaFigurVO(List<FigurVO> strLista)
	{
		this.listFigurVO = strLista;
	}
	
	@Override
	public List<FigurVO> getAllDataInformation(FigurData data) {
		// TODO Auto-generated method stub
		List<FigurVO> allResult = new LinkedList<>();		
		allResult.addAll(data.showAllDataInformation());

		allResult.stream().forEach((figurVO) ->
		{
			this.listFigurVO.add(figurVO);
		});		
		return this.listFigurVO;	
	}
	
	public void hamtaGrupperingAvKonditionData(String strKonditionData)
	{
		 final FigurData data = new FigurData();
		 data.getAntalKonditionData(strKonditionData);
	}
	
	public String hamtaGrupperingAvFargData(String strFargData)
	{
		 final FigurData data = new FigurData();
		 data.getAntalFargData(strFargData);
		 
		 return null;
	}

}

