package DecratorPattern;

public class ConcrateSms extends MobileSms{

	@Override
	String SendSms(int id,String num, String massage) {
	 return "#" + id +"your massege sent to " + num  ;
	}

}
