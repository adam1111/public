package Bulder;

import java.util.ArrayList;

public class Product 
{
String s= "";
ArrayList<String> ar = new ArrayList();

void Add(String s){ ar.add(s);}


public String toString(){
	for(String c : ar)
     s+= " "+c;
	return s;
}

}
