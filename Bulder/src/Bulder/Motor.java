package Bulder;

public class Motor implements IBulder 
{
	Product prod;
	Motor(String Model)
	{
		prod = new Product();
		prod.Add(Model);	
	}
	@Override
	public void start() 
	{
		prod.Add("Starting build the motosecl \n");	
	}

	@Override
	public void Body() {
		prod.Add("Body is add to the motosecl \n");
		
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
		prod.Add("Now YOU can run with the motosecl \n");
		
	}

	@Override
	public Product pro()
	{
		return prod;
	}


}
