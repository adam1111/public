package FactoryPattern;

import java.util.Scanner;

import Interfaces.IBank;
import Interfaces.ICard;

public class mr {

	public static void main(String[] args) {
	 FactoryBank a = new FactoryBank();
     IBank s = a.Switch("123456");
     s.Widthraw();
     System.out.println(s);
     
     ICard card = a.Swit("123");
     card.Widthraw();
     System.out.println(card);
	}

}
