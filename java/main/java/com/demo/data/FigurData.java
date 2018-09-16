package com.demo.data;

import java.util.LinkedList;
import java.util.List;

import com.demo.enu.Farg;
import com.demo.enu.Kondition;
import com.demo.vo.FigurVO;

public class FigurData {
	
	private List<FigurVO> listaFigurVO;
		
	public FigurData(){
		
		this.listaFigurVO = new LinkedList<>();
	}

	public List<FigurVO> showAllDataInformation(){
		
		List<FigurVO> listaResultVO = new LinkedList<>();
		
		listaResultVO.add(new FigurVO("DATOR", Kondition.NY, Farg.ROD, 1625.50, 14));
		listaResultVO.add(new FigurVO("TV", Kondition.BEG, Farg.BLA, 350.00, 13));
		listaResultVO.add(new FigurVO("PS5", Kondition.NY, Farg.GRON, 1150.00, 21));
		listaResultVO.add(new FigurVO("IPHONE", Kondition.NY, Farg.BLA, 1650, 22));
		listaResultVO.add(new FigurVO("SAMSUNG", Kondition.BEG, Farg.GRON, 420.00, 16));
		listaResultVO.add(new FigurVO("CYKEL", Kondition.NY, Farg.ROD, 1450.00, 11));
		listaResultVO.add(new FigurVO("IPAD", Kondition.BEG, Farg.GRON, 2050.00, 12));

		listaResultVO.stream().forEach((figurVO) ->
		{
			this.listaFigurVO.add(figurVO);
		});
		
		return this.listaFigurVO;
	}

	public void getAntalKonditionData(String strKonditonTabell){
						
		List<FigurVO> antalResult = showAllDataInformation();	
		int sumNY = 0, sumBEG = 0, sumTotal = 0;
		for (FigurVO figurVO : antalResult) 
		{	
			if (figurVO.getStrKondition() == Kondition.NY) {
				sumNY = sumNY + figurVO.getStrAntal();
			}
			if (figurVO.getStrKondition() == Kondition.BEG){
				sumBEG = sumBEG + figurVO.getStrAntal();
			}
			sumTotal = sumTotal + figurVO.getStrAntal();
		}	
		displayAntalKonditionData(strKonditonTabell+"\n\n\tNY\t"+sumNY + "\n\tBEG\t"
				+sumBEG+"\n\t-------------------\n\tTotal\t"+sumTotal);
	}
	
	public void getAntalFargData(String strFargTabell){
				
		List<FigurVO> antalResult = showAllDataInformation();	
		int sumROD = 0, sumGRON = 0, sumBLA = 0, sumTotal = 0;
		for (FigurVO figurVO : antalResult) 
		{	
			if (figurVO.getStrFarg() == Farg.ROD) {		
				sumROD = sumROD + figurVO.getStrAntal();
			}
			if (figurVO.getStrFarg() == Farg.GRON){
		    	sumGRON = sumGRON + figurVO.getStrAntal();
			}
			if (figurVO.getStrFarg() == Farg.BLA){
		    	sumBLA = sumBLA + figurVO.getStrAntal();
			}
			sumTotal = sumTotal + figurVO.getStrAntal();
		}	
		displayAntalKonditionData("\n"+strFargTabell+"\n\n\tRÖD\t"+sumROD + "\n\tGRÖN\t"
				+sumGRON+"\n\tBLÅ\t"+sumBLA+"\n\t-------------------\n\tTotal\t"+sumTotal);
		
	}
	
	public void displayAntalKonditionData(String strTestData)
	{
		System.out.println(strTestData);
	}
}

