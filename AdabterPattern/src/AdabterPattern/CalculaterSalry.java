package AdabterPattern;

public class CalculaterSalry 
{

	
	public void claculater(Emploee emp)
	{
	double clc = emp.getBouns() * emp.getSalary();
	System.out.println(clc);
	}
}
