package Facebook;

import java.util.ArrayList;
import java.util.List;

public class trys {

	public static void main(String[] args) {
		
		Post post = null;
		ArrayList<String> ls = new ArrayList();
		ls.add("hello man");
		ls.add("@hello man");
		ls.add("#hello man ");
		dbPost db = new dbPost();
		for (String string : ls)
		{
		if(string.startsWith("@")) 
		{
		 post = new Taggedpost();
		}else if(string.startsWith("#")) 
		{
			post = new Hashpost();
		}else 
		{
	     post = new OrgnalPost();		
		}	
		String s = post.Createpost(db, string); 
		System.out.println(s);
		}
		
	}

}
