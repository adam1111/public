package Duck;

public class gameDuck extends MotherDuck
{

	gameDuck()
	{
		super();
		this.be = new FlyNoFly();
	}

	@Override
	public String dis() {
		// TODO Auto-generated method stub
		return "iam l3ba ";
	}

}
