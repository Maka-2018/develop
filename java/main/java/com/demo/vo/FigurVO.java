package com.demo.vo;

import com.demo.enu.*;

public class FigurVO extends Figur{

	public FigurVO(String name, Kondition strKondition, 
			Farg strFarg, double pris, int antal)
	{
		super(name, strKondition, strFarg, pris, antal);
	}

	public Kondition getStrKondition()
	{
		return this.getKondition();
	}
	public void setStrKondition(Kondition strKondition)
	{
		this.setKondition(strKondition);
	}
	public Farg getStrFarg()
	{
		return this.getFarg();
	}
	public void setStrFarg(Farg strFarg)
	{
		this.setFarg(strFarg);
	}
	public String getStrName()
	{
		return this.getNameVara();
	}
	public void setStrName(String name)
	{
		this.setNameVara(name); 
	}
	public double getStrPris()
	{
		return this.getPris();
	}
	public void setStrPris(double strPris)
	{
		this.setPris(strPris); 
	}
	public int getStrAntal()
	{
		return this.getAntalItem();
	}
	public void setStrAntal(int strAntal)
	{
		this.setAntalItem(strAntal); 
	}
}


