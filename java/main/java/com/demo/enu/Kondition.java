package com.demo.enu;

public enum Kondition{
	NY(1), BEG(2);
	
	int strKondition = 0;
	
	Kondition(int strValue)
	{
		this.strKondition = strValue;
	}
	
	/*
	public static String getKondValue(int strNumber)
	{
		switch (strNumber) 
		{
			case 1:
				return Kondition.NY.toString();		
			case 2:
				return Kondition.NY.toString();
			default:
				return String.format("Number are: "
						,strNumber);
		}
	}*/
}


