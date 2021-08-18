package Objects;

public class arEmb extends emb implements Cloneable {
	
    
	public arEmb(String s, int num, int hr) {
		this.hour = hr;
		this.name = s;
		this.number = num;
		
	}

	@Override
	public emb shallowcopy() {
	
		return this;
	}

	@Override
	public emb deepcopy() {
		return null;
	}


	

	
}
