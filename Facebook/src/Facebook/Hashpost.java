package Facebook;

public class Hashpost extends Post 
{
 
	public String Createpost(dbPost db, String s)
	{
		String r = db.addhashPost(s);
		return r;
	}
}
