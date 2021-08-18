package AdabterPattern;

public class AdabterCalc extends CalculaterSalry
{
	
Emploee emp;	
	

public void claculater(Maneger mr) 
{
	emp = new Emploee();
	emp.setSalary(mr.getSalary());
	emp.setBouns(mr.getBouns());
	super.claculater(emp);
}

}
