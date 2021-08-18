package FactoryPattern;

import Interfaces.IBank;

public class BankB2 implements IBank{

	@Override
	public String Widthraw() {
		return "Now you Process in Bank B ";
	}
	public String toString()
	{
		return "Now you Process in bank B";
	}


}
