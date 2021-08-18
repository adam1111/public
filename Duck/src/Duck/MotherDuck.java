package Duck;

public abstract class MotherDuck 
{
	private int id;
	private String name;
    private int counter = 0;
    protected Behevior be;
    MotherDuck()
    {
    	this.id = ++counter;
    	this.name = "Duck #"+id;
    	this.be = new FlyWithWings();
    }
    
    public abstract String dis();
    public String swim() 
    {
    	return "Hi Iam Swimmer";
    }
    
    public void informat() 
    {
    	System.out.println("hi iam "+ this.name);
    	System.out.println(swim());
    	System.out.println(dis());
    	System.out.println(be.fly());
    }
}
