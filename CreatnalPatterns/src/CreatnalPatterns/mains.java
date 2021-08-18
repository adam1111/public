package CreatnalPatterns;

public class mains 
{
	public static void main(String[] arg)
	{
		
		
     Thread d = new Thread(new Runnable() {
		
		@Override
		public void run() {
		Countter c1 = Countter.getCounter();
		c1.AddOne();
		System.out.println(c1.counter);
		}});
     
     Thread d2 = new Thread(new Runnable() {
 		
 		@Override
 		public void run() {
 		Countter c2 = Countter.getCounter();
 		c2.AddOne();
 		System.out.println(c2.counter);
 		}});
     
     d.start();
     d2.start();
    
	}

}
