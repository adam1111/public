package Bulder;

public class dgree {

	public static void main(String[] args) {
		Car c = new Car("firrary");
		Motor m = new Motor(" B M W ");
		Product pr = m.pro();
		Product g = c.pro();
		new Consrain(c);
		new Consrain(m);
	    System.out.println(g);
	    System.out.println(pr);

	}

	

}
