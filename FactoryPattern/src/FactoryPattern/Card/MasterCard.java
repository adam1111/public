package FactoryPattern.Card;

import Interfaces.ICard;

public class MasterCard implements ICard{
   @Override
   public String Widthraw() {
		return "You Use Master Card ";
	}
   
   
	@Override
	public String toString() 
	{
		return "You Use Master Card ";
	}
}
