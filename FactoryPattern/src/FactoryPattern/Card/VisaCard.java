package FactoryPattern.Card;

import Interfaces.ICard;

public class VisaCard implements ICard {

	@Override
	public String Widthraw() {
		return "You Use Visa Card ";
	}
	public String toString() 
	{
		return "You Use Visa Card ";
	}

}
