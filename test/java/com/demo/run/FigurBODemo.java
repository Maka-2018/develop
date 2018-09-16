package com.demo.run;

import java.util.List;

import com.demo.bo.FigurBO;
import com.demo.data.FigurData;
import com.demo.vo.FigurVO;

public class FigurBODemo{
	
	public static void main(String[] args)
	{
		FigurBO strFigurBO = new FigurBO();
		List<FigurVO> result = strFigurBO.getAllDataInformation(new FigurData());
		
		displayAllDataFromList("\n\tRapport av inventering");
		displayAllDataFromList("---------------------------------------------------------------------");
		displayAllDataFromList("Namn\tKond\tFarg\tPris*\tAntal");
		displayAllDataFromList("---------------------------------------------------------------------");	
		
		for (FigurVO figurVO : result) 
		{
			displayAllDataFromList(figurVO.getStrName()+ "\t"+figurVO.getStrKondition()
			+"\t"+figurVO.getStrFarg()+"\t"+figurVO.getStrPris()
			+"\t"+figurVO.getStrAntal());		
		}		
		displayAllDataFromList("---------------------------------------------------------------------");	
		displayAllDataFromList("*)Pris per stycken");

		strFigurBO.hamtaGrupperingAvKonditionData("\n\n\tGruppering enligt Kondition");
		
		strFigurBO.hamtaGrupperingAvFargData("\n\n\tGruppering enligt Fargstyp");	
	}
	
	public static void displayAllDataFromList(String strTestData)
	{
		System.out.println(strTestData);
	}
	
}


