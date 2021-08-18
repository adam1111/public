package FactoryPattern;

import Interfaces.IBank;

public class BankA1 implements IBank {

	@Override
	public String Widthraw() 
	{
		
		return "Now you Process in bank A ";
	}
	public String toString()
	{
		return "Now you Process in bank A";
	}

}
