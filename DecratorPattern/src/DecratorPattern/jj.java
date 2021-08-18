package DecratorPattern;

public class jj {

	public static void main(String[] args) {
	MobileSms sms = new ConcrateSms();
	DecratorSms dr = new BehevorDecrator();
	dr.Setservce(sms);
	System.out.println(dr.SendSms(11, "0101010", "hello there"));

	}

}
