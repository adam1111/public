package FactoryPattern;

import FactoryPattern.Card.MasterCard;
import FactoryPattern.Card.VisaCard;
import Interfaces.IBank;
import Interfaces.IBankFactory;
import Interfaces.ICard;
import Interfaces.ICardFactory;

public class FactoryBank implements IBankFactory,ICardFactory
{

	
	@Override
	public IBank Switch(String s)
	{
	    IBank bank;
		switch (s) {
		case "111111": bank = new BankA1(); return bank;
		case "123456": bank = new BankB2(); return bank;
		}
   return null;
}
	@Override
	public ICard Swit(String s) {
		ICard card;
		if(s.equals("123")) 
		{
		card = new MasterCard();
		return card;
		}else if(s.equals("111")) 
		{
			card = new VisaCard();
			return card;
		}
		return null;
	}
	
	
}
