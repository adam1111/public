package Bulder;

public class Car implements IBulder
{

	Product prod;
	
	Car(String model)
	{
	 
	}
	@Override
	public void start() 
	{
		prod.Add("Starting buld the car \n");	
	}

	@Override
	public void Body() {
		prod.Add("Body is add to the Car \n");
		
	}

	@Override
	public void Whels() {
		prod.Add("Wheels is add now we almoust finish \n");
		
	}

	@Override
	public void Engie() {
		prod.Add("my engine now works \n");
		
	}

	@Override
	public void finsh() {
		prod.Add("Now YOU can run with the car \n");
		
	}

	@Override
	public Product pro() {
		
	 return prod;
	}

}
