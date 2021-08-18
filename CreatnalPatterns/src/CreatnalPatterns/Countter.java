package CreatnalPatterns;

public class Countter
{

	int counter = 0;
	private  Countter(){}
	static Object cd = new Object();
	private static Countter c =new Countter();
	public static Countter getCounter() 
	{
		
		synchronized (c) {
		return c;
		}
	}
	
	public void AddOne() 
	{
		counter++;
	}
	
}
