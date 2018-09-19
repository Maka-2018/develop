package com.demo.vo;

import com.demo.enu.*;
public abstract class Figur{

	private Farg farg;
	private int antalItem;
	private String namnProdukt;
	private double prisStyck;
	private Kondition kondition;

	/*
	 * The class is defined as abstract because it can be called from 
	 * another classes.
	 */
	
	public Figur(String strName, Kondition strKondition, 
			Farg strFarg, double strPris, int strAntal)
	{
		this.farg = strFarg;
		this.namnProdukt = strName;
		this.prisStyck = strPris;
		this.antalItem = strAntal;
		this.kondition = strKondition;
	}

	protected Kondition getKondition(){
		return this.kondition;
	}
	protected void setKondition(Kondition strKondition)
	{
		this.kondition = strKondition;
	}
	protected Farg getFarg(){
		return this.farg;
	}
	protected void setFarg(Farg strFarg){
		this.farg = strFarg;
	}
	protected double getPris() {
		return prisStyck;
	}
	protected void setPris(double pris) {
		this.prisStyck = pris;
	}
	protected int getAntalItem() {
		return antalItem;
	}
	protected void setAntalItem(int antalItem) {
		this.antalItem = antalItem;
	}
	protected String getNameVara() {
		return namnVara;
	}
	protected void setNameVara(String nameVara) {
		this.namnVara = nameVara;
	}
	
}

