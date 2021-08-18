package AdabterPattern;

public class hr {

	public static void main(String[] args) 
	{
		Maneger mr = new Maneger();
		mr.setSalary(4000);
		mr.setBouns(1.8);
		AdabterCalc adclc = new AdabterCalc();
		adclc.claculater(mr);
    Emploee e = new Emploee();
    e.setBouns(1.5);
    e.setSalary(2000);
    CalculaterSalry clc = new CalculaterSalry();
    clc.claculater(e);
	}
}
