package Objects;

public class aw {

	public static void main(String[] args) throws CloneNotSupportedException {
		emb c = new arEmb("Hassan", 01010, 4);
	    emb opp = (arEmb) c.shallowcopy();
	    System.out.println(c);
	    System.out.println(opp);

        
	}

}
