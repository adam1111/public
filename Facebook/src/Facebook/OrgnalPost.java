package Facebook;

public class OrgnalPost extends Post {

	@Override
	public String Createpost(dbPost db, String s) {
		String d = db.addPost(s);
		return d;
		
	}

}
