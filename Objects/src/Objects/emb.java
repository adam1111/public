package Objects;

public abstract  class emb implements Cloneable {

	int number;
	String name  ;
	int hour;
   
	public abstract emb shallowcopy();
	public abstract emb deepcopy();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString(){
    	return this.name + " => " + this.hour + " => " + this .number;
    }
	
	
}
